import java.util.*;

class If01{
	public static void main(String[] args){
		//练习1：假如张三参加Java考试，判断如果在95分以上则有奖励
		Scanner input = new Scanner(System.in);
		System.out.print("请输入张三的Java考试成绩：");
		double score = input.nextDouble();
		/*if(score > 95){
			System.out.println("有奖励");
		}*/

		//注意：在Java中，当代码块只有一条语句时，则大括号可以省略,建议初学者编写大括号
		if(score > 95)
			System.out.println("有奖励");
		System.out.println("OK");
		
	}
}
class If02{
	public static void main(String[] args){
		//练习2：假如张三参加Java考试，判断如果在95分以上则有奖励，否则发红包
		Scanner input = new Scanner(System.in);
		System.out.print("请输入成绩：");
		double score = input.nextDouble();
		//第一种方法：使用两个if块完成的
		/*if(score > 95){
			System.out.println("有奖励");
		}
		if(score <= 95){
			System.out.println("发红包");
		}*/

		//第二种方法：使用if else完成
		/*if(score > 95){
			System.out.println("有奖励");
		}else{
			System.out.println("发红包");
		}*/

		//第三种方法：使用三目运算符完成
		//System.out.println(score > 95 ? "有奖励" : "发红包");
		
		//第四种方法：使用多重if选择结构完成
		if(score > 95){
			System.out.println("有奖励");
		}else if(score <= 95){
			System.out.println("发红包");
		}
	}
}
class If03{
	public static void main(String[] args){
		//练习3：判断一个数是奇数还是偶数
		//练习4：判断一个数是否是三位的正数
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个数：");
		int num = input.nextInt();
		if(num >= 100 && num < 1000){
			System.out.println(num + "是三位的正数");
		}else{
			System.out.println(num + "不是三位的正数");
		}
		//练习5：输入两个数，分别存放在a和b中，判断a+b的和大于100，则输出a的值，否则输出b的值
	}
}
class If04{
	public static void main(String[] args){
		//练习6：根据输入的年龄，输出是老年、中年、青年还是少年
		Scanner input = new Scanner(System.in);
		System.out.print("请输入年龄：");
		int age = input.nextInt();
		//老年：55以上，中年：30---54，青年：18---29，少年：18以下(0---17)
		/*if(age >= 55){
			System.out.println("老年");
		}else if(age >= 30){
			System.out.println("中年");
		}else if(age >= 18){
			System.out.println("青年");
		}else if(age < 18){
			System.out.println("少年");
		}*/

		//注意：多重if选择结构中的条件顺序可以颠倒，但是可能会影响程序的运行结果,解决办法：当颠倒时，条件必须编写严谨
		/*if(age >= 55){
			System.out.println("老年");
		}else if(age >= 18 && age <= 29){
			System.out.println("青年");
		}else if(age >= 30){
			System.out.println("中年");
		}else if(age < 18){
			System.out.println("少年");
		}*/

		if(age >= 55){
			System.out.println("老年");
		}else if(age >= 18 && age <= 29){
			System.out.println("青年");
		}else if(age >= 30){
			System.out.println("中年");
		}else if(age < 18 && age >= 0){
			System.out.println("少年");
		}else{
			System.out.println("输入年龄有误！");
		}

		//练习7：判断一个字符，输出是大写字母、小写字母还是数字字符
	}
}
class If05{
	public static void main(String[] args){
		//练习8：判断一个两位数，是奇数还是偶数
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个数：");
		int num = input.nextInt();
		//判断，当前数num是否是两位数
		/*if(num >= 10 && num <= 99){
			//判断，当前数是奇数还是偶数
			if(num % 2 == 0){
				System.out.println(num + "是偶数");
			}else{
				System.out.println(num + "是奇数");
			}

		}else{
			System.out.println(num + "不是两位数");
		}*/

		//练习9：判断一个三位正整数，是否是水仙花数
		//判断，当前数是否是三位正整数
		if(num >= 100 && num <= 999){  //num = 123
			//获取各个位数
			int bw = num / 100,sw = num % 100 / 10,gw = num % 10;
			//计算各个位的立方和
			int sum = bw * bw * bw + sw * sw * sw + gw * gw * gw;
			//判断，各个位立方和是否与当前数num相等
			if(sum == num){
				System.out.println(num + "是水仙花数");
			}else{
				System.out.println(num + "不是水仙花数");
			}

		}else{
			System.out.println(num + "不是三位的正整数");
		}
	}	
}
class If06{
	public static void main(String[] args){
		//练习10：假如张三参加全国Java编程比赛，如果得第一名则奖励10W,如果得第二名则奖励5W,如果得第三名则奖励2W,否则没有任何奖励
		Scanner input = new Scanner(System.in);
		System.out.print("请输入名次：");
		String info = input.next();
		/*
			在Java中，字符串比较时，使用==比较的是地址是否一致
					  如果在字符串中比较内容，则必须使用equals(),如果相等则为true,否则为false
					  当字符串进行比较内容时，建议固定值编写在前面
		*/
		/*if(info == "第一名"){
			System.out.println("奖励10W");
		}else if(info == "第二名"){
			System.out.println("奖励5W");
		}else if(info == "第三名"){
			System.out.println("奖励2W");
		}else{
			System.out.println("对不起，没有任何奖励!");
		}*/

		//第一种方法：使用多重if完成
		if("第一名".equals(info)){
			System.out.println("奖励10W");
		}else if("第二名".equals(info)){
			System.out.println("奖励5W");
		}else if("第三名".equals(info)){
			System.out.println("奖励2W");
		}else{
			System.out.println("对不起，没有任何奖励!");
		}
	}
}
class Switch07{
	public static void main(String[] args){
		//练习10的第二种方法：使用switch case完成
		Scanner input = new Scanner(System.in);
		System.out.print("请输入名次：");
		String info = input.next();
		/*switch(info){
		case "第一名":
			System.out.println("奖励10W");
			break;  //表示中断，当遇到break则执行switch case外面的语句
		case "第二名":
			System.out.println("奖励5W");
			break;
		case "第三名":
			System.out.println("奖励2W");
			break;
		default:
			System.out.println("对不起，没有任何奖励!");
			break;
		}*/

		/*
			常见的注意事项：
			1.case后面常量值的顺序可以任意，一般按顺序编写
			2.default顺序也可以编写在switch中的任意位置
			  当所有case都不满足时则执行default
			  建议default编写在所有case的后面
			3.break是可有可无的
			  当没有编写break，则从当前第一个匹配的case一直向下执行(也就是穿透)
			  因此，根据题意适当编写break
			4.case也可以合并
		*/
		switch(info){
		case "第二名":
			System.out.println("奖励5W");
			
		case "第一名":
			System.out.println("奖励10W");
			//break;  //表示中断，当遇到break则执行switch case外面的语句
		default:
			System.out.println("对不起，没有任何奖励!");
			
		case "第三名":
			System.out.println("奖励2W");
		}
	}
}
class Switch08{
	public static void main(String[] args){
		//练习11：根据输入的星期，得到具体每天做的事情。星期一学习，星期二学习，星期三自习，星期四学习，星期五自习，星期六学习，星期日休息
		Scanner input = new Scanner(System.in);
		System.out.print("please enter the number:");
		char week = input.next().charAt(0);
		switch(week){
		case '1':
		case '2':
		case '4':
		case '6':
			System.out.println("studying");
			break;
		case '3':
		case '5':
			System.out.println("www");
			break;
		default:
			System.out.println("rest");
			break;
		}
	}
}