class Hello{
	public static void main(String[] args){
		System.out.println("这是day02目录中的Hello");
	}
}
class Var02{
	public static void main(String[] args){
		//变量的操作步骤：
		//第一步：声明变量
		int a;
		double b;
		String c;
		//第二步：赋值
		a = 100;
		b = 3.14;
		c = "北京市";
		//第三步：使用
		//System.out.println("a");  //注意：双引号中的内容是原样输出的
		//注意：如果想输出变量名称中的值，则不需要双引号
		System.out.println(a); //100
		System.out.println(b);
		System.out.println(c);
	}
}
class Var03{
	public static void main(String[] args){
		//优化Var02类中的代码
		//在声明的同时完成赋值，也就是说第一步和第二步合二为一，语法格式：数据类型 变量名称 = 值;
		int a = 100;
		double b = 3.14;
		String c = "北京市";
		
		//使用
		System.out.println("a = " + a);  //+表示连接
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}
}
class Var04{
	public static void main(String[] args){
		//将0.1   99.87  -1  59.9值存放在变量中，并输出变量中的值
		/*double a;
		double b;
		int c;
		double d;*/

		//优化，如果有多个变量类型相同时，则可以一次声明多个变量，之间使用英文的逗号隔开
		//double a,b,d;
		double a = 0.1,b = 99.87,d = 59.9;
		int c = -1;
		System.out.println("a = " + a + "\nb = " + b + "\nd = " + d + "\nc = " + c);  // 其中\n表示换一行
	}
}
class Var05{
	public static void main(String[] args){
		System.out.println("Hello\n\nWorld");
		System.out.println("Hello\tWorld");
		
		//输出：D:\course\JavaProjects\02-JavaSE\day02
		System.out.println("D:\\course\\JavaProjects\\02-JavaSE\\day02");

		//输出"D:\course\JavaProjects\02-JavaSE\day02"
		System.out.println("\"D:\\course\\JavaProjects\\02-JavaSE\\day02\"");

		//输出：'D:\\course\\JavaProjects\\02-JavaSE\\day02'
		System.out.println("\'D:\\course\\JavaProjects\\02-JavaSE\\day02\'");
		System.out.println("'D:\\course\\JavaProjects\\02-JavaSE\\day02'");

		System.out.println("Hello\u0000World");
		System.out.println("Hello\u2605World");
	}
}
class Var06{
	double j;  //j就是成员变量
	public static void main(String[] args){
		int i;  //i就是局部变量
	}
}
class Var07{
	public static void main(String[] args){
		int i;
		double j;
		i = 123;
		String s;
		char ch;
		ch = '男';
		j = 3.14;
		s = "李四";
	}
}
class Var08{
	public static void main(String[] args){
		//byte
		byte a = 1; //注意：在Java中，当对byte short char类型赋值时，如果没有超出该类型取值范围则可以直接赋值
		a = 5;
		a = -128;
		//a = 128;  //出现编译错误，因为超出byte类型取值范围
		System.out.println("a = " + a);

		//short
		short b = 128;
		b = -32768;
		//b = 32768;  //出现编译错误，超出short类型取值范围，解决办法：只能找一个比该类型范围大的类型存储该值

		System.out.println("b = " + b);

		//int
		int c = 0;
		//c = 12345678901;  //出现编译错误，超出int类型范围
		System.out.println("c = " + c);

		//long
		long d = 6;  //注意：在Java中，取值范围小的类型可以直接赋给取值范围大的类型，构成自动类型转换
		d = 123456;
		//d = 12345678909;  //出现编译错误，因为值默认为int，超出int取值范围
		//解决办法：将右侧的值后面添加L或l，此时该值就为long,也就是说该值就为long类型
		d = 12345678909L;  //没有构成自动类型转换
		System.out.println("d = " + d);
	}
}