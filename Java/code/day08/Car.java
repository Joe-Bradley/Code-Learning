/*
��д���࣬���ԣ����ƺš���ɫ���۸񣬷��������������Ϣ
��д���Ĳ����࣬�������Ķ������������Ϣ
*/
class Car{
	//���췽��
	public Car(){

	}
	//���ι��췽��,��ɶ�id��price��ֵ
	public Car(String id,int price){
		this.id = id;
		this.price = price;
	}
	//��д���������Ը�ֵ�Ĺ��췽��
	/*public Car(String id,String color,int price){
		this.id = id;
		this.color = color;
		this.price = price;
	}*/
	//��д�ڶ��ִ�����������ֵ�Ĺ��췽��
	public Car(String id,String color,int price){
		//���ֲ�����id��price��ֵ���������������Ĺ��췽����ֵ
		/*this(id,price);
		this.color = color;*/

		//this(id,color,price);  //���췽�����ܳ��ֵݹ����
	}
	//����
	String id;
	String color;
	int price;
	//����
	public void print(){
		//this();  //���ֱ�����󣬱����ǹ��췽���е�һ�����
		//�ڱ���ķ����У�����ֱ�ӷ��������еĳ�Ա����(����)
		//System.out.println("���ƺţ�" + id + "\n��ɫ��" + color + "\n�۸�" + price);
		//��һ����䣬���Ա�дΪ���£�
		System.out.println("���ƺţ�" + this.id + "\n��ɫ��" + this.color + "\n�۸�" + this.price);
	}
	public void print2(String id){ //id���βΣ����ھֲ�����
		System.out.println("�����Ա����id: " + this.id);
	}
	public void print3(){
		//���ñ����е�print����,����ֱ��ʹ�ã���������([�����б�]);
		this.print();  //�ȼ��� print();
	}
}
//��д������
class CarTest{
	public static void main(String[] args){
		//ʵ������
		/*Car c = new Car();
		c.print();
		//System.out.println(this.id); //���ֱ��������Ϊthis.ֻ���ڱ���(��ǰ��)��ʹ��

		Car car = new Car();
		car.print(); */

		/*Car c3 = new Car();
		c3.print3(); */

		//��������ͬʱִ�д����������Ĺ��췽��
		Car c4 = new Car("��A88888",8000000);
		c4.print();

		System.out.println();
		Car c5 = new Car("��C55555","��ɫ",5000000);
		c5.print();
	}
}