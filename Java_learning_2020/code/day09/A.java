class A{
	//��̬�����:��ɶԾ�̬���Ը�ֵ
	static{
		isFlag = true;
	}
	//���췽��:���ʵ�������ĸ�ֵ
	public A(){

	}
	public A(int b,double c,String d){
		this.b = b;
		this.c = c;
		this.d = d;
	}
	//����:������û�и�ֵʱ������Ĭ��ֵ�ģ��﷨��ʽ��[���η�] �������� �������� [= ֵ];
	//�Ǿ�̬����Ҳ��ʵ������
	int b;
	double c = 3.14;
	private String d;  //ע��:˽�е�ֻ���ڱ�����ʹ��
	//��̬����Ҳ������ı���
	static boolean isFlag;
	//����
	public static void print(){
		System.out.println(isFlag);
	}
	public void show(){
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(isFlag);
	}
}
class ATest{
	public static void main(String[] args){
		/*System.out.println(A.isFlag);  //false

		//��������ʵ���������������д�������
		A a = new A();
		System.out.println(a.b);  //0
		System.out.println(a.c);  //3.14
		//System.out.println(a.d); //������� */
	}
}

//�� ��̬����� ��̬���� ��̬���� ���� ���췽�� ʵ������ ʵ������     ���� = null;