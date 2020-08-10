# JCF结构

简介:java集合框架系列.

API:java.util.*

* Collection[I]
  * List[I] - 有序可重复
    * **ArrayList[C]**  - 底层的数据结构:动态增长的数组
    * LinkedList[C] - 重点掌握,底层的数据结构 - 双向链表.
    * Vector[C]
  * Set[I] - 无序不可重复
    * **HashSet[C]** - 哈希表,底层就是HashMap
    * SortedSet[I]
      * TreeSet[C] - 不可重复但是可以排序.

* Map[I]
  * **HashMap[C]** - JDK8.x 桶数组 + 链表 + ***红黑树***
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



# 迭代器

~~~java
Iterator<Integer> iter = list.iterator();
while(iter.hasNext()){
  Integer n = iter.next();
  System.out.println(n);
}
~~~

为什么集合中提供了一种特有的迭代方式 - 迭代器呢?

~~~java
因为这些集合容器的底层数据结构是不一样的,不同的数据结构查询的方式应该是不一样的.
既然不一样,那么就有必要去提供一个统一的方式来迭代不同数据结构的集合容器.
  
比如:ArrayList.java
  private class Itr implements Iterator<E> {
    int cursor;       // index of next element to return
    int lastRet = -1; // index of last element returned; -1 if no such
    int expectedModCount = modCount;

~~~



# 集合的删除注意点

~~~java
 /**
     * 非安全删除...
     * 增强for循环是一个只读的循环.
     * 禁止在遍历集合的同时,再去进行删除操作.
     * 如果执行了这个操作,它会抛出一个并发修改的异常....
     * @param list
     * @param bookName
     */
    private static void unSafeDel(List<Book> list,String bookName){
        for (Book book : list) {
            if(book.getBookName().equals(bookName)){
                list.remove(book);//直接删除对象...
            }
        }
    }
抛出一个并发修改的异常 - Exception in thread "main" java.util.ConcurrentModificationException
~~~

结论1 - 集合中使用增强for循环来进行遍历的时候,增强for循环的遍历的底层实际上还是使用迭代器.



如何做到"只读"的效果...

~~~java
public E next() {
  checkForComodification();//异常报错行...
  int i = cursor;
  if (i >= size)
    throw new NoSuchElementException();
  Object[] elementData = ArrayList.this.elementData;
  if (i >= elementData.length)
    throw new ConcurrentModificationException();
  cursor = i + 1;
  return (E) elementData[lastRet = i];
}

 final void checkForComodification() {
   if (modCount != expectedModCount)
     throw new ConcurrentModificationException();//并发修改异常...
 }
~~~

* 定位到add方法

  每次执行add方法的时候,**modCount**都会自增1...

  ~~~java
   protected transient int modCount = 0;
   
  private void ensureExplicitCapacity(int minCapacity) {
          modCount++;
  
          // overflow-conscious code
          if (minCapacity - elementData.length > 0)
              grow(minCapacity);
      }
  ~~~

* 定位到remove方法

  底层也实现了**modCount**++的一个自增..

  ~~~java
  private void fastRemove(int index) {
          modCount++;
          int numMoved = size - index - 1;
          if (numMoved > 0)
              System.arraycopy(elementData, index+1, elementData, index,
                               numMoved);
          elementData[--size] = null; // clear to let GC do its work
      }
  
  ~~~

* 研究迭代器迭代方法

  ~~~java
   private class Itr implements Iterator<E> {
          int cursor;       // index of next element to return
          int lastRet = -1; // index of last element returned; -1 if no such
          int expectedModCount = modCount;
     
     			//此时此刻modCount的值应该是多少?
          //添加add方法之后,但是在调用remove方法之前的值.
     
          //只要在迭代的过程中,出现了remove语句,那么exexpectedModCount!=modCount
   }
  ~~~

  

