/*
编写学生类，属性：名字、年龄、性别
要求：使用封装完成，对所有属性进行赋值和取值
	年龄：1---120，否则19
	性别：男、女，否则男
*/
class Student{
	//属性
	private String name;
	private int age;
	private char sex;
	//编写所有属性的赋值setXxx
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		//判断1---120
		if(age >= 1 && age <= 120){
			this.age = age;
		}else{
			this.age = 19;
		}
	}
	public void setSex(char sex){
		//判断性别为男、女
		if(sex == '男' || sex == '女'){
			this.sex = sex;
		}else{
			this.sex = '男';
		}
	}
	//编写所有属性的取值getXxx
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public char getSex(){
		return sex;
	}	
}
//编写学生测试类
class StudentTest{
	public static void main(String[] args){
		//创建学生对象
		Student s = new Student();
		//对所有属性赋值，调用set方法
		s.setName("李四");
		s.setAge(1234);
		s.setSex('a');
		//输出引用名称s中所有属性的值
		System.out.println("姓名：" + s.getName() + "\n年龄：" + s.getAge() + "\n性别：" + s.getSex());
	}
}
