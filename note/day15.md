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

* 关于判断的方法
  * boolean exists();//判断file是否存在.
  * boolean isDirectory();//判断file是否为目录
  * boolean isFile();//判断file是否为文件

* 关于创建的

  * boolean createNewFile();//创建文件,如果成功,返回true.

  * boolean mkdir();//创建单层次的目录
  * boolean mkdirs();//创建深层次的目录