package tech.aistar.day18.entity;


import java.io.Serializable;

/**
 * 本类用来演示:
 * <name>西游记</name>
 *         <author>吴承恩</author>
 *         <price>100.0</price>
 *         <bookinfo>
 *             <publish_house>人民出版社</publish_house>
 *             <publish_date>1988-08-09</publish_date>
 *             <pages>100</pages>
 *             <description>这是一本好书</description>
 *         </bookinfo>
 *
 * @author: success
 * @date: 2020/8/19 3:41 下午
 */
public class Book implements Serializable {
    private Integer id;

    private String name;

    private String author;

    private double price;

    private BookInfo bookInfo;

    public Book() {
    }

    public Book(Integer id, String name, String author, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public BookInfo getBookInfo() {
        return bookInfo;
    }

    public void setBookInfo(BookInfo bookInfo) {
        this.bookInfo = bookInfo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", price=").append(price);
        sb.append(", bookInfo=").append(bookInfo);
        sb.append('}');
        return sb.toString();
    }
}
