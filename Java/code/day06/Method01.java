import java.util.*;
class Method01{
	public static void print(){
		System.out.print("hello");
	}
	public static void main(String[] args){
		print();
	}
}
class Method02{
	public static void main(String[] args){
		//调用Method01类中的print方法
		//Method01.print();
		//print();  //出现编译错误
	}
}
class Method03{
	/*
		练习3：计算1+2的和，要求使用方法完成
		分析：
			1.该题只有一个结果，此时就可以编写为带返回类型的方法完成
			2.带返回类型的方法语法格式：
				public static 返回类型 方法名称(){
					方法体
				}
			
			3.该方法返回该题的结果，因此返回类型编写为对应结果的类型
			返回类型编写为目前所学9种数据类型之一，如：int  double String char boolean......
			4.必须在方法体中通过return将结果返回
			5.在调用处进行处理：
				使用变量接收，然后再输出变量中的值
	*/
	public static int sum(){
		int s = 1 + 2;
		return s; //通过return将结果s的值3返回到方法的调用处
	}
	/*
		练习2：输出1---100中的每个数，要求使用无参无返回类型的方法完成
		语法格式：
		public static void 方法名称(){
			方法体
		}
	*/
	public static void print(){
		for(int i = 1;i <= 100;i++){
			System.out.println(i);
		}
	}
}
class Method04{
	public static void main(String[] args){
		//调用Method03类中的print方法
		//Method03.print();

		//调用Method03类中的sum方法
		int a = Method03.sum();  //注意：先调用方法，然后将方法返回的结果，如：3，再赋给左侧的变量名称a
		System.out.println(a);
	}
}
class Method05{
	//练习6：判断一个数(如：12),是否是三位数
	//练习5：判断一个字符(如:'d'),判断是大写字母、小写字母还是数字字符
	public static String result2(){
		char ch = '#';
		if(ch >= 'A' && ch <= 'Z'){
			return "大写字母";
		}else if(ch >= 'a' && ch <= 'z'){
			return "小写字母";
		}else if(ch >= '0' && ch <= '9'){
			return "数字字符";
		}else{
			return "其他字符";
		}
	}

	//练习4:判断12是奇数还是偶数
	public static String result(){
		/*if(12 % 2 == 0){
			return "是偶数";
		}else{
			return "是奇数";
		}*/

		//也可以编写为：
		return 12 % 2 == 0 ? "是偶数" : "是奇数";
	}
	
	public static void main(String[] args){ 
		//调用result方法
		/*String s = result();
		System.out.println(s);*/

		//也可以编写为如下代码：
		//System.out.println(result());
		
		//调用本类中的result2方法
		System.out.println(result2());  //先调用方法， 然后将返回结果再进行输出
	}
}
class Method06{
	//输出：1	2
	public static void print3(){
		for(int i = 1;i <= 5;i++){
			if(i == 3){
				return;  //返回到方法的调用处
			}
			System.out.print(i + "\t");
		}
		System.out.println("OK");
	}
	//输出：1	2	4	5	yes
	public static void print2(){
		for(int i = 1;i <= 5;i++){
			if(i == 3){
				continue;
			}
			System.out.print(i + "\t");
		}
		System.out.println("yes");
	}
	//输出:1	2	Hello
	public static void print(){
		for(int i = 1;i <= 5;i++){
			if(i == 3){
				break;
			}
			System.out.print(i + "\t");
		}
		System.out.println("Hello");
	}
	public static void main(String[] args){
		//print();
		//print2();
		print3();
	}
}
class Method07{
	//练习7：根据输入的星期，得到每天做的事情，星期一、星期二、星期四、星期六学习，星期三、星期五自习，星期日休息
	public static String getInfo(){
		String week = "星期5";
		switch(week){
		case "星期一":
		case "星期二":
		case "星期四":
		case "星期六":
			return "学习";
			//break;  //出现编译错误，是无法访问的语句，原因：该条语句之上有return,当遇到return就返回到调用处
		case "星期三":
		case "星期五":
			return "自习";
			//break;
		default:
			return "休息";
			//break;
		}
	}
	public static void main(String[] args){
		//调用本类中的getInfo方法
		System.out.println(getInfo());
	}	
}
class Method08{
	//练习9：计算两个数的差，可以编写为带参无返回类型的方法完成
	public static void sub(double num1,double num2){  //num1和num2就是形参
		double result = num1 - num2;
		System.out.println(num1 + " - " + num2 + " = " + result);
	}
	/*
		练习8:使用方法完成，输出1---n中的每个数
		分析得到：
			1.该题中有未知的数，因此可以编写为带参数的方法
			2.带参方法的语法格式：
				public static void 方法名称(参数列表){
					方法体
				}
			3.每个参数语法格式：数据类型 参数名称
			  多个参数之间使用英文逗号隔开
			4.方法中未知的编写为参数，称为形式参数简称形参
			  调用方法时参数为已知的称为实际参数，简称实参
			  也就是实参的值赋给形参变量,必须保证实参与形参个数一致、类型一致、顺序一致
	*/
	public static void print(int n){ //n就是形参
		for(int i = 1;i <= n;i++){
			System.out.println(i);
		}
	}
	public static void main(String[] args){
		//调用本类中的print方法
		/*print(5);  //5就是实参
		System.out.println();
		print(10); */

		//调用Method08类中的sub方法
		//Method08.sub(5.6,0.9);
		
		double num1 = 5.6;
		double num2 = 0.9;
		Method08.sub(num1,num2);
	}
}
class Method09{
	/*
		练习11：判断一个三位数是否是水仙花数
		分析得到：1.该题有未知的三位数，编写为参数，如：int num
				   2.该题有两种情况，但是只得到一个结果，因此可以编写为带返回类型
				   3.当一个题中是否这种情况时，一般返回类型编写为boolean
	*/
	public static boolean isFlag(int num){
		//先判断是否是三位数
		if(num >= 100 && num <= 999){
			//获取当前数num中的各个位
			int gw = num % 10,sw = num / 10 % 10,bw = num / 100;
			//计算各个位的立方和
			int sum = gw * gw * gw + sw * sw * sw + bw * bw * bw;
			//判断立方和是否与当前数num相等
			/*if(sum == num){
				return true; //true表示是水仙花数
			}else{
				return false; //false表示不是水仙花数
			}*/
			
			//等价于上面的if else
			return sum == num;
		}else{
			return false; //false表示不是水仙花数
		}
	}
	//练习10：判断一个年龄，输出老年、中年、青年、少年
	public static void print(int age){
		if(age >= 65){
			System.out.println("老年");
		}else if(age >= 30){
			System.out.println("中年");
		}else if(age >= 18){
			System.out.println("青年");
		}else{
			System.out.println("少年");
		}
	}
	//编写带返回带参数的方法
	public static String getInfo(int age){
		if(age >= 65){
			return "老年";
		}else if(age >= 30){
			return "中年";
		}else if(age >= 18){
			return "青年";
		}else{
			return "少年";
		}
	}

	public static void main(String[] args){
		/*Scanner input = new Scanner(System.in);
		System.out.print("请输入年龄：");
		int age = input.nextInt();
		//print(age);

		System.out.println(getInfo(age)); */

		System.out.println(isFlag(153));
	}
}
class Method10{
	//练习12：编写方法实现输出所有三位数的水仙花数
	public static void print(){
		for(int i = 100;i <= 999;i++){
			if(Method09.isFlag(i)){
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args){
		//调用本类中的print方法
		print();
	}
}
class Method11{
	//总结：在同一个类中，方法的名字相同，参数列表必须不同(类型不同、个数不同、顺序不同),与返回类型无关，构成方法的重载
	//练习13：使用方法完成，获取两个数中的最大数
	public static int max(int a,int b){
		return a > b ? a : b;
	}
	public static void max(double x,int y){
		System.out.println(x > y ? x : y);
	}
	public static void max(double x,double y){
		System.out.println(x > y ? x : y);
	}
	public static void main(String[] args){
		System.out.println(max(10,12));
		System.out.println(max(345,54));
		max(0.9,1);
		max(13.1,12.9);


		System.out.println(123);
		System.out.println("HelloWorld");
		System.out.println();
	}
}