
# XML

XML是可**扩展**标记语言** e**X**tensible **M**arkup **L**anguage,多用来传输和储存数据.w3cshool组织制定的标准.

- XML是一种**标记语言**
- XML是用来**传输数据的语言而不是显示数据**
- XML语言需要***自行定义标签并且具有自我描述性***
  - XML在意的是数据内容（**传输信息**,重在参与数据的载体,简单的数据库）
  - HTML在意的是数据的外观（显示信息）

## 作用

* **xml把数据从html分离**

* **xml简化数据共享** - 逐渐被json数据取代了

  XML数据以纯文本格式进行存储，因此提供了一种独立与软件和硬件的数据储存方法。这就可以让创建不懂应用程序可以共享的数据变得更加容易

* **简化数据传输** - 逐渐被json数据取代了

  互联网上的不兼容的系统之间交换数据对于程序员来说是一件很费时的事情，这时yogaXML交换数据就降低了从不兼容的应用程序中读取数据的复杂性

​        java内存中的集合对象A   ->  持久到XML文件(省市区)[结构的]

​        python想读取A -> 去解析xml文件,将数据加载到自己的内存.

# XML语法规则

* 第一条语句<?xml version="1.0" encoding="UTF-8"?>

  告诉浏览器,这是一个xml文件.

* 所有xml都必须要有一个关闭标签

* xml大小写是敏感的.

* xml必须要正确嵌套

* xml必须要有根元素

* xml属性值必须加引号

* 同一个标记中不能出现同名的属性名


满足以上的要求就是***格式良好的xml文件***,使用浏览器检测即可.

# XML元素

- 其他元素
- 文本
- 属性
- 或混合以上所有

# XML元素的命名规则

- 名称可以包含字母、数字以及其他字符
- 名称不能以数字或者标点符号开始
- 名称不能以字母xml（不区分大小写的任何xml 组合）开始
- 名称不能包含空格



# XML的约定

W3C制定的两种技术来约定 XML 文档：
1. DTD 
2. SCHEMA

满足上述两种中的一种的xml - 合法的xml(一定是格式良好的xml)

## dtd

DTD:
**Document Type Definition 文档类型定义**
**它是用来在一个应用系统中限定XML文档的标记以及它的层次结构**

满足DTD要求的XML,叫做合法的文档

* 合法的文档一定是格式良好的
* 格式良好的文档不一定是合法的

~~~xml-dtd
<?xml version="1.0" encoding="UTF-8"?>

<!ELEMENT books (book+)>
<!ELEMENT book (name, author, price, bookinfo?)>
<!ATTLIST book id CDATA #REQUIRED>
<!ELEMENT name (#PCDATA)>
<!ELEMENT author (#PCDATA)>
<!ELEMENT price (#PCDATA)>

<!ELEMENT bookinfo (publish_house, publish_date, pages, description)>
<!ELEMENT publish_house (#PCDATA)>
<!ELEMENT publish_date (#PCDATA)>
<!ELEMENT pages (#PCDATA)>
<!ELEMENT description (#PCDATA)>

解析dtd文件.
标签出现次数的量词:
1. + 代表该标签出现的次数:至少1次[1次或者多次]
2. * 零次或者多次
3. ? 零次或者1次.
dtd的缺陷 - 不能精确表达出现的次数.

a. ELEMENT - 元素,标签,节点
b. ATTLIST - 属性(属性肯定是出现标签中的)

关于DTD文件的数据类型 - 三种
a. #CDATA - 修饰属性
b. #PCDATA - 修饰标签
c. 自定义类型


1. <!ELEMENT books (book+)>
   xml肯定拥有根标签 - books
   book+,books根标签下拥有的book标签的个数,+代表的是1次或者多次.

2. <!ELEMENT book (name, author, price, bookinfo?)>
   标签book下拥有name,author,price,bookinfo标签
   bookinfo? - 代表的是0次或者1次.

3. <!ATTLIST book id CDATA #REQUIRED>
   book标签应该拥有一个id属性
   #REQUIRED - id属性是必须要提供的.
   CDATA - 专门是用来修饰属性的数据类型.

4.<!ELEMENT name (#PCDATA)>
  <!ELEMENT author (#PCDATA)>
  <!ELEMENT price (#PCDATA)>
  告诉xml以上三个标签就是属于简单的标签 - #PCDATA

5. <!ELEMENT bookinfo (publish_house, publish_date, pages, description)>
   bookinfo标签下又会拥有四个标签

6. <!ELEMENT publish_house (#PCDATA)>
  <!ELEMENT publish_date (#PCDATA)>
  <!ELEMENT pages (#PCDATA)>
  <!ELEMENT description (#PCDATA)>
~~~

~~~xml
<books>
	<book id="1001">
    <name></name>
    <author></author>
    <price></price>
    <bookinfo>
    	<publish_house></publish_house>
      <publish_date></publish_date>
      <pages></pages>
      <description></description>
    </bookinfo>
  </book>
  <book id="1002">
    <name></name>
    <author></author>
    <price></price>
    <bookinfo>
    	<publish_house></publish_house>
      <publish_date></publish_date>
      <pages></pages>
      <description></description>
    </bookinfo>
  </book>
</books>
~~~



练习.

~~~xml-dtd
<?xml version="1.0" encoding="UTF-8"?>

<!ELEMENT students (student+)>
<!ELEMENT student (name,no,birthday,address)>
<!ATTLIST student
			id CDATA #REQUIRED>
<!ELEMENT name (#PCDATA)>
<!ELEMENT no (#PCDATA)>
<!ELEMENT birthday (#PCDATA)>
<!ELEMENT address (province,city)>

<!ELEMENT province (#PCDATA)>
<!ELEMENT city (#PCDATA)>			
~~~



### dtd缺点

* DTD不能自定义类型 

* DTD的内置类型太少，只有 #PCDATA / CDATA

* DTD中对元素的次数限定不够精确

* DTD的语法是全新的，与XML没有关系

  

## schema

Schema的出现是为了替代DTD,它修复了DTD的所有缺点,并且可以满足DTD的所有功能.更重要的一点是,Schema采用的也是XML语法,当然,Schema本身的标记是固定的.

~~~scheme
<?xml version="1.0" encoding="UTF-8"?>
<schema xmlns="http://www.w3.org/2001/XMLSchema"
	targetNamespace="http://www.example.org/student_1_0"
	xmlns:tns="http://www.example.org/student_1_0"
	elementFormDefault="qualified">
	
	<element name="students">
		<complexType>
			<sequence minOccurs="1" maxOccurs="unbounded">
				<element name="student" type="tns:StuType"/>
			</sequence>
		</complexType>
	</element>
	<complexType name="StuType">
		<sequence>
			<element name="name" type="string"/>
			<element name="no" type="string"/>
			<element name="birthday" type="date"/>
			<element name="address" type="tns:AddrType"/>
		</sequence>
		<attribute name="id" type="int" use="required"></attribute>
	</complexType>
	<complexType name="AddrType">
		<sequence>
			<element name="province" type="string"/>
			<element name="city" type="string"/>
		</sequence>
	</complexType>
</schema>
~~~

~~~xml
<?xml version="1.0" encoding="UTF-8"?>
<tns:students xmlns:tns="http://www.example.org/student_1_0" 
     xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
     xsi:schemaLocation="http://www.example.org/student_1_0 students_1_0.xsd ">
  <tns:student id="001">
    <tns:name>Jack</tns:name>
    <tns:no>1001</tns:no>
    <tns:birthday>2001-01-01</tns:birthday>
    <tns:address>
      <tns:province>江苏</tns:province>
      <tns:city>常州</tns:city>
    </tns:address>
  </tns:student>
  <tns:student id="002">
    <tns:name>Tom</tns:name>
    <tns:no>1002</tns:no>
    <tns:birthday>2001-01-01</tns:birthday>
    <tns:address>
      <tns:province>江苏</tns:province>
      <tns:city>常州</tns:city>
    </tns:address>
  </tns:student>
  <tns:student id="003">
    <tns:name>Jack</tns:name>
    <tns:no>1003</tns:no>
    <tns:birthday>2001-01-01</tns:birthday>
    <tns:address>
      <tns:province>江苏</tns:province>
      <tns:city>常州</tns:city>
    </tns:address>
  </tns:student>
</tns:students>
~~~



# xml解析技术

简介:用java来读取和写入xml文件.

* **SAX解析(sun公司提供的api)**
* DOM解析(sun公司提供的api)
* 第三方的组件**dom4j**(必须掌握)或者jdom(使用方式几乎和dom4j一样的)
* 拓展jdk7.x里面提供的jaxb(基于注解的方式,非常简便的)



## dom4j来解析xml

* 导入dom4j.jar
* 右击jar-add as library
* 官方api - https://tool.oschina.net/apidocs/apidoc?api=dom4j1.6.1%2Fapidocs



# 笔试

## DOM解析

a). ***支持读写***

b). 采取的是"**文档树"**的方式,会一次性把xml文档加载到内存中,形成一颗"倒置的文档树"

​      根元素就是树根

c). DOM的方式比较占资源,效率不高,特别是碰到加载特别大的XML文档的时候.     



## SAX解析

简介:了解.

a). ***只支持读***

b). 采取的是**"基于事件驱动"**的方式来解析xml文档,**每读取到标签的时候,就会触发相应的事件**

c). 不会把xml永驻内存,事件一旦完成,就结束,只能从头开始去读取.效率高,不占内存.

