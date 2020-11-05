/*
	编写狗类，属性：品种、颜色、名字、年龄、性别，方法：输出狗的信息
	编写狗的测试类，实例化狗，调用狗的方法输出信息
*/
class Dog{
	//无参构造方法
	public Dog(){
		//完成对品种、颜色、名字、年龄、性别
		strain = "土狗";
		color = "黑色";
		name = "旺财";
		age = 5;
		sex = '公';
	}
	//编写带参构造方法，完成对属性品种、颜色、名字
	public Dog(String strain,String color,String name){
		//完成局部变量的值，赋给成员变量
		this.strain = strain;
		this.color = color;
		this.name = name;
	}
	//编写对所有属性赋值的构造方法
	public Dog(String strain,String color,String name,int age,char sex){
		this.strain = strain;
		this.color = color;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public Dog(String name){
		this.name = name;
	}
	public Dog(int age){
		this.age = age;
	}
	//普通的方法，不是构造方法
	public void Dog(String name){
		this.name = name;
	}
	//属性也叫做成员变量
	String strain;
	String color;
	String name;
	int age;
	char sex;
	//方法：输出狗的信息
	public void print(){
		System.out.println("品种: " + strain + "\n颜色：" + color + "\n名字：" + name + "\n年龄：" + age + "\n性别：" + sex);
	}
}
//编写狗的测试类
class DogTest{
	public static void main(String[] args){
		//实例化狗
		/*Dog d = new Dog();
		//第一种方法：完成对对象中的属性赋值，使用引用名称.属性名称 = 值;
		d.strain = "拉布拉多犬";
		d.color = "黄色";
		d.name = "小黄";
		d.age = 3;
		d.sex = '公';
		d.print(); */

		//第二种方法：完成对对象中的属性赋值，使用构造方法完成
		//当创建对象时自动执行相匹配的构造方法
		/*Dog d2 = new Dog();
		d2.print();

		System.out.println("------------------------");
		Dog d3 = new Dog();
		d3.print(); */

		//创建Dog对象同时执行带三个参数的构造方法
		Dog d4 = new Dog("泰迪","棕色","小迪");
		d4.print();
		
		System.out.println();
		//创建对象同时完成对所有属性赋值
		Dog d5 = new Dog("哈士奇","白色","二哈",4,'公');
		d5.print();

		Dog d6 = new Dog();
	}
}