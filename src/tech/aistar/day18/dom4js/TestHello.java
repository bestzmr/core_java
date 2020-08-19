package tech.aistar.day18.dom4js;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * 本类用来演示:dom4j解析xml体验
 *
 * @author: success
 * @date: 2020/8/19 3:25 下午
 */
public class TestHello {
    public static void main(String[] args) {
        //1. 创建SAXReader对象
        SAXReader saxReader = new SAXReader();

        //2. 获取xml在内存中对应Document文档对象
        //准备xml文件的字节输入流
        InputStream in = null;
        try {
            in = new FileInputStream("src/tech/aistar/day18/dom4js/hello.xml");
            //把xml加载到内存中形成一颗"倒置的"文档树.
            Document doc = saxReader.read(in);

            //获取根元素,标签
            Element root = doc.getRootElement();

            //获取根元素的属性的个数
            System.out.println(root.attributeCount());

            //获取根元素属性isbn的属性的值 - 根据属性名来获取属性值
            System.out.println(root.attributeValue("isbn"));

            //获取根元素root下的select标签
            Element selectElement = root.element("select");
            System.out.println(selectElement.attributeValue("id"));

            //获取select标签体中的文本内容
            System.out.println(selectElement.getTextTrim());

            //把先拿元素,再取值这俩个操作 -> 合并
            System.out.println(root.elementTextTrim("select"));


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        }

    }
}
