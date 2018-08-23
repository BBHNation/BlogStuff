package blog.dao;

import blog.domain.BlogItem;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.LinkedList;

@Mapper
public interface BlogMapper {
    @Select("SELECT * FROM blogs")
    LinkedList<BlogItem> getAllBlogItem();

    @Insert("INSERT INTO blogs (title, subTitle, summary, content, dateString) VALUES(#{title}, #{subTitle}, #{summary}, #{content}, #{dateString})")
    int insert(@Param("title") String title,
               @Param("subTitle") String subTitle,
               @Param("summary") String summary,
               @Param("content") String content,
               @Param("dateString") String dateString);
}
