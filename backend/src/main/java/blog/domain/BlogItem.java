package blog.domain;

public class BlogItem {
    private Integer blogId;
    private String title;
    private String subTitle;
    private String summary;
    private String content;
    private String dateString;

    public Integer getBlogId() {
        return blogId;
    }

    public String getTitle() {
        return title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public String getSummary() {
        return summary;
    }

    public String getContent() {
        return content;
    }

    public String getDateString() {
        return dateString;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDateString(String dateString) {
        this.dateString = dateString;
    }
}