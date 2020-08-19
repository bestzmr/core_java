package tech.aistar.day18.homework;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author: Merlin
 * @time: 2020/8/19 17:17
 */
public class StudentWrite {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student s1 = new Student(1, "merlin1", 1, new Date(), new Address("江苏省", "苏州市"));
        Student s2 = new Student(2, "merlin2", 2, new Date(), new Address("江苏省", "苏州市"));
        Student s3 = new Student(3, "merlin3", 3, new Date(), new Address("江苏省", "苏州市"));

        students.add(s1);
        students.add(s2);
        students.add(s3);
        save(students, "src/tech/aistar/day18/abc.xml" );

    }

    public static void save(List<Student> students, String path) {
        Document doc = DocumentHelper.createDocument();
        Element root = doc.addElement("students");
        if (null != students && students.size() > 0) {
            for (Student student : students) {
                Element s = root.addElement("student");
                s.addAttribute("id", String.valueOf(student.getId()));

                s.addElement("name").setText(student.getName());

                s.addElement("no").setText(String.valueOf(student.getNo()));

                s.addElement("birthday").setText(new SimpleDateFormat("yyyy-MM-dd").format(student.getBirthday()));

                Address address = student.getAddress();
                if (null != address) {
                    Element stu = s.addElement("address");

                    stu.addElement("province").setText(address.getProvince());

                    stu.addElement("city").setText(address.getCity());
                }

            }
        }

        XMLWriter out = null;
        try {
            OutputFormat format = new OutputFormat("\t", true);
            out = new XMLWriter(new FileWriter(path), format);
            out.write(doc);
        } catch (IOException e) {
            e.printStackTrace();

        }finally {
            if (null != out) {
                try {
                    out.flush();
                    out.close();

                } catch (IOException e) {
                    e.printStackTrace();

                }
            }
        }
    }
}
