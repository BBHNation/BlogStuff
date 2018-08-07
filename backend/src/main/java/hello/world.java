package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class world {
    @RequestMapping
    public String index() {
        return "hello world";
    }
}



