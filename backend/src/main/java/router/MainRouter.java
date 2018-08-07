package router;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.json.JSONObject;

@RestController
public class MainRouter {
    @RequestMapping(value = "/blog/getBlogList", method = RequestMethod.POST)
    public JSONObject getBlogList() {
        JSONObject object = new JSONObject();
        object.put("code", 200);
        return object;
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String test() {
        return "index";
    }
}
