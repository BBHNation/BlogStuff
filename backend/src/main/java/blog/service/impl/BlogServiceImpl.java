package blog.service.impl;

import blog.dao.BlogMapper;
import blog.domain.BlogItem;
import blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogMapper mapper;

    @Override
    public List<BlogItem> getAllBlogs() {
        List<BlogItem> list = mapper.getAllBlogItem();
        return list;
    }
}
