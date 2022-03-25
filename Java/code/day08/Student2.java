/*
编写学生类，属性：姓名、年龄、性别
编写学生测试类，创建学生对象，输出学生所有信息
*/
class Student2{
	//属性
	String name;
	//第一步：将属性设置为私有的private,只能在本类中使用
	private int age;
	char sex;
	//第二步：编写对应属性的赋值setXxx和取值getXxx方法
	public void setAge(int age){
		//第三步：根据情况编写判断语句
		//将局部变量的值赋给成员变量,年龄：0---100，否则为18
		if(age >= 0 && age <= 100){
			this.age = age;
		}else{
			this.age = 18;
		}
	}
	public int getAge(){
		return age; //表示返回成员变量age的值
	}
}
//编写学生测试类
class StudentTest2{
	public static void main(String[] args){
		//实例化学生
		Student2 s = new Student2();
		s.name = "Joe";
		/*
			通过运行发现问题：
				有些属性，如：年龄、性别,不符合实际意义
			解决办法：
				在赋值之前进行判断，当前值如果合法则进行赋值，否则不进行赋值，称为封装
		*/
		//s.age = 12345;
		/*s.sex = 'a';
		System.out.println("姓名: " + s.name + "\n年龄：" + s.age + "\n性别：" + s.sex); */

		s.setAge(23);
		System.out.println("Age: " + s.getAge());
	}
}