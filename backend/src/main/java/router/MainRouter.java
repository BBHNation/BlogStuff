package router;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MainRouter {
    @RequestMapping
    public Map getBlogList() {
        return new HashMap();
    }
}
