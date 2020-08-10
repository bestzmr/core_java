# JCF结构

简介:java集合框架系列.

API:java.util.*

* Collection[I]
  * List[I] - 有序可重复
    * **ArrayList[C]** 
    * LinkedList[C] - 重点掌握
    * Vector[C]
  * Set[I] - 无序不可重复
    * **HashSet[C]**
    * SortedSet[I]
      * TreeSet[C] - 不可重复但是可以排序.

* Map[I]
  * **HashMap[C]**
  * Hashtable[C] - 哈希表
    * Properties[C] - 属性类



# ArrayList扩容机制

~~~java
List<String> list = new ArrayList<>();
list.add("ok");//研究add方法的底层.
list.add("good");
~~~

java.util.ArrayList底层是"动态增长"的***数组***.

~~~java
 /**
     * 默认数组的初始化的容量.
     */
private static final int DEFAULT_CAPACITY = 10;

//默认是一个长度为0的数组.
private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};

//本质是用来保存集合中添加进去的数据的.
transient Object[] elementData;

 /**
     * The size of the ArrayList (the number of elements it contains).
     *
     * @serial
     */
private int size;//有效数量
~~~

List<String> list = new ArrayList<>();

~~~java
public ArrayList() {
  this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
}
调用完空参构造之后,得出一个结论: this.elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA - true
~~~

研究add方法

~~~java
 public boolean add(E e) {
   	    //第一次进来,size = 0;
   	   //第二次进来,参数 - 2
        ensureCapacityInternal(size + 1);  // 扩容方法...
        elementData[size++] = e;
        return true;
    }
~~~

~~~java
//第一次进来minCapacity = 1
private void ensureCapacityInternal(int minCapacity) {
  		  //第一次肯定判断为true
  
        //第二次进来不走,因为第一次走完的时候elementData已经指向另外一个新的长度为10的新数组了.
        if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
            //第一次进来minCapacity = 10
            minCapacity = Math.max(DEFAULT_CAPACITY, minCapacity);
        }

  		  //second - minCapacity - 2
        ensureExplicitCapacity(minCapacity);//10
    }
~~~

~~~java
private void ensureExplicitCapacity(int minCapacity) {
        modCount++;//暂时不用关心,非安全删除的时候

        // overflow-conscious code
  			//10 - 0
  
       //second - 2
        if (minCapacity - elementData.length > 0)
            grow(minCapacity);//扩容操作.
    }
~~~

真正的扩容操作

~~~java
 private void grow(int minCapacity) {//第一次进来
        //第一次进来
        //oldCapacity = 0
        int oldCapacity = elementData.length;
        //newCapacity = 0
        int newCapacity = oldCapacity + (oldCapacity >> 1);//按照1.5倍进行扩容...
        if (newCapacity - minCapacity < 0)
            newCapacity = minCapacity;//newCapacity = 10
        if (newCapacity - MAX_ARRAY_SIZE > 0)//限制集合中元素的个数.到达极限
            newCapacity = hugeCapacity(minCapacity);
        // minCapacity is usually close to size, so this is a win:
   
   		  //第一次进来elementData = Arrays.copyOf(elementData,10);
   			//只要第一次调用add方法之后,elementData已经指向一个长度为10的新的数组了.
        elementData = Arrays.copyOf(elementData, newCapacity);
    }
~~~

