import java.util.*;

class Hello01{
	public static void main(String[] args){
		//练习1：输出5遍HelloWorld!,使用for循环完成
		/*System.out.println("HelloWorld!");
		System.out.println("HelloWorld!");
		System.out.println("HelloWorld!");
		System.out.println("HelloWorld!");
		System.out.println("HelloWorld!"); */

		for(int i = 1;i <= 5;i++){
			System.out.println("第" + i + "遍HelloWorld!");
		}
	}
}
class For02{
	public static void main(String[] args){
		//练习2：使用for循环完成，输出1---10中的每个数
		//练习3：使用for循环完成，输出1---50中所有的偶数
		//第一种方法：
		/*for(int i = 2;i <= 50;i += 2){
			System.out.println(i);
		}*/

		//第二种方法：
		/*for(int i = 1;i <= 50;i++){
			//判断当前数i，是否能被2整除
			if(i % 2 == 0){
				System.out.println(i);
			}
		}*/

		//练习4：使用for循环完成，输出所有三位数中能被6整除的数，并且每行显示5个
		int count = 0; //count表示统计能被6整除数的个数
		for(int i = 100;i <= 999;i++){
			//判断，当前数i是否是6的倍数
			if(i % 6 == 0){
				System.out.print(i + "\t");
				count++;  //count = 2
				//判断，当count的值为5的倍数时换行
				if(count % 5 == 0){
					System.out.println();
				}
			}
		}
	}
}
class For03{
	public static void main(String[] args){
		/*
			练习5：输出如下效果，要求：每次输出一个*
			 ******
		*/
		/*for(int i = 1;i <= 6;i++){
			System.out.print("*");
		}*/

		/*
			练习6：输出如下效果，要求：每次输出一个*
			 ******
			 ******
			 ******
		*/
		//第一种方法：使用一个循环完成
		/*for(int i = 1;i <= 18;i++){
			System.out.print("*");
			//判断，当前数i为6的倍数时则换行
			if(i % 6 == 0){
				System.out.println();
			}
		}*/
		//第二种方法：使用双重循环完成
		//输出1行的6个*
		/*for(int i = 1;i <= 6;i++){
			System.out.print("*");
		}
		System.out.println();
		for(int i = 1;i <= 6;i++){
			System.out.print("*");
		}
		System.out.println();
		for(int i = 1;i <= 6;i++){
			System.out.print("*");
		}
		System.out.println(); */

		//优化上面的代码，如下：
		for(int j = 1;j <= 3;j++){
			for(int i = 1;i <= 6;i++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
class For04{
	public static void main(String[] args){
		//注意：1.在for循环中，三个表达式都可以省略，但是分号必须编写，则出现死循环也叫做无限循环，解决办法：按ctrl + c强行终止程序运行
		/*for(;;){
			System.out.println("OK");
		}*/
		
		//注意：2.在for循环中，省略表达式1，则出现编译错误，解决办法：将表达式1编写在for循环上面
		/*int i = 1;
		for(;i <= 5;i++){
			System.out.println(i);
		}*/

		//注意：3.在for循环中，省略表达式2，则出现死循环或无限循环，也就是说当省略表达式2时，则条件默认为true
		/*for(int i = 1;;i++){
			System.out.println(i);
		}*/

		//注意：4.在for循环中，当省略表达式3，则出现死循环，解决办法：将表达式3编写在循环体中最后一条语句
		/*for(int i = 1;i <= 5;){
			System.out.println(i);
			i++;
		}*/

		//注意：5.当for循环中表达式1变量中的值在循环外进行使用，则出现编译错误，解决办法：将表达式1中声明的变量，编写在for循环外面进行声明
		int i;
		for(i = 1;i <= 5;i++){
			System.out.println(i);
		}
		System.out.println(i);  //6
	}
}
class While05{
	public static void main(String[] args){
		//练习7：使用while循环完成输出1---10中的每个数
		/*int i = 1;
		while(i <= 10){
			System.out.println(i);
			i++;
		}*/

		//练习8：使用while循环完成输出所有的两位数
		//练习9：使用while循环完成输出50----100范围内所有的奇数
		//第一种方法：
		/*int i = 51;
		while(i <= 100){
			System.out.println(i);
			i += 2;
		}*/

		//第二种方法：
		int i = 50;
		while(i <= 100){
			if(i % 2 != 0){
				System.out.println(i);
			}
			i++;
		}
	}
}
class While06{
	public static void main(String[] args){
		//练习10：使用while循环完成输出所有三位数中能被4整除的数，并且每行显示5个
		int i = 100,count = 0;  //i表示从100开始，count表示统计能被4整除的个数
		while(i <= 999){
			if(i % 4 == 0){
				System.out.print(i + "\t");
				count++;
				//判断当前count个数是否是5的倍数
				if(count % 5 == 0){
					System.out.println();
				}
			}
			i++;
		}
	}
}
class DoWhile07{
	public static void main(String[] args){
		//练习11：假如对张三进行机试题测试，要求：先编写上机题代码，然后老师检查，如果检查不合格，则继续编写代码，然后老师再检查......一直到检查合格为止
		Scanner input = new Scanner(System.in);  //建议该条语句编写在循环外面
		char info; //注意：info变量必须编写在循环外面进行声明，否则在循环条件中不能使用
		do{
			System.out.println("编写代码.......");
			System.out.println("老师检查是否合格?(y/n)");
			info = input.next().charAt(0);  
			//当info的值为n时则继续编写代码，老师检查
		}while(info == 'n');
	}
}
class DoWhile08{
	public static void main(String[] args){
		//练习12：输入一批整数，计算所有数的和，当输入0时则程序结束
		Scanner input = new Scanner(System.in);
		int sum = 0;  //sum表示存放所有数的和
		do{
			System.out.print("请输入一个整数：");
			int num = input.nextInt();
			//先判断当前数num是否为0
			if(num == 0){
				//程序结束
				break;  //break表示中断，当在循环中遇到break则结束当前整个循环，执行循环外面的语句
			}
			//对当前数num累加求和
			sum += num;  //sum = -37
		}while(true);
		System.out.println("所有数的和：" + sum);
	}
}
class For09{
	public static void main(String[] args){
		//练习13：输入5个人的Java考试成绩，统计成绩在95分以上的人数
		Scanner input = new Scanner(System.in);
		int count = 0; //表示统计95分以上的人数

		for(int i = 1;i <= 5;i++){ //i = 6
			System.out.print("请输入第" + i + "个人的成绩：");
			double score = input.nextDouble();
			//判断，当前成绩score,如果在95分及以下则继续输入下一个人成绩
			if(score <= 95){
				continue; //表示继续，当遇到continue语句时，则结束当次循环继续执行下一次循环
			}
			//统计95分以上的人数
			count++; //count = 2
		}
		System.out.println("95分以上的人数：" + count);
	}
}
