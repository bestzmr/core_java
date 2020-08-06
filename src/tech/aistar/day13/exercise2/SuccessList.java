package tech.aistar.day13.exercise2;

import java.util.Arrays;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/6 1:48 下午
 */
public class SuccessList<E> {

    public Object[] datas = new Object[10];
    int count = 0;
    /**
     * 添加数据...
     * @param e
     */
    public void add(E e){
        if (count < datas.length) {
            datas[count++] = e;
        } else {
            datas = Arrays.copyOf(datas, datas.length * 2);
            datas[count++] = e;
        }
    }

    /**
     * 根据下标获取元素
     * @param index
     * @return
     */
    public E get(int index){
        if (index >= count) {//这里应该为count，有效数量
            return null;
        }

        return (E) datas[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(datas,count));
    }

    public static void main(String[] args) {
        SuccessList s = new SuccessList<String>();
        s.add("123");
        s.add("qweq");
        System.out.println(s.get(1));
        System.out.println();
        System.out.println(s);
    }
}
