/*
编写父类Animal,属性：name、age、color，方法：显示信息
编写子类Dog,继承父类，独有属性：strain
编写狗的测试类，创建对象，输出狗的所有信息
*/
class Animal{
	//构造方法
	public Animal(){
		System.out.println("执行了父类的无参构造方法");
	}
	public Animal(String name,int age,String color){
		this.name = name;
		this.age = age;
		this.color = color;
		System.out.println("执行了父类的带三个参数的构造方法");
	}
	//属性
	String name;
	int age;
	String color;
	//方法
	public void show(){
		System.out.print("名字：" + this.name + ",年龄：" + this.age + ",颜色：" + this.color);
	}	
}
class Dog extends Animal{
	//构造方法
	//注意：1.当实例化子类时，先跳到子类相匹配的构造方法，如果当前子类构造方法中没有指明调用父类哪个构造方法，则默认调用父类的无参构造方法
	public Dog(){
		System.out.println("执行了Dog子类的无参构造方法");
	}
	public Dog(String strain){
		//super();  //等价于默认不编写
		super("未知",5,"未知");
		this.strain = strain;
		System.out.println("执行了Dog子类的带一个参数的构造方法");
	}
	/*public Dog(String name,int age,String color,String strain){
		this.name = name;
		this.age = age;
		this.color = color;
		this.strain = strain;
		System.out.println("执行了Dog子类的带四个参数的构造方法");
	}*/
	
	//注意：2.如果子类构造方法中使用super关键字指定调用父类哪个构造方法时，则先执行父类相匹配的构造方法
	public Dog(String name,int age,String color,String strain){
		super(name,age,color);
		this.strain = strain;
		System.out.println("执行了Dog子类的带四个参数的构造方法");
	}
	//编写独有属性
	String strain;
	//重写父类的show方法
	public void show(){
		super.show();
		System.out.println(",品种：" + this.strain);
	}
}
//编写测试类
class Test{
	public static void main(String[] args){
		//实例化
		//Dog dog = new Dog();
		Dog dog2 = new Dog("土狗");
		//Dog dog3 = new Dog("二哈",3,"白色","哈士奇");
	}
}