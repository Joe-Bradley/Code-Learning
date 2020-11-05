/*
学生类：
	属性：学号，姓名，性别、年龄
	方法： 自我介绍的方法、学习的方法
教师类：
	属性：姓名，性别，年龄，工资
	方法：自我介绍的方法、教学的方法
测试类：
	创建学生对象，调用方法
	创建教师对象 ，调用方法

分析得到：
人Person类：
	属性：姓名、性别、年龄
	方法：自我介绍方法
学生类 继承 人类
	独有属性：学号
	独有方法：学习
教师类 继承 人类
	独有属性：工资
	独有方法：教学
*/
class Person{
	//构造方法
	public Person(){

	}
	public Person(String name,char sex,int age){
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	//属性
	String name;
	char sex;
	int age;
	//方法
	public void sayHi(){
		System.out.print("您好，我叫" + this.name + ",今年" + this.age + "岁,性别是" + this.sex);
	}
}
//编写学生子类继承人的父类
class Student extends Person{
	//构造方法
	public Student(){

	}
	public Student(String name,char sex,int age,int id){
		/*this.name = name;  //也可以编写为super.name = name;
		this.sex = sex;
		this.age = age;*/

		//以上三条语句，也可以编写为如下：
		/*super.name = name; 
		super.sex = sex;
		super.age = age; */
		//以上三条语句，也可以编写为调用父类的带三个参数构造方法完成，使用super关键字
		//super();  //调用父类无参构造方法
		super(name,sex,age);
		this.id = id;
		
	}
	//编写独有属性
	int id;
	//编写独有方法：学习
	public void study(){
		System.out.println(name + "正在学习继承课程。。。。。。");
	}
	//重写父类的sayHi方法
	/*public void sayHi(){
		//System.out.println("您好，我叫" + name + ",今年" + age + "岁,性别是" + sex + ",学号是" + id);
		//注意：1.如果访问实例变量时，默认前面添加this. ，但是当使用this.访问实例变量时，先在当前类中找该属性，如果没有找到该属性则再去父类中找
		//System.out.println("您好，我叫" + this.name + ",今年" + this.age + "岁,性别是" + this.sex + ",学号是" + this.id);
		//注意：2.如果在子类中访问父类中的实例变量，则可以直接使用super关键字，super表示超类也就是父类
		//System.out.println("您好，我叫" + super.name + ",今年" + super.age + "岁,性别是" + super.sex + ",学号是" + this.id);
	
		//输出四个信息，但是前三个信息在父类的sayHi中，可以直接调用父类方法，然后再输出子类的独有信息
		//sayHi();  //等价于 this.sayHi();  //并没有完成调用父类的sayHi方法
		//解决办法：如果子类重写父类的方法，此时想再调用父类的sayHi方法，只能使用super.
		super.sayHi();
		System.out.println(",学号是" + id);
	}*/

	//完成输出学生四个信息
	public void print(){
		//前三个信息调用父类的sayHi方法
		this.sayHi();  //等价于 sayHi();  先在当前类中找，如果没找到再去父类中找
		System.out.println(",学号是" + id);
	}
}
//编写学生测试类
class StudentTest{
	public static void main(String[] args){
		//实例化学生
		//Student stu = new Student();
		/*stu.sayHi();
		stu.study(); */
		//stu.print();

		//创建学生对象同时执行带四个参数的构造方法
		Student stu2 = new Student("张三",'男',19,1001);
		stu2.print();
	}
}