/*
��дѧ���࣬���ԣ����֡����䡢�Ա�
Ҫ��ʹ�÷�װ��ɣ����������Խ��и�ֵ��ȡֵ
	���䣺1---120������19
	�Ա��С�Ů��������
*/
class Student{
	//����
	private String name;
	private int age;
	private char sex;
	//��д�������Եĸ�ֵsetXxx
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		//�ж�1---120
		if(age >= 1 && age <= 120){
			this.age = age;
		}else{
			this.age = 19;
		}
	}
	public void setSex(char sex){
		//�ж��Ա�Ϊ�С�Ů
		if(sex == '��' || sex == 'Ů'){
			this.sex = sex;
		}else{
			this.sex = '��';
		}
	}
	//��д�������Ե�ȡֵgetXxx
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public char getSex(){
		return sex;
	}	
}
//��дѧ��������
class StudentTest{
	public static void main(String[] args){
		//����ѧ������
		Student s = new Student();
		//���������Ը�ֵ������set����
		s.setName("����");
		s.setAge(1234);
		s.setSex('a');
		//�����������s���������Ե�ֵ
		System.out.println("������" + s.getName() + "\n���䣺" + s.getAge() + "\n�Ա�" + s.getSex());
	}
}
