class Student{
	//属性
	String name;
	int age;
	//构造方法
	public Student(){

	}
	public Student(String name,int age){
		this.name = name;
		this.age = age;
	}
}
//编写学生测试类
class StudentTest{
	public static void change(Student s){
		System.out.println(s.name);   //李四
		System.out.println(s.age);   //23
		s.name = "无名氏";
	}
	public static void main(String[] args){
		//实例化学生
		/*Student s = new Student("张三",19);
		Student s2;
		s2 = s;  //s和s2共用同一个地址，也就是说s和s2引用名称指向一个对象
		System.out.println("s2.name = " + s2.name);  //张三
		System.out.println("s2.age = " + s2.age); //19
		s2.name = "李四";
		System.out.println("s2.name = " + s2.name);  //李四
		System.out.println("s2.age = " + s2.age);  //19
		System.out.println("s.name = " + s.name); //李四
		System.out.println("s.age = " + s.age);  //19  */

		Student s = new Student("李四",23);
		System.out.println(s.name);  //李四
		System.out.println(s.age);  //23
		change(s);
		System.out.println("s.name = " + s.name);  //无名氏
		System.out.println("s.age = " + s.age); //23
	}
}