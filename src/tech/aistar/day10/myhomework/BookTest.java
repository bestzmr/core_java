package tech.aistar.day10.myhomework;

/**
 * @author: Merlin
 * @time: 2020/7/31 19:48
 */
public class BookTest {
    public static void main(String[] args) {
        ArrayBookBiz arrayBookBiz = new ArrayBookBiz();
        arrayBookBiz.add(new Book("0","十万个为什么"));
        arrayBookBiz.add(new Book("1","十万个为什么1"));
        arrayBookBiz.add(new Book("2","十万个为什么2"));
        arrayBookBiz.add(new Book("3","十万个为什么3"));
        arrayBookBiz.add(new Book("4","十万个为什么4"));
        arrayBookBiz.add(new Book("5","十万个为什么5"));
//        arrayBookBiz.deleteByName("十万个为什么2");
        arrayBookBiz.deleteById("0");

        arrayBookBiz.outputAllBooks();
    }
}
