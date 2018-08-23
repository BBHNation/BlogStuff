package com.blog.backend;

import blog.App;
import blog.domain.BlogItem;
import blog.service.BlogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ServiceTest {

    @Autowired
    private BlogService blogService;

    @Test
    public void testForBlogService() {
        List<BlogItem> blogs = blogService.getAllBlogs();
        System.out.print(blogs);
    }
}
