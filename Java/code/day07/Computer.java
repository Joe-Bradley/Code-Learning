/*
	��д�����࣬���ԣ�Ʒ�ơ���ɫ���۸񣬷�������ʾ���Ե���Ϣ
	��д���Բ����࣬�������Զ������������Ϣ
*/
class Computer{
	//����Ҳ������Ա������ʵ������
	String brand;  //null
	String color;  //null
	double price;  //0.0
	//����
	public void show(){
		//ע�⣺�����еĳ�Ա���������ڱ���������λ��ֱ��ʹ��
		System.out.println("Ʒ�ƣ�" + brand + "\n��ɫ��" + color + "\n�۸�" + price);
	}
}
//��д���Բ�����
class ComputerTest{
	public static void main(String[] args){
		//�������Զ���Ҳ����ʵ����
		Computer c = new Computer();
		//���������������е����Խ��и�ֵ
		c.brand = "Lenovo";
		c.color = "��ɫ";
		c.price = 4999.9;
		c.show();
	}
}