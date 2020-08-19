package tech.aistar.day18.jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/19 4:23 下午
 */
public class XmlUtils {

    public static void write(Object obj,String path){
        try {
            JAXBContext context = JAXBContext.newInstance(obj.getClass());
            //Marshaller -> bean->xml
            Marshaller marshaller = context.createMarshaller();

            //设置一些输出的格式
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);

            marshaller.marshal(obj,new FileWriter(path));
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        User u = new User(1,"admin","tom");
        write(u,"src/tech/aistar/day18/user.xml");
    }
}
