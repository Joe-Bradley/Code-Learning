/*
	��д���࣬���ԣ���ɫ��Ʒ�ơ��۸�
	��д���Ĳ����࣬�������Ķ���
*/
class Car{
	//����Ҳ������Ա����
	String color;  //null
	String brand;
	int price;

	//����
	public void print(String name){ //name���βΣ�Ҳ���ھֲ�����
		int i;  //i���Ǿֲ�����

		for(int j = 1;j <= 5;j++){  //jҲ���ھֲ�����

		}
	}
	public void show(){
		int a; //a�Ǿֲ�����
		//System.out.println("a = " + a);  //���ֱ������ԭ�򣺾ֲ������������������ٸ�ֵ���ſ���ʹ��

		a = 123;
		System.out.println("a = " + a);
		System.out.println("price = " + price);  //0
	}
	public void print2(){
		//�ܽ᣺��ͬһ�����У���Ա���������ֿ�����ֲ�����������ͬ�������Ǿֲ������������ȣ�Ҳ���Ǿͽ����ȣ������Ҫ���ʳ�Ա������������this.
		String color = "��ɫ";  //color�Ǿֲ�����
		System.out.println("����ֲ�����color��ֵ��" + color);
		System.out.println("�����Ա����color��ֵ��" + this.color); //this����ǰ�������Ҳ��˵��ǰ˭�����������������������˭
	}
	public void setBrand(String brand){ //brand���βΣ����ھֲ�����
		//ʵ�ֽ��ֲ�����brand��ֵ������Ա����brand
		this.brand = brand;
	}
}
//��д���Ĳ�����
class CarTest{
	public static void main(String[] args){
		//ʵ������
		/*Car c = new Car();
		//c.show();
		c.print2();

		System.out.println();
		Car c2 = new Car();
		c2.color = "��ɫ";
		c2.print2();*/

		Car c3 = new Car();
		c3.setBrand("����");
		System.out.println("Ʒ�ƣ�" + c3.brand);
	}
}