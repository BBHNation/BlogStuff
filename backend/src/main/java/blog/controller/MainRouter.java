package blog.controller;

import blog.domain.BlogItem;
import blog.domain.Meinfo;
import blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MainRouter {
    @Autowired
    private BlogService blogService;

    @RequestMapping(value = "/blog/getBlogList", method = RequestMethod.POST)
    public Map<String, Object> getBlogList() {
        Map<String, Object> object = new HashMap<>();
        object.put("code", 200);
        object.put("message", "访问成功");


        List<BlogItem> list = blogService.getAllBlogs();
        ArrayList<Map<String, Object>> arr = new ArrayList<>();
        for (BlogItem blog : list) {
            arr.add(blog.toMap());
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
        Meinfo meinfo = new Meinfo();
        Map<String, Object> object = new HashMap<>();
        object.put("code", 200);
        object.put("message", "请求成功");
        object.put("data", meinfo.toMap());
        return object;
    }

}
