/*
��д����Animal,���ԣ�name��age��color����������ʾ��Ϣ
��д����Dog,�̳и��࣬�������ԣ�strain
��д���Ĳ����࣬���������������������Ϣ
*/
class Animal{
	//���췽��
	public Animal(){
		System.out.println("ִ���˸�����޲ι��췽��");
	}
	public Animal(String name,int age,String color){
		this.name = name;
		this.age = age;
		this.color = color;
		System.out.println("ִ���˸���Ĵ����������Ĺ��췽��");
	}
	//����
	String name;
	int age;
	String color;
	//����
	public void show(){
		System.out.print("���֣�" + this.name + ",���䣺" + this.age + ",��ɫ��" + this.color);
	}	
}
class Dog extends Animal{
	//���췽��
	//ע�⣺1.��ʵ��������ʱ��������������ƥ��Ĺ��췽���������ǰ���๹�췽����û��ָ�����ø����ĸ����췽������Ĭ�ϵ��ø�����޲ι��췽��
	public Dog(){
		System.out.println("ִ����Dog������޲ι��췽��");
	}
	public Dog(String strain){
		//super();  //�ȼ���Ĭ�ϲ���д
		super("δ֪",5,"δ֪");
		this.strain = strain;
		System.out.println("ִ����Dog����Ĵ�һ�������Ĺ��췽��");
	}
	/*public Dog(String name,int age,String color,String strain){
		this.name = name;
		this.age = age;
		this.color = color;
		this.strain = strain;
		System.out.println("ִ����Dog����Ĵ��ĸ������Ĺ��췽��");
	}*/
	
	//ע�⣺2.������๹�췽����ʹ��super�ؼ���ָ�����ø����ĸ����췽��ʱ������ִ�и�����ƥ��Ĺ��췽��
	public Dog(String name,int age,String color,String strain){
		super(name,age,color);
		this.strain = strain;
		System.out.println("ִ����Dog����Ĵ��ĸ������Ĺ��췽��");
	}
	//��д��������
	String strain;
	//��д�����show����
	public void show(){
		super.show();
		System.out.println(",Ʒ�֣�" + this.strain);
	}
}
//��д������
class Test{
	public static void main(String[] args){
		//ʵ����
		//Dog dog = new Dog();
		Dog dog2 = new Dog("����");
		//Dog dog3 = new Dog("����",3,"��ɫ","��ʿ��");
	}
}