package com.blog.backend;

import blog.App;
import blog.dao.BlogMapper;
import blog.domain.BlogItem;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Array;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MappingTest {
    @LocalServerPort
    private int port;

    private URL base;

    private HttpHeaders headers = new HttpHeaders();

    private TestRestTemplate template = new TestRestTemplate();

    private Class<Map<String, Object>> clazz;


    @Autowired
    private BlogMapper mapper;

    @Before
    public void setUp() throws MalformedURLException {
        String url = String.format("http://localhost:%d/", port);
        this.base = new URL(url);
        clazz = (Class<Map<String, Object>>)(Class)Map.class;
    }

    @Test
    public void testGetMyInfo() {
        HttpEntity<String> entity = new HttpEntity<>("hello", headers);
        ResponseEntity<Map<String, Object>> responseEntity;
        String finalUrl = this.base.toString() + "blog/getMyInfo";
        responseEntity = template.exchange(finalUrl, HttpMethod.POST, entity, clazz);

        assertEquals(200, responseEntity.getBody().get("code"));
    }

    @Test
    public void testInsertBlog() {
        mapper.insert("标题", "副标题", "总结", "主要内容", "一小时以前");
    }

    @Test
    public void testInsertRealBlog() {
        String summary = "在一年多前微信刚刚推出小程序的时候我是很感兴趣的，早早下载了它的开发工具来研究，可是后来发现微信却不允许个人开发者自己发布小程序，我的开发计划便不了了之了。";
        String content = "# Blog的搭建和Git的优化\n" +
                "#PROGRAMING/FUTURE\n" +
                "- - - -\n" +
                "2018.07.08 看到梁嘉腾的Blog和Github，感觉做得非常得不错，所以还是打算把这些东西抓起来。\n" +
                "## 主要目的\n" +
                "- 督促自己能够按期总结，积累自己\n" +
                "- 能够在跳槽时候展示自己\n" +
                "## 主要路线\n" +
                "1. 注册域名和服务器\n" +
                "2. 撰写前端web界面，可能会涉及到一些前端技术\n" +
                "3. 撰写接口文档\n" +
                "4. 撰写后端服务器代码\n" +
                "5. 发布代码到云服务器\n" +
                "## 主要阶段\n" +
                "- [ ] 本地开发WEB前端界面，使用Git管理\n" +
                "- [ ] 编写接口文档，使用Git管理\n" +
                "- [ ] 编写服务器代码，使用Git管理\n" +
                "- [ ] 本地调试服务器和前端代码\n" +
                "- [ ] 注册域名和购买服务器\n" +
                "- [ ] 调试完毕上传云服务器运行\n" +
                "## 完结后的运维\n" +
                "- 定期上传Markdown文档到Github服务器来更新\n" +
                "- 完成上传Markdown的界面化操作和后端接口\n" +
                "- 定期更新博客文档，包括大致内容：\n" +
                "\t- iOS开发\n" +
                "\t- JAVA开发\n" +
                "\t- LeetCode\n" +
                "\t- 诗和远方";
        mapper.insert("iOS进阶", "一些关于Swift的进阶", summary, content, "刚刚");
    }

    @Test
    public void testGetAllBlogs() {
        List<BlogItem> blogs = mapper.getAllBlogItem();
        System.out.print(blogs);
    }

}
