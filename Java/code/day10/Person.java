/*
ѧ���ࣺ
	���ԣ�ѧ�ţ��������Ա�����
	������ ���ҽ��ܵķ�����ѧϰ�ķ���
��ʦ�ࣺ
	���ԣ��������Ա����䣬����
	���������ҽ��ܵķ�������ѧ�ķ���
�����ࣺ
	����ѧ�����󣬵��÷���
	������ʦ���� �����÷���

�����õ���
��Person�ࣺ
	���ԣ��������Ա�����
	���������ҽ��ܷ���
ѧ���� �̳� ����
	�������ԣ�ѧ��
	���з�����ѧϰ
��ʦ�� �̳� ����
	�������ԣ�����
	���з�������ѧ
*/
class Person{
	//���췽��
	public Person(){

	}
	public Person(String name,char sex,int age){
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	//����
	String name;
	char sex;
	int age;
	//����
	public void sayHi(){
		System.out.print("���ã��ҽ�" + this.name + ",����" + this.age + "��,�Ա���" + this.sex);
	}
}
//��дѧ������̳��˵ĸ���
class Student extends Person{
	//���췽��
	public Student(){

	}
	public Student(String name,char sex,int age,int id){
		/*this.name = name;  //Ҳ���Ա�дΪsuper.name = name;
		this.sex = sex;
		this.age = age;*/

		//����������䣬Ҳ���Ա�дΪ���£�
		/*super.name = name; 
		super.sex = sex;
		super.age = age; */
		//����������䣬Ҳ���Ա�дΪ���ø���Ĵ������������췽����ɣ�ʹ��super�ؼ���
		//super();  //���ø����޲ι��췽��
		super(name,sex,age);
		this.id = id;
		
	}
	//��д��������
	int id;
	//��д���з�����ѧϰ
	public void study(){
		System.out.println(name + "����ѧϰ�̳пγ̡�����������");
	}
	//��д�����sayHi����
	/*public void sayHi(){
		//System.out.println("���ã��ҽ�" + name + ",����" + age + "��,�Ա���" + sex + ",ѧ����" + id);
		//ע�⣺1.�������ʵ������ʱ��Ĭ��ǰ�����this. �����ǵ�ʹ��this.����ʵ������ʱ�����ڵ�ǰ�����Ҹ����ԣ����û���ҵ�����������ȥ��������
		//System.out.println("���ã��ҽ�" + this.name + ",����" + this.age + "��,�Ա���" + this.sex + ",ѧ����" + this.id);
		//ע�⣺2.����������з��ʸ����е�ʵ�������������ֱ��ʹ��super�ؼ��֣�super��ʾ����Ҳ���Ǹ���
		//System.out.println("���ã��ҽ�" + super.name + ",����" + super.age + "��,�Ա���" + super.sex + ",ѧ����" + this.id);
	
		//����ĸ���Ϣ������ǰ������Ϣ�ڸ����sayHi�У�����ֱ�ӵ��ø��෽����Ȼ�����������Ķ�����Ϣ
		//sayHi();  //�ȼ��� this.sayHi();  //��û����ɵ��ø����sayHi����
		//����취�����������д����ķ�������ʱ���ٵ��ø����sayHi������ֻ��ʹ��super.
		super.sayHi();
		System.out.println(",ѧ����" + id);
	}*/

	//������ѧ���ĸ���Ϣ
	public void print(){
		//ǰ������Ϣ���ø����sayHi����
		this.sayHi();  //�ȼ��� sayHi();  ���ڵ�ǰ�����ң����û�ҵ���ȥ��������
		System.out.println(",ѧ����" + id);
	}
}
//��дѧ��������
class StudentTest{
	public static void main(String[] args){
		//ʵ����ѧ��
		//Student stu = new Student();
		/*stu.sayHi();
		stu.study(); */
		//stu.print();

		//����ѧ������ͬʱִ�д��ĸ������Ĺ��췽��
		Student stu2 = new Student("����",'��',19,1001);
		stu2.print();
	}
}