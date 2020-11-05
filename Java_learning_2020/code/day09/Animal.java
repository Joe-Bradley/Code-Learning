/*
编写狗类，属性：名字、年龄、品种、颜色，方法：显示信息
编写猫类，属性：名字、颜色、性别、年龄，方法：显示信息
编写测试类，创建猫和狗的对象，并分别显示信息

分析得到：
	如果多个类中有相同属性和方法，能否单独编写一个类？ ----能
解决办法：
	1.将多个类中相同的属性和方法编写在单独一个类中，该类称为父类
	2.在子类继承父类，然后在子类中编写独有的属性和方法
	
	动物Animal类：
		属性：名字、年龄、颜色
		方法：显示信息
	狗类 继承 动物类
		独有属性：品种

	猫类 继承 动物类
		独有属性：性别

好处：减少代码的冗余性(重复性)
*/
class Animal extends Object{
	//属性
	String name;
	int age;
	String color;
	//方法：显示信息
	public void show(){
		System.out.println("名字：" + name + "\n年龄：" + age + "\n颜色：" + color);
	}
	public Object getInfo(){
		return null;
	}
}
//编写狗的子类继承动物父类
class Dog extends Animal{
	//编写子类中独有属性和方法
	String strain;
	//重写也叫做覆盖override:在子类中重写父类的方法，必须与父类的方法名称一致、参数列表一致、返回类型一致、修饰符一致
	public void show(){
		//在子类中可以直接方法父类中的属性(前提：父类中属性没有使用private修饰)
		System.out.println("名字：" + name + "\n年龄：" + age + "\n颜色：" + color + "\n品种：" + strain);
	}
	//重写父类的getInfo方法
	public String getInfo(){
		return "OK";
	}
}
//编写猫的子类并继承动物父类
class Cat extends Animal{
	//独有属性：性别
	char sex;
}
//编写测试类
class Test{
	public static void main(String[] args){
		//创建狗的对象
		Dog d = new Dog();
		//显示信息
		d.show();  //先在Dog类中找show方法，如果没有找到则再去父类中找
	}
}