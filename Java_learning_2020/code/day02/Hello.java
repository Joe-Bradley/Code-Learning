class Hello{
	public static void main(String[] args){
		System.out.println("����day02Ŀ¼�е�Hello");
	}
}
class Var02{
	public static void main(String[] args){
		//�����Ĳ������裺
		//��һ������������
		int a;
		double b;
		String c;
		//�ڶ�������ֵ
		a = 100;
		b = 3.14;
		c = "������";
		//��������ʹ��
		//System.out.println("a");  //ע�⣺˫�����е�������ԭ�������
		//ע�⣺�����������������е�ֵ������Ҫ˫����
		System.out.println(a); //100
		System.out.println(b);
		System.out.println(c);
	}
}
class Var03{
	public static void main(String[] args){
		//�Ż�Var02���еĴ���
		//��������ͬʱ��ɸ�ֵ��Ҳ����˵��һ���͵ڶ����϶�Ϊһ���﷨��ʽ���������� �������� = ֵ;
		int a = 100;
		double b = 3.14;
		String c = "������";
		
		//ʹ��
		System.out.println("a = " + a);  //+��ʾ����
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}
}
class Var04{
	public static void main(String[] args){
		//��0.1   99.87  -1  59.9ֵ����ڱ����У�����������е�ֵ
		/*double a;
		double b;
		int c;
		double d;*/

		//�Ż�������ж������������ͬʱ�������һ���������������֮��ʹ��Ӣ�ĵĶ��Ÿ���
		//double a,b,d;
		double a = 0.1,b = 99.87,d = 59.9;
		int c = -1;
		System.out.println("a = " + a + "\nb = " + b + "\nd = " + d + "\nc = " + c);  // ����\n��ʾ��һ��
	}
}
class Var05{
	public static void main(String[] args){
		System.out.println("Hello\n\nWorld");
		System.out.println("Hello\tWorld");
		
		//�����D:\course\JavaProjects\02-JavaSE\day02
		System.out.println("D:\\course\\JavaProjects\\02-JavaSE\\day02");

		//���"D:\course\JavaProjects\02-JavaSE\day02"
		System.out.println("\"D:\\course\\JavaProjects\\02-JavaSE\\day02\"");

		//�����'D:\\course\\JavaProjects\\02-JavaSE\\day02'
		System.out.println("\'D:\\course\\JavaProjects\\02-JavaSE\\day02\'");
		System.out.println("'D:\\course\\JavaProjects\\02-JavaSE\\day02'");

		System.out.println("Hello\u0000World");
		System.out.println("Hello\u2605World");
	}
}
class Var06{
	double j;  //j���ǳ�Ա����
	public static void main(String[] args){
		int i;  //i���Ǿֲ�����
	}
}
class Var07{
	public static void main(String[] args){
		int i;
		double j;
		i = 123;
		String s;
		char ch;
		ch = '��';
		j = 3.14;
		s = "����";
	}
}
class Var08{
	public static void main(String[] args){
		//byte
		byte a = 1; //ע�⣺��Java�У�����byte short char���͸�ֵʱ�����û�г���������ȡֵ��Χ�����ֱ�Ӹ�ֵ
		a = 5;
		a = -128;
		//a = 128;  //���ֱ��������Ϊ����byte����ȡֵ��Χ
		System.out.println("a = " + a);

		//short
		short b = 128;
		b = -32768;
		//b = 32768;  //���ֱ�����󣬳���short����ȡֵ��Χ������취��ֻ����һ���ȸ����ͷ�Χ������ʹ洢��ֵ

		System.out.println("b = " + b);

		//int
		int c = 0;
		//c = 12345678901;  //���ֱ�����󣬳���int���ͷ�Χ
		System.out.println("c = " + c);

		//long
		long d = 6;  //ע�⣺��Java�У�ȡֵ��ΧС�����Ϳ���ֱ�Ӹ���ȡֵ��Χ������ͣ������Զ�����ת��
		d = 123456;
		//d = 12345678909;  //���ֱ��������ΪֵĬ��Ϊint������intȡֵ��Χ
		//����취�����Ҳ��ֵ�������L��l����ʱ��ֵ��Ϊlong,Ҳ����˵��ֵ��Ϊlong����
		d = 12345678909L;  //û�й����Զ�����ת��
		System.out.println("d = " + d);
	}
}