/*
	编写车类，属性：颜色、品牌、价格
	编写车的测试类，创建车的对象
*/
class Car{
	//属性也叫做成员变量
	String color;  //null
	String brand;
	int price;

	//方法
	public void print(String name){ //name是形参，也属于局部变量
		int i;  //i就是局部变量

		for(int j = 1;j <= 5;j++){  //j也属于局部变量

		}
	}
	public void show(){
		int a; //a是局部变量
		//System.out.println("a = " + a);  //出现编译错误，原因：局部变量必须先声明，再赋值最后才可以使用

		a = 123;
		System.out.println("a = " + a);
		System.out.println("price = " + price);  //0
	}
	public void print2(){
		//总结：在同一个类中，成员变量的名字可以与局部变量的名字同名，但是局部变量名字优先，也就是就近优先，如果非要访问成员变量则必须添加this.
		String color = "灰色";  //color是局部变量
		System.out.println("输出局部变量color的值：" + color);
		System.out.println("输出成员变量color的值：" + this.color); //this代表当前这个对象，也就说当前谁调用这个方法则这个对象就是谁
	}
	public void setBrand(String brand){ //brand是形参，属于局部变量
		//实现将局部变量brand的值赋给成员变量brand
		this.brand = brand;
	}
}
//编写车的测试类
class CarTest{
	public static void main(String[] args){
		//实例化车
		/*Car c = new Car();
		//c.show();
		c.print2();

		System.out.println();
		Car c2 = new Car();
		c2.color = "白色";
		c2.print2();*/

		Car c3 = new Car();
		c3.setBrand("大众");
		System.out.println("品牌：" + c3.brand);
	}
}