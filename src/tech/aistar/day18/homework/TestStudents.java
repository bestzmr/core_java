package tech.aistar.day18.homework;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Merlin
 * @time: 2020/8/19 17:38
 */
public class TestStudents {
    public static void main(String[] args) {
        for (Student student : findStudents()) {
            System.out.println(student);
        }
    }
    public static List<Student> findStudents() {
        List<Student> students = new ArrayList<>();
        try (InputStream in = new FileInputStream("src/tech/aistar/day18/abc.xml")) {
            SAXReader saxReader = new SAXReader();
            Document doc = saxReader.read(in);

            Element root = doc.getRootElement();
            List<Element> list = root.elements("student");

            if (null != list && list.size() > 0) {
                for (Element element : list) {
                    Student s = new Student();
                    s.setId(Integer.valueOf(element.attributeValue("id")));
                    s.setName(element.elementTextTrim("name"));
                    s.setNo(Integer.valueOf(element.elementTextTrim("no")));
                    s.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse(element.elementTextTrim("birthday")));
                    Element address = element.element("address");
                    if (null != address) {
                        Address address1 = new Address();
                        address1.setProvince(address.elementTextTrim("province"));
                        address1.setCity(address.elementTextTrim("city"));
                        s.setAddress(address1);

                    }
                    students.add(s);

                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return students;
    }
}

