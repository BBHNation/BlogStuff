package com.blog.backend;

import blog.App;
import blog.dao.BlogMapper;
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

import java.net.MalformedURLException;
import java.net.URL;
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
        mapper.insert("题目", "副标题", "总结", "主要内容", "一小时以前");
    }

}
