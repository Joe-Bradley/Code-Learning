/*
	��дѧ���࣬���ԣ����֡����䣬����:���ѧ����Ϣ
	��дѧ���Ĳ����࣬���ѧ����Ϣ
*/
class Student{
	//����
	String name;
	int age;
	//����
	public void print(){
		System.out.println("���֣�" + name + "\n���䣺" + age);
	}
}
//��дѧ���Ĳ�����
class StudentTest{
	public static void main(String[] args){
		//����ѧ������
		//Student s = new Student();
		//����һ������дΪ����������䣺
		/*Student s;  //������һ���ֲ�����s��Ҳ������������s,��ǰs��Student���ͣ�Student�������û��Զ��������Ϊ����
		s = new Student();
		s = new Student();
		s = null;
		
		int i;  //i�Ǿֲ���������������������
		i = 10;
		i = 123; */

		Student s;
		s = new Student();
		s.print();
		s = new Student();
		s.name = "����";
		s.print();

		s = null;
		//s.print();  //�������д��󣬴����ǿ�ָ���쳣��ԭ����������s��null����˲��ܷ���ĳ�������е����Ի򷽷��������Ҫ��������ֿ�ָ���쳣
	
		//����취���ڵ���ĳ�������е����Ի򷽷�ʱ�����뱣֤�����������д�Ŷ���ĵ�ַ
		s = new Student();
		s.print();
	}
}