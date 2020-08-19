package tech.aistar.practice;

import javax.swing.*;
import java.awt.*;
import java.io.Serializable;

/**
 * @author: Merlin
 * @time: 2020/8/18 13:34
 */
class SunWuKun extends JPanel implements Cloneable, Serializable {
    public SunWuKun() {
        JLabel l1 = new JLabel(new ImageIcon("src/tech/aistar/practice/WuKong.jpg"));
        this.add(l1);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        SunWuKun w = null;
        try {
            w = (SunWuKun) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("拷贝悟空失败！");

        }
        return w;

    }

}

public class ProtoTypeWukong {
    public static void main(String[] args) throws CloneNotSupportedException {
        JFrame jf = new JFrame("原型模式测试");
        jf.setLayout(new GridLayout(1, 2));
        Container contentPane = jf.getContentPane();
        SunWuKun obj1 = new SunWuKun();
        contentPane.add(obj1);
        SunWuKun obj2 = (SunWuKun) obj1.clone();
        contentPane.add(obj2);
        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}