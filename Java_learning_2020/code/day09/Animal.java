/*
��д���࣬���ԣ����֡����䡢Ʒ�֡���ɫ����������ʾ��Ϣ
��дè�࣬���ԣ����֡���ɫ���Ա����䣬��������ʾ��Ϣ
��д�����࣬����è�͹��Ķ��󣬲��ֱ���ʾ��Ϣ

�����õ���
	��������������ͬ���Ժͷ������ܷ񵥶���дһ���ࣿ ----��
����취��
	1.�����������ͬ�����Ժͷ�����д�ڵ���һ�����У������Ϊ����
	2.������̳и��࣬Ȼ���������б�д���е����Ժͷ���
	
	����Animal�ࣺ
		���ԣ����֡����䡢��ɫ
		��������ʾ��Ϣ
	���� �̳� ������
		�������ԣ�Ʒ��

	è�� �̳� ������
		�������ԣ��Ա�

�ô������ٴ����������(�ظ���)
*/
class Animal extends Object{
	//����
	String name;
	int age;
	String color;
	//��������ʾ��Ϣ
	public void show(){
		System.out.println("���֣�" + name + "\n���䣺" + age + "\n��ɫ��" + color);
	}
	public Object getInfo(){
		return null;
	}
}
//��д��������̳ж��︸��
class Dog extends Animal{
	//��д�����ж������Ժͷ���
	String strain;
	//��дҲ��������override:����������д����ķ����������븸��ķ�������һ�¡������б�һ�¡���������һ�¡����η�һ��
	public void show(){
		//�������п���ֱ�ӷ��������е�����(ǰ�᣺����������û��ʹ��private����)
		System.out.println("���֣�" + name + "\n���䣺" + age + "\n��ɫ��" + color + "\nƷ�֣�" + strain);
	}
	//��д�����getInfo����
	public String getInfo(){
		return "OK";
	}
}
//��дè�����ಢ�̳ж��︸��
class Cat extends Animal{
	//�������ԣ��Ա�
	char sex;
}
//��д������
class Test{
	public static void main(String[] args){
		//�������Ķ���
		Dog d = new Dog();
		//��ʾ��Ϣ
		d.show();  //����Dog������show���������û���ҵ�����ȥ��������
	}
}