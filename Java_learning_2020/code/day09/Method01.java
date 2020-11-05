class Method01{
	public static void swap(double a,double b){
		double t = a;
		a = b;
		b = t;
		System.out.println(a);  //10.6
		System.out.println(b);  //3.4
	}
	public static void change(int x,int y){
		x += 5;
		y += 10;
		System.out.println("x = " + x);  //x = 15
		System.out.println("y = " + y);  //y = 30
	}
	public static void main(String[] args){
		/*int x = 10,y = 20;
		System.out.println("x: " + x);  //x: 10
		System.out.println("y: " + y);  //y: 20
		change(x,y);
		System.out.println("x的值：" + x); //x的值： 10
		System.out.println("y的值：" + y); //y的值： 20 */

		double num1 = 3.4,num2 = 10.6;
		swap(num1,num2);
		System.out.println(num1); //3.4
		System.out.println(num2); //10.6
	}	
}