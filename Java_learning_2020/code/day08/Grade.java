/*
编程完成如下要求：
	班级Grade类：
		属性：编号，名称，地址
		定义：无参构造方法、有参构造方法
		定义方法：显示班级的信息。
	学生类：
		属性：学号，姓名，性别，年龄，所在班级
		定义方法：显示学生的信息(学号，姓名，性别，年龄，班级编号，班级名称)
		
		注意：所在班级应为班级类的类型
	测试类：
		通过有参构造方法，创建班级对象
		通过无参构造方法，创建学生类对象
		调用显示信息的方法显示学生的信息
*/
class Grade{
	//属性：编号，名称，地址
	int num;
	String name;
	String address;

	//构造方法
	public Grade(){

	}
	public Grade(int num,String name,String address){
		this.num = num;
		this.name = name;
		this.address = address;
	}
	//方法：显示班级的信息。
	public void show(){
		System.out.println("班级编号：" + num + "\n班级名称：" + name + "\n班级地址：" + address);
	}
}
//编写学生类
class Student{
	//构造方法
	public Student(){

	}
	public Student(int id,String name,char sex,int age,Grade g){
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.g = g;
	}
	//属性：学号，姓名，性别，年龄，所在班级
	int id;
	String name
	char sex;
	int age;
	Grade g = new Grade();  //注意：g没有赋值时，则默认值为null
	//方法：显示学生的信息(学号，姓名，性别，年龄，班级编号，班级名称)
	public void showInfo(){
		System.out.println("学生信息如下：");
		//System.out.println("学号：" + id + "\n姓名：" + name + "\n性别：" + sex + "\n年龄：" + age + "\n班级编号:" + g.num + "\n班级名称：" + g.name + "\n班级地址：" + g.address);
		
		//也可以编写为：
		System.out.println("学号：" + id + "\n姓名：" + name + "\n性别：" + sex + "\n年龄：" + age);
		g.show();
	}
}
//测试类
class Test{
	public static void main(String[] args){
		//通过有参构造方法，创建班级对象
		/*Grade grade = new Grade(431,"Java基础班","四楼四教室");
		//通过无参构造方法，创建学生类对象
		Student s = new Student();
		//调用显示信息的方法显示学生的信息
		s.showInfo();*/

		//创建学生对象同时对学生中所有属性赋值
		Student s2 = new Student(1001,"李四",'男',21,new Grade(432,"Java","北京大兴"));
		s2.showInfo();
	}
}