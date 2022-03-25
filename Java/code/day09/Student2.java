/*
编写学生类，属性：名字、现住址(北京)
*/
class Student{
	//静态代码块：完成对静态属性赋值
	static{
		address = "北京市";
		System.out.println("执行了静态代码块。。。。。");
	}
	//构造方法:完成对实例变量赋值
	public Student(){

	}
	public Student(String name){
		this.name = name;
	}
	//属性
	String name; //称为非静态属性，也叫做实例变量
	
	//static String address = "北京";  //称为静态属性也叫做类的变量
	static String address;

	//称为静态方法也叫做类的方法
	public static void print2(){

	}
	public static void print(){
		System.out.println("执行了print方法");
		//System.out.println(name);  //静态方法中只能访问静态属性、静态方法
		System.out.println(address);
		print2();
	}
	//称为非静态方法也叫做实例方法
	public void show(){
		System.out.println("执行了show方法");
		System.out.println(name);
		System.out.println(address);
		print();
	}
}
//编写学生测试类
class StudentTest{
	public static void main(String[] args){
		//创建对象
		/*Student s = new Student();
		Student s2 = new Student("张三");*/
		
		/*System.out.println(Student.address);   //北京
		Student s = new Student();
		System.out.println(s.name);  //null
		System.out.println(s.address);  //北京

		s = null;
		//System.out.println(s.name); //出现运行错误，不能访问对象中的实例变量
		System.out.println(s.address);  //北京  */

		/*Student.print();
		Student s = new Student();
		System.out.println(s.name);  //null
		s.show();
		s.print();

		s = null;
		//s.show();  //出现运行错误，因为该对象不存在
		
		s.print();*/

		System.out.println(Student.address);
		System.out.println(Student.address);
	}
}