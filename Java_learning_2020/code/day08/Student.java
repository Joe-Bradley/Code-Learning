/*
	编写学生类，属性：名字、年龄，方法:输出学生信息
	编写学生的测试类，输出学生信息
*/
class Student{
	//属性
	String name;
	int age;
	//方法
	public void print(){
		System.out.println("名字：" + name + "\n年龄：" + age);
	}
}
//编写学生的测试类
class StudentTest{
	public static void main(String[] args){
		//创建学生对象
		//Student s = new Student();
		//将上一条语句编写为如下两条语句：
		/*Student s;  //声明了一个局部变量s，也叫做引用名称s,当前s是Student类型，Student类型是用户自定义的类作为类型
		s = new Student();
		s = new Student();
		s = null;
		
		int i;  //i是局部变量，并且是整数类型
		i = 10;
		i = 123; */

		Student s;
		s = new Student();
		s.print();
		s = new Student();
		s.name = "张三";
		s.print();

		s = null;
		//s.print();  //出现运行错误，错误是空指针异常，原因：引用名称s是null，因此不能访问某个对象中的属性或方法，如果非要访问则出现空指针异常
	
		//解决办法：在调用某个对象中的属性或方法时，必须保证该引用名称中存放对象的地址
		s = new Student();
		s.print();
	}
}