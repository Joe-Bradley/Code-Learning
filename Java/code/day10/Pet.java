/*
ʵ������ι������
�����õ���
	����Pet��
		��������
	���� �̳� ������
		��д����ĳԷ���
		��д���еķ����������
	è�� �̳� ������
		��д����ĳԷ���
		��д���еķ�����ץ����
	���� �̳� ������
		��д����ĳԷ���
	���� �̳� ������
		��д����ĳԷ���
	���� �̳� ������
		��д����ĳԷ���
	.......

	������
		//������ι����
		��Ϊ:ι������
*/
class Pet{
	//����
	public void eat(){
		System.out.println("�������ڳԶ���������������");
	}
}
//��д��������̳г��︸��
class Dog extends Pet{
	//��д�����eat����
	public void eat(){
		System.out.println("�����ڳԹ���......");
	}
	//��д���еķ����������
	public void play(){
		System.out.println("����������̡���������");
	}
}
//��дè������̳г��︸��
class Cat extends Pet{
	//��д����ĳԵķ���
	public void eat(){
		System.out.println("è������è������������");
	}
	//��д���еķ�����ץ����
	public void catching(){
		System.out.println("è����ץ����......");
	}
}
//��д������
class Master{
	//������ι����
	/*public void feed(Dog dog){
		dog.eat();
	}
	//������ι��è
	public void feed(Cat cat){  //Cat cat = new Cat();
		cat.eat();
	}*/
	/*
		�ܽ�õ�������ι����è�͹������ڳ������ܷ��д����ι�����﷽��
	*/
	public void feed(Pet pet){ //Pet pet = new Dog();   Pet pet = new Cat();
		pet.eat();
	}
}
//��д������
class Test{
	public static void main(String[] args){
		//�������˶���
		Master m = new Master();
		//����������
		Dog d = new Dog();
		//����ι������
		m.feed(d);
		m.feed(new Cat());
	}
}
class Test2{
	public static void main(String[] args){
		Pet p = new Dog(); //���ɶ�̬,ҳ��������ת��
		/*p.eat();
		//p.play();  //���ֱ�����󣬸������Ͳ��ܷ�������������Ի򷽷�
		
		//����취����������ת��
		Dog d = (Dog)p;
		//��ʱ�Ϳ���ʹ����������d���ʹ��е�play����
		d.play();*/

		/*double a = 3.14;
		int b = (int)a;*/

		/*Cat c = (Cat)p;  //�������д���ԭ�򣺵�ǰ��������p��ŵ��ǹ�����ĵ�ַ����˲���ǿ��תΪè
		c.catching();*/
		//����취������������ת��ʱ�������Ƚ����жϣ����Ϸ�����תΪ��Ӧ�����ͣ���ʹ��instanceof�ؼ���
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