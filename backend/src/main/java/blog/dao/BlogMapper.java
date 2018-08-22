package blog.dao;

import blog.domain.BlogItem;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BlogMapper {
    @Select("SELECT * FROM blog")
    BlogItem getAllBlogItem();

    @Insert("INSERT INTO blog (title, subTitle, summary, content, dateString) VALUES(#{title}, #{subTitle}, #{summary}, #{content}, #{dateString})")
    int insert(@Param("title") String title,
               @Param("subTitle") String subTitle,
               @Param("summary") String summary,
               @Param("content") String content,
               @Param("dateString") String dateString);
}
