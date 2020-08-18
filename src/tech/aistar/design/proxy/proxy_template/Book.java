package tech.aistar.design.proxy.proxy_template;

import java.io.Serializable;
import java.lang.annotation.Target;

/**
 * 本类用来演示:
 *
 *
 * @author: success
 * @date: 2020/8/18 3:27 下午
 */

public class Book implements Serializable {
    private Integer id;

    private String bookName;

    public Book() {
    }

    public Book(Integer id, String bookName) {
        this.id = id;
        this.bookName = bookName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("id=").append(id);
        sb.append(", bookName='").append(bookName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
