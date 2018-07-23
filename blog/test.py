# -*- coding:utf-8 -*-
from flask import Flask
import json

app = Flask(__name__)


@app.route('/')
def index():
  return app.send_static_file('index.html')

@app.route('/blog/getBlogList', methods=['POST'])
def getBlogList():
    result = {
        'code': 200,
        'message': '获取列表成功'
    }
    data = {'blogList': [
      {
        'blogId': 123,
        'title': "标题",
        'subTitle': '子标题',
        'description': '内容摘要',
        'publicDate': 1008392398,
        'dateDescrip': '时间描述:例如 一个月前发布',
        'blogImg': '/source/img.png'
      }
    ]}
    result['data'] = data.copy()
    return json.dumps(result)

if __name__ == '__main__':
  app.run()
