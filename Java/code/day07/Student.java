class Student{
	String name;  //Ĭ��ֵΪnull
	int age;	//Ĭ��ֵΪ0
	String sex;	//Ĭ��ֵΪ\u0000
	String address;	//Ĭ��ֵΪnull
	public void study(){
		System.out.println("Learning now");
	}
}
//��дѧ���Ĳ�����
class StudentTest{
	public static void main(String[] args){
		Student zs = new Student();
		//ͨ����������zs��ȡ�����е�����
		System.out.println(zs.name);  //null
		System.out.println(zs.age);  //0
		System.out.println(zs.sex);  //null
		System.out.println(zs.address); //null
		//�Զ����е����Խ��Ƹ�ֵ���磺��������.�������� = ֵ;
		zs.name = "Joe";
		zs.age = 19;
		zs.sex = "Male";
		zs.address = "Beijing";
		//�����������zs��Ӧ�������������Ե�ֵ
		System.out.println("Name:" + zs.name + "\nAge:" + zs.age + "\nSex:" + zs.sex + "\nAddress:" + zs.address);
		//ʹ���������Ʒ��ʶ����еķ������﷨��ʽ����������.��������();
		zs.study();
	}
}