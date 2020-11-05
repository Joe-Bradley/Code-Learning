/*
编写车类，属性：车牌号、颜色、价格，方法：输出车的信息
编写车的测试类，创建车的对象，输出车的信息
*/
class Car{
	//构造方法
	public Car(){

	}
	//带参构造方法,完成对id和price赋值
	public Car(String id,int price){
		this.id = id;
		this.price = price;
	}
	//编写对所有属性赋值的构造方法
	/*public Car(String id,String color,int price){
		this.id = id;
		this.color = color;
		this.price = price;
	}*/
	//编写第二种带三个参数赋值的构造方法
	public Car(String id,String color,int price){
		//将局部变量id和price的值，给带两个参数的构造方法赋值
		/*this(id,price);
		this.color = color;*/

		//this(id,color,price);  //构造方法不能出现递归调用
	}
	//属性
	String id;
	String color;
	int price;
	//方法
	public void print(){
		//this();  //出现编译错误，必须是构造方法中第一个语句
		//在本类的方法中，可以直接方法本类中的成员变量(属性)
		//System.out.println("车牌号：" + id + "\n颜色：" + color + "\n价格：" + price);
		//上一条语句，可以编写为如下：
		System.out.println("车牌号：" + this.id + "\n颜色：" + this.color + "\n价格：" + this.price);
	}
	public void print2(String id){ //id是形参，属于局部变量
		System.out.println("输出成员变量id: " + this.id);
	}
	public void print3(){
		//调用本类中的print方法,可以直接使用：方法名称([参数列表]);
		this.print();  //等价于 print();
	}
}
//编写测试类
class CarTest{
	public static void main(String[] args){
		//实例化车
		/*Car c = new Car();
		c.print();
		//System.out.println(this.id); //出现编译错误，因为this.只能在本类(当前类)中使用

		Car car = new Car();
		car.print(); */

		/*Car c3 = new Car();
		c3.print3(); */

		//创建对象同时执行带两个参数的构造方法
		Car c4 = new Car("京A88888",8000000);
		c4.print();

		System.out.println();
		Car c5 = new Car("沪C55555","黄色",5000000);
		c5.print();
	}
}