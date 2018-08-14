package blog.router;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MainRouter {
    @RequestMapping(value = "/blog/getBlogList", method = RequestMethod.POST)
    public Map<String, Object> getBlogList() {
        Map<String, Object> object = new HashMap<>();
        object.put("code", 200);
        return object;
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String test() {
        return "index";
    }
}
