/*
	��д���࣬���ԣ�Ʒ�֡���ɫ�����֡����䡢�Ա𣬷��������������Ϣ
	��д���Ĳ����࣬ʵ�����������ù��ķ��������Ϣ
*/
class Dog{
	//�޲ι��췽��
	public Dog(){
		//��ɶ�Ʒ�֡���ɫ�����֡����䡢�Ա�
		strain = "����";
		color = "��ɫ";
		name = "����";
		age = 5;
		sex = '��';
	}
	//��д���ι��췽������ɶ�����Ʒ�֡���ɫ������
	public Dog(String strain,String color,String name){
		//��ɾֲ�������ֵ��������Ա����
		this.strain = strain;
		this.color = color;
		this.name = name;
	}
	//��д���������Ը�ֵ�Ĺ��췽��
	public Dog(String strain,String color,String name,int age,char sex){
		this.strain = strain;
		this.color = color;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public Dog(String name){
		this.name = name;
	}
	public Dog(int age){
		this.age = age;
	}
	//��ͨ�ķ��������ǹ��췽��
	public void Dog(String name){
		this.name = name;
	}
	//����Ҳ������Ա����
	String strain;
	String color;
	String name;
	int age;
	char sex;
	//���������������Ϣ
	public void print(){
		System.out.println("Ʒ��: " + strain + "\n��ɫ��" + color + "\n���֣�" + name + "\n���䣺" + age + "\n�Ա�" + sex);
	}
}
//��д���Ĳ�����
class DogTest{
	public static void main(String[] args){
		//ʵ������
		/*Dog d = new Dog();
		//��һ�ַ�������ɶԶ����е����Ը�ֵ��ʹ����������.�������� = ֵ;
		d.strain = "��������Ȯ";
		d.color = "��ɫ";
		d.name = "С��";
		d.age = 3;
		d.sex = '��';
		d.print(); */

		//�ڶ��ַ�������ɶԶ����е����Ը�ֵ��ʹ�ù��췽�����
		//����������ʱ�Զ�ִ����ƥ��Ĺ��췽��
		/*Dog d2 = new Dog();
		d2.print();

		System.out.println("------------------------");
		Dog d3 = new Dog();
		d3.print(); */

		//����Dog����ͬʱִ�д����������Ĺ��췽��
		Dog d4 = new Dog("̩��","��ɫ","С��");
		d4.print();
		
		System.out.println();
		//��������ͬʱ��ɶ��������Ը�ֵ
		Dog d5 = new Dog("��ʿ��","��ɫ","����",4,'��');
		d5.print();

		Dog d6 = new Dog();
	}
}