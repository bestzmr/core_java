package tech.aistar.day18.homework;

import java.util.Date;

/**
 * @author: Merlin
 * @time: 2020/8/19 17:13
 */
public class Student {
    Integer id;
    String name;
    Integer no;
    Date birthday;
    Address address;

    public Student(Integer id, String name, Integer no, Date birthday, Address address) {
        this.id = id;
        this.name = name;
        this.no = no;
        this.birthday = birthday;
        this.address = address;
    }

    public Student() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", no=").append(no);
        sb.append(", birthday=").append(birthday);
        sb.append(", address=").append(address);
        sb.append('}');
        return sb.toString();
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

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

