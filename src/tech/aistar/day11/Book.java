package tech.aistar.day11;

import java.util.Date;

/**
 * 本类用来演示:实体类
 *
 * @author: success
 * @date: 2020/8/3 8:39 上午
 */
public class Book {
    private int id;//对象的标志,不属于对象的属性

    //图书编号
    private String isbn;

    private String bookName;

    private double price;

    private String author;//图书作者

    private Date publishDate;//出版时间

    public Book() {
    }

    public Book(int id, String isbn, String bookName) {
        this.id = id;
        this.isbn = isbn;
        this.bookName = bookName;
    }

    public Book(int id, String isbn, String bookName, double price, String author, Date publishDate) {
        this.id = id;
        this.isbn = isbn;
        this.bookName = bookName;
        this.price = price;
        this.author = author;
        this.publishDate = publishDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }


    @Override
    public boolean equals(Object obj){
        //1. 非空性
        if(null == obj)
            return false;
        //2. 自反性
        if(this == obj)
            return true;
        //3. 类型判断
        if(obj instanceof Book){
            Book b = (Book) obj;
            //需求1 - 只要俩个图书的id是一样的,就认为是同一个对象
            //return this.id == b.getId();

            //需求2 - id以及isbn同时一致的时候,才认为是同一个对象
            return this.id == b.getId() && this.isbn.equals(b.getIsbn());
        }

        return false;

    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("id=").append(id);
        sb.append(", isbn='").append(isbn).append('\'');
        sb.append(", bookName='").append(bookName).append('\'');
        sb.append(", price=").append(price);
        sb.append(", author='").append(author).append('\'');
        sb.append(", publishDate=").append(publishDate);
        sb.append('}');
        return sb.toString();
    }
}
