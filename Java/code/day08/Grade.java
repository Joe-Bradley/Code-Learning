/*
����������Ҫ��
	�༶Grade�ࣺ
		���ԣ���ţ����ƣ���ַ
		���壺�޲ι��췽�����вι��췽��
		���巽������ʾ�༶����Ϣ��
	ѧ���ࣺ
		���ԣ�ѧ�ţ��������Ա����䣬���ڰ༶
		���巽������ʾѧ������Ϣ(ѧ�ţ��������Ա����䣬�༶��ţ��༶����)
		
		ע�⣺���ڰ༶ӦΪ�༶�������
	�����ࣺ
		ͨ���вι��췽���������༶����
		ͨ���޲ι��췽��������ѧ�������
		������ʾ��Ϣ�ķ�����ʾѧ������Ϣ
*/
class Grade{
	//���ԣ���ţ����ƣ���ַ
	int num;
	String name;
	String address;

	//���췽��
	public Grade(){

	}
	public Grade(int num,String name,String address){
		this.num = num;
		this.name = name;
		this.address = address;
	}
	//��������ʾ�༶����Ϣ��
	public void show(){
		System.out.println("�༶��ţ�" + num + "\n�༶���ƣ�" + name + "\n�༶��ַ��" + address);
	}
}
//��дѧ����
class Student{
	//���췽��
	public Student(){

	}
	public Student(int id,String name,char sex,int age,Grade g){
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.g = g;
	}
	//���ԣ�ѧ�ţ��������Ա����䣬���ڰ༶
	int id;
	String name
	char sex;
	int age;
	Grade g = new Grade();  //ע�⣺gû�и�ֵʱ����Ĭ��ֵΪnull
	//��������ʾѧ������Ϣ(ѧ�ţ��������Ա����䣬�༶��ţ��༶����)
	public void showInfo(){
		System.out.println("ѧ����Ϣ���£�");
		//System.out.println("ѧ�ţ�" + id + "\n������" + name + "\n�Ա�" + sex + "\n���䣺" + age + "\n�༶���:" + g.num + "\n�༶���ƣ�" + g.name + "\n�༶��ַ��" + g.address);
		
		//Ҳ���Ա�дΪ��
		System.out.println("ѧ�ţ�" + id + "\n������" + name + "\n�Ա�" + sex + "\n���䣺" + age);
		g.show();
	}
}
//������
class Test{
	public static void main(String[] args){
		//ͨ���вι��췽���������༶����
		/*Grade grade = new Grade(431,"Java������","��¥�Ľ���");
		//ͨ���޲ι��췽��������ѧ�������
		Student s = new Student();
		//������ʾ��Ϣ�ķ�����ʾѧ������Ϣ
		s.showInfo();*/

		//����ѧ������ͬʱ��ѧ�����������Ը�ֵ
		Student s2 = new Student(1001,"����",'��',21,new Grade(432,"Java","��������"));
		s2.showInfo();
	}
}