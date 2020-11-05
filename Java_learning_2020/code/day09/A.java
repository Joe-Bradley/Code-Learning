class A{
	//静态代码块:完成对静态属性赋值
	static{
		isFlag = true;
	}
	//构造方法:完成实例变量的赋值
	public A(){

	}
	public A(int b,double c,String d){
		this.b = b;
		this.c = c;
		this.d = d;
	}
	//属性:当属性没有赋值时则是有默认值的，语法格式：[修饰符] 数据类型 属性名称 [= 值];
	//非静态属性也叫实例变量
	int b;
	double c = 3.14;
	private String d;  //注意:私有的只能在本类中使用
	//静态属性也叫做类的变量
	static boolean isFlag;
	//方法
	public static void print(){
		System.out.println(isFlag);
	}
	public void show(){
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(isFlag);
	}
}
class ATest{
	public static void main(String[] args){
		/*System.out.println(A.isFlag);  //false

		//如果想访问实例变量，则必须进行创建对象
		A a = new A();
		System.out.println(a.b);  //0
		System.out.println(a.c);  //3.14
		//System.out.println(a.d); //编译出错 */
	}
}

//类 静态代码块 静态属性 静态方法 对象 构造方法 实例变量 实例方法     对象 = null;