package blog.domain;

import java.util.HashMap;
import java.util.Map;

public class Meinfo {
    private String name;
    private String engName;
    private String description;

    public Meinfo() {
        this.name = "白彬涵的博客";
        this.engName = "BBH\'s Blog";
        this.description = "我是一个23岁的iOS工程师，毕业于电子科技大学。喜欢各类技术与数码相关话题。";
    }

    public Meinfo(String name, String engName, String description) {
        this.name = name;
        this.engName = engName;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getEngName() {
        return engName;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("blogName", this.name);
        map.put("blogEnglishName", this.engName);
        map.put("introContent", this.description);
        return map;
    }

}
