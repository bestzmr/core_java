package tech.aistar.day18.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 本类用来演示:
 * <publish_house>人民出版社</publish_house>
 *             <publish_date>1988-08-09</publish_date>
 *             <pages>100</pages>
 *             <description>这是一本好书</description>
 *
 * @author: success
 * @date: 2020/8/19 3:42 下午
 */
public class BookInfo implements Serializable {
    private String publishHouse;

    private Date publishDate;

    private int pages;

    private String description;

    public String getPublishHouse() {
        return publishHouse;
    }

    public void setPublishHouse(String publishHouse) {
        this.publishHouse = publishHouse;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BookInfo{");
        sb.append("publishHouse='").append(publishHouse).append('\'');
        sb.append(", publishDate=").append(publishDate);
        sb.append(", pages=").append(pages);
        sb.append(", description='").append(description).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
