# File

api:**java.io** - IO流相关的API.

java.io.**File** 文件类,作用 - 就是把磁盘上的文件读取到JVM内存中,File类就是文件在内存中对应那个对象.

这个类本身只能获取文件[目录]的元信息,删除文件[目录],创建文件[目录].

它不能读取或者写入内容到文件.操作文件中具体的内容的时候需要使用流(Stream).



## 构造方法

* File(String path);//利用路径来构建一个File实例.路径可以是文件,也可以是目录的路径

  路径可以是绝对路径,也可以是相对路径.

  绝对路径 - 以磁盘号开头或者以/开头



## 常用方法

* 关于获取的方法
  * String getName();//获取file的名称.
  * String getAbsolutePath();//获取file的绝对路径
  * long length();//获取文件的大小.单位是b

* 关于判断的方法
  * boolean exists();//判断file是否存在.
  * boolean isDirectory();//判断file是否为目录 - 只能存在的
  * boolean isFile();//判断file是否为文件 - 只能判断存在的

* 关于创建的

  * boolean createNewFile();//创建文件,如果成功,返回true.

  * boolean mkdir();//创建单层次的目录
  * boolean mkdirs();//创建深层次的目录

* 关于删除的
  
* boolean delete();//删除文件或者空目录
  
* 关于加载项

  * File[] listFiles();//只能获取第一级的子集目录

  * File[] listFiles(FilenameFilter filter);//筛选指定的符合规则的文件.

    ~~~java
    public File[] listFiles(FilenameFilter filter) {//接口
      String ss[] = list();
      if (ss == null) return null;
      ArrayList<File> files = new ArrayList<>();
      for (String s : ss)
        if ((filter == null) || filter.accept(this, s))
          files.add(new File(s, this));
      return files.toArray(new File[files.size()]);
    }
    ~~~

    



## 随堂练习

给定一个目录路径,输出这个目录下的所有的file,如果是文件,则输出名称,如果是目录,输出绝对路径.



# IO流

简介:流是一组有顺序的,有起点**[源头]**和终点**[目标]**的字节集合,是对数据传输的总称或者

抽象,它的特性就是进行**数据传输**.

源头:键盘,磁盘,网络

目标:显示器,磁盘,网络

## 流分类

* 按照流的方向 - **参照物是JVM内存.**

  * **输入流** - 将外部文件的数据读入**JVM内存**
  * *输出流* - 把**JVM内存中的数据**写出到外部的文件.

* 流的读写单位

  * **字节流** - 可以**按照最小字节单位**进行读取和写入.是直接连接到**输入源**[**数据源**,"管道"]的流

    按照(1个字节8bit的二进制)为单位.一次可能会读取多个字节.

    [图片,视频 - 二进制文件]

  * **字符流**

    **是以字符**为单位进行数据处理的IO流,通常是使用字符流来**读取纯文本文件.**

    一次读入或者写出16位二进制

    不能使用字符流来处理二进制文件的.

* 流的功能

  * **节点流** - 基础流 - 才具备真正的读写能力.

    * ***FileInputStream/FileOutputStream***

  * **包装流** - "装饰器模式" - "拓展流"

    本身是不具备读写功能的.使用包装流,一定是使用节点流来构建的.



## 字节流的层次结构

**java.io.InputStream[C] - 抽象类 - 所有的字节输入流的顶级的抽象父类**

* **FileInputStream[C] - 操作文件的字节输入流**,该流是基础流,节点流,这个流才是真正具备读写能力.
* **ObjectInputStream - 操作对象类型的字节输入流**
* FilterInputStream
  * DataInputStream - 操作基本类型(包装类型)的字节输入流
  * **BufferedInputStream - 带缓存区功能的字节输入流**



java.io.OutputStream[C] - 抽象类 - 所有的字节输出流顶级的抽象父类

* **FileOutputStream[C] - 操作文件的字节输出流**,该流是基础流,节点流,这个流才是真正具备读写能力.
* **ObjectOutputStream - 操作对象类型的字节输出流**
* FilterOutputStream
  * DataOutputStream - 操作基本类型(包装类型)的字节输出流
  * BufferedOutputStream - 带缓存区功能的字节输输出流



# InputStream

* void close();//关闭流,流是一个昂贵的资源对象,使用完毕之后,一定要关闭.
* abstract int read();//一个字节一个字节进行读取
* ***int read(byte[] buf);//从输入流中读取一定的字节放入到缓冲区数组buf中.***



# Outputstream

* void close();//关闭流

* void flush();//刷新缓存.

* **void write(byte[] buf,int off,int len);**//

  因为之前已经将读取到的数据存储到buf数组中了,写入也是应该从buf中获取数据,从off下标处开始获取,写出len个.



# 具体编程步骤














