/*
某汽车租赁公司有多种汽车可以出租，计算汽车的租金
Vehicle 是所有车的父类，属性：品牌，车牌号，
方法：返回总租金的方法  :public double getSumRent(int days){}
Car：小轿车类是Vehicle的子类，属性：车型（两厢，三厢，越野)
两厢：每天300，三厢：每天350，越野：每天500 
Bus：多座汽车，属性：座位数
座位数<=16 :每天400
座位数 >16 :每天 600
测试类：
根据用户选择不车，计算总租金并输出总租金。
*/
class Vehicle{
	//属性：
	String brand;
	String id;
	//构造方法
	public Vehicle(){

	}
	public Vehicle(String brand,String id){
		this.id = id;
		this.brand = brand;
	}
	//方法：返回总租金的方法 
	public double getSumRent(int days){
		return 0;
	}
	public void print(){
		System.out.println("OK");
	}
}
//编写小轿车子类继承车的父类
class Car extends Vehicle{
	//编写独有属性
	String type;
	//构造方法
	public Car(){
		super();
		this.type = "三厢";
	}
	public Car(String brand,String id,String type){
		super(brand,id);
		this.type = type;
	}
	//重写父类的总租金方法
	public double getSumRent(int days){
		//判断，根据车型获取日租金
		switch(this.type){  //注意：当type属性没赋值时，该值为null，在Java中，switch表达式中如果为null就会出现空指针异常
		case "两厢":
			return 300 * days;
		case "三厢":
			return 350 * days;
		default:
			return 500 * days;
		}
	}
}
//编写多坐汽车
class Bus extends Vehicle{
	//属性
	int seat;
	//重写获取总租金方法
	public double getSumRent(int days){
		if(this.seat <= 16){
			return 400 * days;
		}else{
			return 600 * days;
		}
	}
}
//编写小轿车测试类
class CarTest{
	public static void main(String[] args){
		//实例化小轿车
		/*Car c = new Car();
		System.out.println("总租金："  + c.getSumRent(3));
		//实例大巴车
		Bus bus = new Bus();
		System.out.println("总租金：" + bus.getSumRent(1)); */
	}
}
class Test{
	public static void main(String[] args){
		/*
			多态的语法格式：
				父类类名 引用名称 = new 子类类名();
			注意：当是多态时，该引用名称只能访问父类中的属性和方法，但是优先访问子类重写以后的方法
			多态：将多个对象调用同一个方法，得到不同的结果
		*/
		/*Vehicle c = new Car();
		System.out.println(c.brand);  //null
		System.out.println(c.id);  //null
		//System.out.println(c.type);  //出现编译错误，因为引用名称c是父类类型，因此只能访问父类中的属性
		c.print();  //OK
		System.out.println(c.getSumRent(1));  //350.0 */
		Vehicle v;
		v = new Car();  //构成多态
		System.out.println("总租金：" + v.getSumRent(1));  //350.0
		v = new Bus();  //构成多态
		System.out.println("总租金：" + v.getSumRent(1));   //400.0 
	}
}