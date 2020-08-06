package tech.aistar.day13.exercise;

import java.util.Arrays;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/6 1:48 下午
 */
public class SuccessList<E> {

    private Object[] datas = new Object[10];

    //有效数量
    private int size;

    /**
     * 添加数据...
     * @param e
     */
    public void add(E e){
        //判断是否要扩容...
        if(size == datas.length){
           datas = Arrays.copyOf(datas,datas.length<<1);
        }
        datas[size++] = e;
    }

    /**
     * 根据下标获取元素
     * @param index
     * @return
     */
    public E get(int index){
        return (E) datas[index];
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < size; i++) {
            sb.append(i!=size-1?datas[i]+",":datas[i]);
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        SuccessList<String> list = new SuccessList<>();

        list.add("ok");
        list.add("good");
        list.add("good");
        list.add("good");
        list.add("good");
        list.add("good");
        list.add("good");
        list.add("good");
        list.add("good");
        list.add("good");
        list.add("good");
        list.add("good");
        list.add("good");
        list.add("good");
        list.add("good");

        System.out.println(list.get(0));

        System.out.println(list.size());

        System.out.println(list);
    }
}
