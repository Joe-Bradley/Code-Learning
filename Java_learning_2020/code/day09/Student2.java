/*
��дѧ���࣬���ԣ����֡���סַ(����)
*/
class Student{
	//��̬����飺��ɶԾ�̬���Ը�ֵ
	static{
		address = "������";
		System.out.println("ִ���˾�̬����顣��������");
	}
	//���췽��:��ɶ�ʵ��������ֵ
	public Student(){

	}
	public Student(String name){
		this.name = name;
	}
	//����
	String name; //��Ϊ�Ǿ�̬���ԣ�Ҳ����ʵ������
	
	//static String address = "����";  //��Ϊ��̬����Ҳ������ı���
	static String address;

	//��Ϊ��̬����Ҳ������ķ���
	public static void print2(){

	}
	public static void print(){
		System.out.println("ִ����print����");
		//System.out.println(name);  //��̬������ֻ�ܷ��ʾ�̬���ԡ���̬����
		System.out.println(address);
		print2();
	}
	//��Ϊ�Ǿ�̬����Ҳ����ʵ������
	public void show(){
		System.out.println("ִ����show����");
		System.out.println(name);
		System.out.println(address);
		print();
	}
}
//��дѧ��������
class StudentTest{
	public static void main(String[] args){
		//��������
		/*Student s = new Student();
		Student s2 = new Student("����");*/
		
		/*System.out.println(Student.address);   //����
		Student s = new Student();
		System.out.println(s.name);  //null
		System.out.println(s.address);  //����

		s = null;
		//System.out.println(s.name); //�������д��󣬲��ܷ��ʶ����е�ʵ������
		System.out.println(s.address);  //����  */

		/*Student.print();
		Student s = new Student();
		System.out.println(s.name);  //null
		s.show();
		s.print();

		s = null;
		//s.show();  //�������д�����Ϊ�ö��󲻴���
		
		s.print();*/

		System.out.println(Student.address);
		System.out.println(Student.address);
	}
}