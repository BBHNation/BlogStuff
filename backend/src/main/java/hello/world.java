package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class world {
    public static void main(String[] args) {
        System.out.print("hello world");
    }

    @RequestMapping
    public String index() {
        return "hello world";
    }
}



