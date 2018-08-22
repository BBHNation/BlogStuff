package blog.router;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
public class MainRouter {
    @RequestMapping(value = "/blog/getBlogList", method = RequestMethod.POST)
    public Map<String, Object> getBlogList() {
        Map<String, Object> object = new HashMap<>();
        object.put("code", 200);
        object.put("message", "访问成功");

        Map<String, Object> item = new HashMap<>();
        item.put("blogID", 123);
        item.put("title", "iOS 进阶");
        item.put("subTitle", "子标题");
        item.put("description", "在 iOS 11 发布时，作为其重磅功能之一的 ARKit 就引起了我强烈的兴趣。在最初的 beta 版本放出后，我就第一时间下载更新，并开始研究它的应用方法。借助小时候掌握的建模技能和这么些年来的编程经验，轻松实现了这样的 AR 效果：");
        item.put("dateDescrip", "时间描述");
        item.put("blogImg", "/source/img.png");

        ArrayList<Map<String, Object>> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(item);
        }

        Map<String, Object> wrap = new HashMap<>();
        wrap.put("blogList", arr);
        object.put("data", wrap);
        return object;
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "index";
    }


    @RequestMapping(value = "/blog/getMyInfo", method = RequestMethod.POST)
    public Map<String, Object> myinfo() {
        Map<String, Object> detail = new HashMap<>();
        detail.put("blogName", "白彬涵的博客");
        detail.put("blogEnglishName", "Hancock\'s Blog");
        detail.put("introContent", "我是一个 22 岁的 homeschooler，爱好旅行以及一切富有创造性的事物，尤其是摄影、设计和编程。这个世界就是我的学校。学自己之所想所爱。自由的身心定能使我成为一个一直朝前行走的行者。");
        Map<String, Object> object = new HashMap<>();
        object.put("code", 200);
        object.put("message", "请求成功");
        object.put("data", detail);
        return object;
    }

}
