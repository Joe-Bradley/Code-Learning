class Student{
	String name;  //默认值为null
	int age;	//默认值为0
	String sex;	//默认值为\u0000
	String address;	//默认值为null
	public void study(){
		System.out.println("Learning now");
	}
}
//编写学生的测试类
class StudentTest{
	public static void main(String[] args){
		Student zs = new Student();
		//通过引用名称zs获取对象中的属性
		System.out.println(zs.name);  //null
		System.out.println(zs.age);  //0
		System.out.println(zs.sex);  //null
		System.out.println(zs.address); //null
		//对对象中的属性进制赋值，如：引用名称.属性名称 = 值;
		zs.name = "Joe";
		zs.age = 19;
		zs.sex = "Male";
		zs.address = "Beijing";
		//输出引用名称zs对应对象中所有属性的值
		System.out.println("Name:" + zs.name + "\nAge:" + zs.age + "\nSex:" + zs.sex + "\nAddress:" + zs.address);
		//使用引用名称访问对象中的方法，语法格式：引用名称.方法名称();
		zs.study();
	}
}