[TOC]

#### 习题 8

##### 一. 问答题

###### 1. `"\hello"` 是正确的字符串常量吗?

不是。该字符串常量会被理解为转义字符的 "\h" 和后面四个字母，然而在 Java 中，没有定义该转义字符。

###### 2. `"你好KU".length()` 和 `"\n\t\t".length()` 的值分别是多少?

前者受不同编码影响，可能会出现的结果是 4 或 5，后者的值一般为 3。

###### 3. `"Hello".equals("hello")` 和 `"java".equals("java")` 的值分别是多少?

true，false。String 的 `equals()`方法严格判断字符串的值是否相等（大小写敏感）。

###### 4. `"Bird".compareTo("Bird fly")` 的值是正数还是负数?

返回负数。String 的 `compareTo()`方法在前面的字符串小于后者时返回负数，大于时返回正数，相等返回0。

###### 5. `"I love this game".contains("love")` 的值是 `true` 吗?

是。String 的 `contains()` 方法在前面的字符串包含所给字符串时返回 true，否则返回 false。

###### 6. `"RedBird".indexOf("Bird")` 的值是多少? `"RedBird".indexOf("Cat")` 的值是多少?

3 和 -1。String 的 `indexOf()` 方法在能匹配到所给子串时，返回该子串在原字符串中第一次出现的下标，查找失败则返回 -1。

###### 7. 执行 `Integer.parseInt("12.9");` 会发生异常吗?

会产生 `NumberFormatException` 异常。所给字符串不是合法的 int 类型字符串（含有小数点）。

##### 二. 选择题

###### 1. 下列哪个叙述是正确的?

> A. String 类是 `final` 类，不可以有子类。
> B. String 类在 `java.util` 包中。
> C. `"abc"=="abc"` 的值是 false。
> D. `"abc".equals("Abc")` 的值是 true。

A。String 类是 `final` 类，在 `java.lang` 包中。两个相等的常量串，存储在同一个地址，故 `"abc"=="abc"` 的值是 true。String 的 `equals()`方法严格判断字符串的值是否相等（大小写敏感），故 D 选项应该为 false。

###### 2. 下列哪个表达式是正确的 (无编译错误) ?

> A. `int m = Float.parseFloat("567");` 
> B. `int m = Short.parseShort("567");` 
> C. `byte m = Integer.parseInt("2");`
> D. `float m = Float.parseDouble("2.9");`、

B。A 选项，将 float 类型的值不经转换赋值给 int 类型变量，错误；C 选项，将 int 类型的值不经转换赋值给 byte 类型变量，错误；D 选项同理。

###### 3. 对于如下代码，下列哪个叙述是正确的?

> A. 程序编译出现错误。
> B. 程序标注的【代码】的输出结果是 bird。
> C. 程序标注的【代码】的输出结果是 fly。
> D. 程序标注的【代码】的输出结果是null。
>
> ```java
> public class E {
>  public static void main(String[] args) {
>      String strOne = "bird";
>      String strTwo = strOne;
>      strOne = "fly";
>      System.out.println(strTwo);	// 【代码】
>  }
> }
> ```

B。以上代码先创建了 String 类型引用 strOne，并指向了常量字符串 "bird"，又将另一个引用 strTwo 指向了同一个常量字符串 "bird"。然后，让引用 strOne 又指向了 "fly"。此时 strTwo 没有改变，仍然指向 "bird"。

###### 4. 对于如下代码，下列哪个叙述是正确的?

> A. 程序出现编译错误。
> B. 无编译错误，在命令行执行程序 `java E I love this game` ，程序输出 this。
> C. 无编译错误，在命令行执行程序 `java E let us go`  ，程序无运行异常。
> D. 无编译错误，在命令行执行程序 `java E 0 1 2 3 4 5 6 7 8 9` ，程序输出 3。
>
> ```java
> public class E {
>     public static void main(String[] args) {
>         String s1 = args[1];
>         String s2 = args[2];
>         String s3 = args[3];
>         System.out.println(s3);
>     }
> }
> ```

D。Java 会将命令行调用的参数作为字符串数组，传入 main 函数作为参数（空白符分割）。B 选项，应该输出 game；C 选项，下标越界异常。

###### 5. 下列哪个叙述是错误的?

> A. `"9dog".matches("\\ddog")` 的值是 true。
> B. `"12hello567".replaceAll("[123456789]+","@")` 返回的字符串是`@hello@` 。
> C. `new Date(1000)` 对象含有的时间是公元后1000小时的时间。
> D. `"hello\n"`是正确的字符串常量。

C。该对象含有的时间是从 1970 年 1 月 1 日 0 时 0 分 0 秒开始的 1000 毫秒的时间。

#### 习题10

##### 一. 问答题

###### 1. 如果准备按字节读取一个文件的内容，应当使用 `FileInputStream` 流还是 `FileReader` 流?

应当使用 `FileInputStream` 流。后者是以字符形式读取文件内容。

###### 2. `FileInputStream` 流的 `read` 方法和 `FileReader` 流的 `read` 方法有何不同?

前者按 字节 读取文件内容，后者按 字符 读取文件内容。

###### 3. `BufferedReader` 流能直接指向一个文件吗?

##### 二. 选择题

###### 1. 下列哪个叙述是正确的?

> A. 创建 `File` 对象可能发生异常。
> B. `BufferedRead` 流可以指向 `FileInputStream` 流。
> C. `BufferedWrite` 流可以指向 `FileWrite` 流。
> D. `RandomAccessFile` 流一旦指向文件，就会刷新该文件。

C。A 选项，创建 `File` 对象时不会发生异常，但创建新文件时可能会发生 `IOException` 异常；B 选项， `BufferedRead` 流只能指向 `FileRead` 流，因为他们都是按字符读取数据；D选项，`RandomAccessFile` 流只有写入时才可能刷新文件，指向时不刷新。

###### 2. 为了向文件 hello.txt 追加数据，下列哪个是正确创建指向 hello.txt 的流?

> A. 
> ```java
> try { OutputStream out = new FileOutputStream("hello.txt");
> } catch (IOException e) { }
> ```
>
> B. 
> ```java
> try { OutputStream out = new FileOutputStream("hello.txt", true);
>
> } catch (IOException e) { }
> ```
> 
> C. 
> ```java
> try { OutputStream out = new FileOutputStream("hello.txt", false);
>
> } catch (IOException e) { }
> ```
> 
> D. 
> ```java
> try { OutputStream out = new OutputStream("hello.txt", true);
>
> } catch (IOException e) { }
> ```

B。A 与 C 等价，都是覆盖写模式，会覆盖原文件的内容。D 是错误的，`OutputStream` 类是抽象类，无法被实例化，此处应该使用 `FileOutputStream` 类来写入文件。