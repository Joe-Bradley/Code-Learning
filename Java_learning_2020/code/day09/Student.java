class Student{
	//����
	String name;
	int age;
	//���췽��
	public Student(){

	}
	public Student(String name,int age){
		this.name = name;
		this.age = age;
	}
}
//��дѧ��������
class StudentTest{
	public static void change(Student s){
		System.out.println(s.name);   //����
		System.out.println(s.age);   //23
		s.name = "������";
	}
	public static void main(String[] args){
		//ʵ����ѧ��
		/*Student s = new Student("����",19);
		Student s2;
		s2 = s;  //s��s2����ͬһ����ַ��Ҳ����˵s��s2��������ָ��һ������
		System.out.println("s2.name = " + s2.name);  //����
		System.out.println("s2.age = " + s2.age); //19
		s2.name = "����";
		System.out.println("s2.name = " + s2.name);  //����
		System.out.println("s2.age = " + s2.age);  //19
		System.out.println("s.name = " + s.name); //����
		System.out.println("s.age = " + s.age);  //19  */

		Student s = new Student("����",23);
		System.out.println(s.name);  //����
		System.out.println(s.age);  //23
		change(s);
		System.out.println("s.name = " + s.name);  //������
		System.out.println("s.age = " + s.age); //23
	}
}