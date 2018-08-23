package blog.service;

import blog.domain.BlogItem;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BlogService {
    public List<BlogItem> getAllBlogs();
}
