/*
	编写电脑类，属性：品牌、颜色、价格，方法：显示电脑的信息
	编写电脑测试类，创建电脑对象，输出电脑信息
*/
class Computer{
	//属性也叫做成员变量或实例变量
	String brand;  //null
	String color;  //null
	double price;  //0.0
	//方法
	public void show(){
		//注意：本类中的成员变量可以在本类中任意位置直接使用
		System.out.println("品牌：" + brand + "\n颜色：" + color + "\n价格：" + price);
	}
}
//编写电脑测试类
class ComputerTest{
	public static void main(String[] args){
		//创建电脑对象也叫做实例化
		Computer c = new Computer();
		//对引用名称中所有的属性进行赋值
		c.brand = "Lenovo";
		c.color = "黑色";
		c.price = 4999.9;
		c.show();
	}
}