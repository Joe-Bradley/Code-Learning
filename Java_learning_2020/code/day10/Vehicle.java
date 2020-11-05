/*
ĳ�������޹�˾�ж����������Գ��⣬�������������
Vehicle �����г��ĸ��࣬���ԣ�Ʒ�ƣ����ƺţ�
���������������ķ���  :public double getSumRent(int days){}
Car��С�γ�����Vehicle�����࣬���ԣ����ͣ����ᣬ���ᣬԽҰ)
���᣺ÿ��300�����᣺ÿ��350��ԽҰ��ÿ��500 
Bus���������������ԣ���λ��
��λ��<=16 :ÿ��400
��λ�� >16 :ÿ�� 600
�����ࣺ
�����û�ѡ�񲻳��������������������
*/
class Vehicle{
	//���ԣ�
	String brand;
	String id;
	//���췽��
	public Vehicle(){

	}
	public Vehicle(String brand,String id){
		this.id = id;
		this.brand = brand;
	}
	//���������������ķ��� 
	public double getSumRent(int days){
		return 0;
	}
	public void print(){
		System.out.println("OK");
	}
}
//��дС�γ�����̳г��ĸ���
class Car extends Vehicle{
	//��д��������
	String type;
	//���췽��
	public Car(){
		super();
		this.type = "����";
	}
	public Car(String brand,String id,String type){
		super(brand,id);
		this.type = type;
	}
	//��д���������𷽷�
	public double getSumRent(int days){
		//�жϣ����ݳ��ͻ�ȡ�����
		switch(this.type){  //ע�⣺��type����û��ֵʱ����ֵΪnull����Java�У�switch���ʽ�����Ϊnull�ͻ���ֿ�ָ���쳣
		case "����":
			return 300 * days;
		case "����":
			return 350 * days;
		default:
			return 500 * days;
		}
	}
}
//��д��������
class Bus extends Vehicle{
	//����
	int seat;
	//��д��ȡ����𷽷�
	public double getSumRent(int days){
		if(this.seat <= 16){
			return 400 * days;
		}else{
			return 600 * days;
		}
	}
}
//��дС�γ�������
class CarTest{
	public static void main(String[] args){
		//ʵ����С�γ�
		/*Car c = new Car();
		System.out.println("�����"  + c.getSumRent(3));
		//ʵ����ͳ�
		Bus bus = new Bus();
		System.out.println("�����" + bus.getSumRent(1)); */
	}
}
class Test{
	public static void main(String[] args){
		/*
			��̬���﷨��ʽ��
				�������� �������� = new ��������();
			ע�⣺���Ƕ�̬ʱ������������ֻ�ܷ��ʸ����е����Ժͷ������������ȷ���������д�Ժ�ķ���
			��̬��������������ͬһ���������õ���ͬ�Ľ��
		*/
		/*Vehicle c = new Car();
		System.out.println(c.brand);  //null
		System.out.println(c.id);  //null
		//System.out.println(c.type);  //���ֱ��������Ϊ��������c�Ǹ������ͣ����ֻ�ܷ��ʸ����е�����
		c.print();  //OK
		System.out.println(c.getSumRent(1));  //350.0 */
		Vehicle v;
		v = new Car();  //���ɶ�̬
		System.out.println("�����" + v.getSumRent(1));  //350.0
		v = new Bus();  //���ɶ�̬
		System.out.println("�����" + v.getSumRent(1));   //400.0 
	}
}