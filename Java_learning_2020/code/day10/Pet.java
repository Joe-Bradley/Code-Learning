/*
实现主人喂养宠物
分析得到：
	宠物Pet类
		方法：吃
	狗类 继承 宠物类
		重写父类的吃方法
		编写独有的方法：玩飞盘
	猫类 继承 宠物类
		重写父类的吃方法
		编写独有的方法：抓老鼠
	鸟类 继承 宠物类
		重写父类的吃方法
	猪类 继承 宠物类
		重写父类的吃方法
	鱼类 继承 宠物类
		重写父类的吃方法
	.......

	主人类
		//方法：喂养狗
		改为:喂养宠物
*/
class Pet{
	//方法
	public void eat(){
		System.out.println("宠物正在吃东西。。。。。。");
	}
}
//编写狗的子类继承宠物父类
class Dog extends Pet{
	//重写父类的eat方法
	public void eat(){
		System.out.println("狗正在吃狗粮......");
	}
	//编写独有的方法：玩飞盘
	public void play(){
		System.out.println("狗正在玩飞盘。。。。。");
	}
}
//编写猫的子类继承宠物父类
class Cat extends Pet{
	//重写父类的吃的方法
	public void eat(){
		System.out.println("猫正整吃猫粮。。。。。");
	}
	//编写独有的方法：抓老鼠
	public void catching(){
		System.out.println("猫正在抓老鼠......");
	}
}
//编写主人类
class Master{
	//方法：喂养狗
	/*public void feed(Dog dog){
		dog.eat();
	}
	//方法：喂养猫
	public void feed(Cat cat){  //Cat cat = new Cat();
		cat.eat();
	}*/
	/*
		总结得到：以上喂养的猫和狗都属于宠物，因此能否编写主人喂养宠物方法
	*/
	public void feed(Pet pet){ //Pet pet = new Dog();   Pet pet = new Cat();
		pet.eat();
	}
}
//编写测试类
class Test{
	public static void main(String[] args){
		//创建主人对象
		Master m = new Master();
		//创建狗对象
		Dog d = new Dog();
		//主人喂养宠物
		m.feed(d);
		m.feed(new Cat());
	}
}
class Test2{
	public static void main(String[] args){
		Pet p = new Dog(); //构成多态,页就是向上转型
		/*p.eat();
		//p.play();  //出现编译错误，父类类型不能访问子类独有属性或方法
		
		//解决办法：进行向下转型
		Dog d = (Dog)p;
		//此时就可以使用引用名称d访问狗中的play方法
		d.play();*/

		/*double a = 3.14;
		int b = (int)a;*/

		/*Cat c = (Cat)p;  //出现运行错误，原因：当前引用名称p存放的是狗对象的地址，因此不能强制转为猫
		c.catching();*/
		//解决办法：当进行向下转型时，建议先进行判断，当合法则在转为对应的类型，则使用instanceof关键字
		p = new Cat();
		if(p instanceof Dog){
			Dog dog = (Dog)p;
			dog.play();
		}else if(p instanceof Cat){
			Cat cat = (Cat)p;
			cat.catching();
		}
	}
}