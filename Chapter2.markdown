1.(1)  类、变量、方法、类型、数组、文件等命名的有效字符序列称为标识符。符号的名字就是标识符。

   (2) Java 的保留字(具有特定用途/赋予特定意义的单词，例如循环控制 while/for ，类型名 int 等等)，不能作为标识符。true 和 false 并非关键字，但是不能作为标识符。举例: (类型名) int byte short char long float double etc..

   (3) byte short int long float double boolean char

   (4) float 常量需要以 f 结尾，例如 3.14f。一个(带有小数点的)浮点数的字面量的默认类型是 double. 

   (5) array.length 字段。对于一个一维数组，该字段表示元素个数；对于一个二维数，则表示该二维数组中一维数组的个数。

3.(1) 输出了 Unicode 编码从 20302 到 20322 的字符（这里为排版方便，将 println 换成了 print 加空格）。

```java
public class E {
	public static void main(String args[]) {
		for ( int i = 20302; i < 20322; i++ ) {
			System.out.print((char)i+" ");
		}
	}
}
```
```
[admin@iZbp18743tpvttty07dgbrZ 2]$ java ./3.1/E.java
低 住 佐 佑 佒 体 佔 何 佖 佗 佘 余 佚 佛 作 佝 佞 佟 你 佡
```

   (2) System.out.print() 输出完毕后不换行，而 System.out.println() 输出结束后自动换行。
```java
public class OutputData {
	public static void main(String args[]) {
		int x = 234, y = 432;
		System.out.println(x + " < " + (2*x));
		System.out.print("我输出结果后不回车");
		System.out.println("我输出结果后自动回车到下一行");
		System.out.println("x + y = " + (x+y));
	}
}
```
```
[admin@iZbp18743tpvttty07dgbrZ 2]$ java ./3.2/OutputData.java
234 < 468
我输出结果后不回车我输出结果后自动回车到下一行
x + y = 666
```

   (3) 这里的代码使用了包装类型 (wrap class)，以此获取各数据类型的范围，达到类似 C/C++ limits.h 头文件类似的效果。
```java
public class E {
	public static void main(String args[]) {
		System.out.println("byte取值范围: "+Byte.MIN_VALUE+" to "+Byte.MAX_VALUE);
		System.out.println("short取值范围: "+Short.MIN_VALUE+" to "+Short.MAX_VALUE);
		System.out.println("int取值范围: "+Integer.MIN_VALUE+" to "+Integer.MAX_VALUE);
		System.out.println("long取值范围: "+Long.MIN_VALUE+" to "+Long.MAX_VALUE);
		System.out.println("float取值范围: "+Float.MIN_VALUE+" to "+Float.MAX_VALUE);
		System.out.println("double取值范围: "+Double.MIN_VALUE+" to "+Double.MAX_VALUE);
	}
}
```
```
[admin@iZbp18743tpvttty07dgbrZ 2]$ java ./3.3/E.java
byte取值范围: -128 to 127
short取值范围: -32768 to 32767
int取值范围: -2147483648 to 2147483647
long取值范围: -9223372036854775808 to 9223372036854775807
float取值范围: 1.4E-45 to 3.4028235E38
double取值范围: 4.9E-324 to 1.7976931348623157E308
```

   (4) 第 5 行 `b = a;` 导致 b 与 a 引用/指向了相同的数组。因此，b 的长度也变成了 4，b[0] 就是 a[0]，即 1. 

```java
public class E {
	public static void main (String args[]) {
		long[] a = {1,2,3,4};
		long[] b = {100,200,300,400,500};
		b = a;
		System.out.println("数组b的长度: "+b.length);	// Code 1
		System.out.println("b[0] = "+b[0]);				// Code 2
	}
}
```
```
[admin@iZbp18743tpvttty07dgbrZ 2]$ java ./3.4/E.java
数组b的长度: 4
b[0] = 1
```

   (5) 类似上面，b[0] 与 a 引用了同样的数组。因此，b[0][3] 就是 a[3]，`b[0][1] = b[1][3]`实际上将 b[1][3] 中的数字 7 赋值给了 a[1]。

```java
public class E {
	public static void main(String args[]) {
		int[] a = {10,20,30,40}, b[] = {{1,2},{4,5,6,7}};
		b[0] = a;
		b[0][1] = b[1][3];
		System.out.println("b[0][3] = "+b[0][3]);	// Code 1
		System.out.println("a[1] = "+a[1]);		// Code 2
	}
}
```
```
[admin@iZbp18743tpvttty07dgbrZ 2]$ java ./3.5/E.java
b[0][3] = 40
a[1] = 7
```

4.(1) 编写一个应用程序，给出汉字“你”“我”“他”在 Unicode 表中的位置。代码及运行结果如下。

```java
public class ch {
	public static void main(String args[]) {
		char[] c = {'你','我','他'};
		for ( int i = 0; i < 3; i++ )	{
			System.out.println(c[i]+" in Unicode: "+(int)c[i]);
		}
	}
}
```
```
[admin@iZbp18743tpvttty07dgbrZ 2]$ java ./4/ch.java
你 in Unicode: 20320
我 in Unicode: 25105
他 in Unicode: 20182
```

   (2) 编写一个Java应用程序，输出全部的希腊字母。因希腊字母有不同写法，这里输出除小写24个希腊字母外，Unicode 962 位为保留的未定义字符，在不同的字体、不同的运行环境下，可能有不同的运行结果（大写希腊字母也存在此问题）。代码及运行结果如下。
```java
public class GreekAlpha {
	public static void main(String args[]) {
		for ( int i = 945; i <= 969; i++ ) {
			System.out.print((char)i+" ");
		}
		System.out.println();
	}
}
```
![](./Chapter2/result.png)

