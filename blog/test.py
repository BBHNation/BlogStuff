# -*- coding:utf-8 -*-
from flask import Flask
from flask_cors import *
import json

app = Flask(__name__)
CORS(app, supports_credentials=True)


@app.route('/')
def index():
  return app.send_static_file('index.html')

@app.route('/blog/getBlogList', methods=['POST'])
def getBlogList():
    result = {
        'code': 200,
        'message': '获取列表成功'
    }
    item = {
      'blogId': 123,
      'title': "iOS开发进阶",
      'subTitle': '子标题',
      'description': '在 iOS 11 发布时，作为其重磅功能之一的 ARKit 就引起了我强烈的兴趣。在最初的 beta 版本放出后，我就第一时间下载更新，并开始研究它的应用方法。借助小时候掌握的建模技能和这么些年来的编程经验，轻松实现了这样的 AR 效果：',
      'publicDate': 1008392398,
      'dateDescrip': '一个月前发布',
      'blogImg': '/source/img.png'
    }
    data = {'blogList': [
        item, item, item, item, item, item, item, item, item, item
    ]}
    result['data'] = data.copy()

    return json.dumps(result)


@app.route('/blog/getMyInfo', methods=['POST'])
def getMyInfo():
    result = {
        'code': 200,
        'message': '获取信息成功'
    }
    data = {
        'blogName': '白彬涵的博客',
        'blogEnglishName': 'Hancock\'s Blog',
        'introContent': '我是一个 22 岁的 homeschooler，爱好旅行以及一切富有创造性的事物，尤其是摄影、设计和编程。这个世界就是我的学校。学自己之所想所爱。自由的身心定能使我成为一个一直朝前行走的行者。',
    }
    result['data'] = data.copy()
    return json.dumps(result)


if __name__ == '__main__':
    app.debug = True
    app.run()
