/*
��дѧ���࣬���ԣ����������䡢�Ա�
��дѧ�������࣬����ѧ���������ѧ��������Ϣ
*/
class Student2{
	//����
	String name;
	//��һ��������������Ϊ˽�е�private,ֻ���ڱ�����ʹ��
	private int age;
	char sex;
	//�ڶ�������д��Ӧ���Եĸ�ֵsetXxx��ȡֵgetXxx����
	public void setAge(int age){
		//�����������������д�ж����
		//���ֲ�������ֵ������Ա����,���䣺0---100������Ϊ18
		if(age >= 0 && age <= 100){
			this.age = age;
		}else{
			this.age = 18;
		}
	}
	public int getAge(){
		return age; //��ʾ���س�Ա����age��ֵ
	}
}
//��дѧ��������
class StudentTest2{
	public static void main(String[] args){
		//ʵ����ѧ��
		Student2 s = new Student2();
		s.name = "Joe";
		/*
			ͨ�����з������⣺
				��Щ���ԣ��磺���䡢�Ա�,������ʵ������
			����취��
				�ڸ�ֵ֮ǰ�����жϣ���ǰֵ����Ϸ�����и�ֵ�����򲻽��и�ֵ����Ϊ��װ
		*/
		//s.age = 12345;
		/*s.sex = 'a';
		System.out.println("����: " + s.name + "\n���䣺" + s.age + "\n�Ա�" + s.sex); */

		s.setAge(23);
		System.out.println("Age: " + s.getAge());
	}
}