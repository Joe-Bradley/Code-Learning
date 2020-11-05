import java.util.Scanner;  //第一步：导入包，必须位于Java源文件中的第一行
class Var01{
	public static void main(String[] args){
		//浮点类型
		double x = 0.1;
		x = 999.99;
		x = -123.09;
		System.out.println("x = " + x);

		//float y = 0.87;  //出现编译错误，原因：在Java中，取值范围大的类型不能直接给取值范围小的类型赋值
		//解决办法第一种方法：将0.87值变为float类型，也就是在该值后面添加f或F，然后再给左侧float类型赋值
		/*float y = 0.87f;   //没有构成类型转换
		System.out.println("y = " + y); */
		//解决办法第二种方法：当取值范围大的类型赋给取值范围小的类型时，必须进行强制类型转换，也就是说在该值前面添加(目标类型)
		float y = (float)0.87;  //构成强制类型转换
		y = 100.3F;
		System.out.println("y = " + y);
	}
}
class Var02{
	public static void main(String[] args){
		//字符类型
		char ch = 'a';
		ch = 'H';
		ch = '好';
		ch = 100;  //注意：整数值可以给字符类型直接赋值，字符中存放的就是ASCII对应的字符
		ch = 65;
		ch = 65535;  //注意：字符类型取值范围的：0----65535
		System.out.println("ch = " + ch);

		int i = 12;
		i = 6;
		i = 'a';  //注意：字符也可以直接给int类型赋值，int类型的变量中存放的就是对应字符的ASCII
		System.out.println("i = " + i);
	}
}
class Var03{
	public static void main(String[] args){
		//布尔类型
		boolean x = true;
		x = false;
		System.out.println("x = " + x);
	}
}
class Cast04{
	public static void main(String[] args){
		//自动类型转换也叫做隐式类型转换
		/*byte a = 1;
		int b = a;  //构成自动类型转换
		float c = b;  //构成自动类型转换
		System.out.println("c = " + c);

		double d = c;  //构成自动类型转换 */
		
		//强制类型转换也叫做显式类型转换
		/*int i = (int)3.14;  //构成强制类型转换也叫做显式类型转换
		System.out.println("i = " + i);

		byte a = 3;
		short b = a; //构成自动类型转换
		int c = a + b;
		c = a + 'A';

		System.out.println("c = " + c);*/

		int i = 5;
		long j = 6;
		double k = 1.2;
		double x = i + j + k;

	}
}
class Operator05{
	public static void main(String[] args){
		//+
		//注意：1.当+两边的操作数都是数值类型，则做加法运算
		/*System.out.println(10 + 20);  //30
		System.out.println(10 + 20.0);  //30.0
		
		int a = 3,b = 4;
		int sum = a + b;
		//注意：2.当+两边的操作数中有一个为非数值类型，则做连接,最终连接后的结果为String
		System.out.println("sum = " + sum); //"sum = 7"
		System.out.println("sum = " + a + b);  //"sum = 34"
		System.out.println("sum = " + (a + b));

		//-
		System.out.println(10 - 20); // -10
		System.out.println(6 - 4.3); //1.7
		int x = 5,y = 6;
		int z = x - y;
		System.out.println("z = " + z);  //z = -1
		//注意：当做减法运算时，必须保证两个操作数都是数值类型
		//System.out.println("z = " + x - y);  //"z = 5" - 6   ,出现编译错误
		System.out.println("z = " + (x - y)); */

		//*
		/*System.out.println(5 * 6);  //30
		System.out.println(5.0 * 6.0);  //30.0
		int m = 3,n = 4;
		int s = m * n;
		System.out.println("s = " + s);
		System.out.println("s = " + m * n);  //"s = 12"

		System.out.println(99999 * 0); //0
		System.out.println(1234567 * 1); //1234567
		System.out.println(2 * 2 * 2); */

		//除法
		/*System.out.println(10 / 2); //5
		System.out.println(10 / 3);  //3
		System.out.println(11 / 4); //2
		System.out.println(7 / 2.0);  //3.5
		System.out.println("结果为：" + 20 / 6); */

		// %
		System.out.println(10 % 5);  //0
		System.out.println(9 % 3.0);  //0.0
		System.out.println(4 % 6);  //4
		System.out.println(12 % 10);  //2
		System.out.println(0 % 10);  //0
		//System.out.println(6 % 0);  //注意：除数不能为0
	}
}
class Operator06{
	public static void main(String[] args){
		//练习：计算123数中各个位之和
		int num = 123;
		//获取当前数123中的各个位
		int gw = num % 10;
		int sw = num / 10 % 10;
		int bw = num / 100;
		//计算各个位之和
		int sum = gw + sw + bw;
		System.out.println("sum = " + sum);
	}
}
class Operator07{
	public static void main(String[] args){
		//++
		/*int a = 3;
		int b = ++a;  //a = 4   b = 4
		System.out.println("a = " + a + "\nb = " + b);

		int x = 5;
		//int y = x++;  //y = 5  x = 6
		int y = x++ + 2;  //x = 6  y = 7
		System.out.println("x = " + x + "\ny = " + y); */

		//--
		int a = 6,b = 8;
		//int c = a-- / 2;  //c = 3
		int c = --a * b++;   //a = 5  b = 9   c = 40
		System.out.println("c = " + c);
	}
}
class Operator08{
	public static void main(String[] args){
		/*int a = 12;
		int b = 3;
		String s = "" + a + b;
		
		//赋值运算符
		int c = 3 * 2 % 6;
		
		//扩展赋值运算符
		int x = 5;
		x = x + 1;  //也可以编写为：x += 1; */

		int a = 123,s = 0;
		//s = s * 10 + a % 10;  //s = 3
		//上一条语句是否等价于如下代码？ ----不等价
		s *= 10 + a % 10;  //等价于  s = s * (10 + a % 10);
		System.out.println("s = " + s);
		
		//总结：当是扩展赋值运算符时，变量最终的数据类型没有发生改变
		int x = 10;
		//x += 0.5;  //结果x = 10 
		//x = x + 0.5;  //出现编译错误
		System.out.println("x = " + x);
	}
}
class Operator09{
	public static void main(String[] args){
		//关系运算符：最终结果为boolean类型的值
		System.out.println(1 > 2);  //false
		System.out.println(10 > 9); //true
		System.out.println(5 != 3);  //true
		//优先级别：算术运算符 > 关系运算符 > 赋值运算符
		System.out.println(9 % 2 == 0); //false
		System.out.println(2 + 3 / 6 <= 4 * 2 % 5); //true
		boolean b = 7 / 4 + 5 % 2 == 16 / 8 - 5 * 2 % 3;
		System.out.println("b = " + b); //false
	}
}
class Operator10{
	public static void main(String[] args){
		//逻辑运算符:最终结果为boolean类型的值
		/*System.out.println(9 > 1 & 0 != 1); //true
		System.out.println(3 <= 1 & 100 > 10);  //false
		//优先级别：算术运算符 > 关系运算符 > 逻辑运算符
		System.out.println(9 / 6 - 4 % 2 > 0 & 18 % 9 == 0);  //true
		System.out.println(0 > 1 & 3 <= 2);  //false */

		/*System.out.println(30 > 17 | 19 < -20);  //true
		System.out.println(12 % 3 != 1 | 81 / 9 == 0);  //true
		System.out.println(-1 > 3 | 8 > 77); //false */

		/*System.out.println(8 != 9 ^ 12 > 10);  //false
		System.out.println(0 < 1 ^ 1 > 10);  //true
		System.out.println(2 / 3 + 4 % 15 <= 10 % 7 ^ 12 / 5 <= 8 % 4);  //false*/

		/*System.out.println(!false);  //true
		System.out.println(!!false);  //false
		//System.out.println(!1 > 9); //出现编译错误
		System.out.println(!(1 > 9));  //true */

		//总结：短路与、逻辑与运行结果都相同，但是执行过程可能不同，当使用短路与，并且第一个条件为false时，则结果直接为false
		/*System.out.println(10 > 5 && 8 != 1); //true
		System.out.println(10 > 5 & 8 != 1); //true

		System.out.println(3 > 19 && 0 < 1);  //false
		System.out.println(3 > 19 & 0 < 1);  //false
	
		System.out.println(5 < 6 && 1 >= 2);  //false
		System.out.println(5 < 6 & 1 >= 2);  //false */

		//总结：短路或、逻辑或运行结果都相同，但是执行过程可能不同，当使用短路或，并且第一个条件为true时，则结果直接为true
		System.out.println(1 != 2 || 55 > 66);  //true
		System.out.println(1 != 2 | 55 > 66);  //true

		System.out.println(2 >= 12 || 5 <= 9);  //true
		System.out.println(2 >= 12 | 5 <= 9);  //true

	}
}
class Operator11{
	public static void main(String[] args){
		/*
			练习：判断10大于20
			语法格式：条件 ? 代码1 : 代码2
		*/
		/*String s = 100 > 20 ? "大于" : "不大于";
		System.out.println("s = " + s); */
		//练习：判断12是奇数还是偶数
		//练习：判断一个数(如：-3)，如果大于0，则输出1，如果小于0，则输出-1，否则输出0
		int num = -3;
		int i = num > 0 ? 1 : num < 0 ? -1 : 0;
		System.out.println(i);
	}
}
class Input12{
	public static void main(String[] args){
		//练习：输入一个数，并将该数输出
		//第二步：创建Scanner对象
		Scanner input = new Scanner(System.in);
		//第三步：友好提示
		System.out.print("请输入一个数：");
		//第四步：键盘输入
		int num = input.nextInt();  //注意：等待用户接收键s盘输入值，当按回车键，则表示输入完毕，并将回车之前所输入的内容赋给左侧的变量
		System.out.println("num = " + num);
	}
}
class Input13{
	public static void main(String[] args){
		//练习：计算两个数的和
		Scanner input = new Scanner(System.in);
		System.out.print("请输入第一个数：");
		int num1 = input.nextInt();
		System.out.print("请输入第二个数：");
		int num2 = input.nextInt();
		int sum = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + sum); //6 + 7 = 13
	}
}