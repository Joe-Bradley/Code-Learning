import java.util.Scanner;  //��һ���������������λ��JavaԴ�ļ��еĵ�һ��
class Var01{
	public static void main(String[] args){
		//��������
		double x = 0.1;
		x = 999.99;
		x = -123.09;
		System.out.println("x = " + x);

		//float y = 0.87;  //���ֱ������ԭ����Java�У�ȡֵ��Χ������Ͳ���ֱ�Ӹ�ȡֵ��ΧС�����͸�ֵ
		//����취��һ�ַ�������0.87ֵ��Ϊfloat���ͣ�Ҳ�����ڸ�ֵ�������f��F��Ȼ���ٸ����float���͸�ֵ
		/*float y = 0.87f;   //û�й�������ת��
		System.out.println("y = " + y); */
		//����취�ڶ��ַ�������ȡֵ��Χ������͸���ȡֵ��ΧС������ʱ���������ǿ������ת����Ҳ����˵�ڸ�ֵǰ�����(Ŀ������)
		float y = (float)0.87;  //����ǿ������ת��
		y = 100.3F;
		System.out.println("y = " + y);
	}
}
class Var02{
	public static void main(String[] args){
		//�ַ�����
		char ch = 'a';
		ch = 'H';
		ch = '��';
		ch = 100;  //ע�⣺����ֵ���Ը��ַ�����ֱ�Ӹ�ֵ���ַ��д�ŵľ���ASCII��Ӧ���ַ�
		ch = 65;
		ch = 65535;  //ע�⣺�ַ�����ȡֵ��Χ�ģ�0----65535
		System.out.println("ch = " + ch);

		int i = 12;
		i = 6;
		i = 'a';  //ע�⣺�ַ�Ҳ����ֱ�Ӹ�int���͸�ֵ��int���͵ı����д�ŵľ��Ƕ�Ӧ�ַ���ASCII
		System.out.println("i = " + i);
	}
}
class Var03{
	public static void main(String[] args){
		//��������
		boolean x = true;
		x = false;
		System.out.println("x = " + x);
	}
}
class Cast04{
	public static void main(String[] args){
		//�Զ�����ת��Ҳ������ʽ����ת��
		/*byte a = 1;
		int b = a;  //�����Զ�����ת��
		float c = b;  //�����Զ�����ת��
		System.out.println("c = " + c);

		double d = c;  //�����Զ�����ת�� */
		
		//ǿ������ת��Ҳ������ʽ����ת��
		/*int i = (int)3.14;  //����ǿ������ת��Ҳ������ʽ����ת��
		System.out.println("i = " + i);

		byte a = 3;
		short b = a; //�����Զ�����ת��
		int c = a + b;
		c = a + 'A';

		System.out.println("c = " + c);*/

		int i = 5;
		long j = 6;
		double k = 1.2;
		double x = i + j + k;

	}
}
class Operator05{
	public static void main(String[] args){
		//+
		//ע�⣺1.��+���ߵĲ�����������ֵ���ͣ������ӷ�����
		/*System.out.println(10 + 20);  //30
		System.out.println(10 + 20.0);  //30.0
		
		int a = 3,b = 4;
		int sum = a + b;
		//ע�⣺2.��+���ߵĲ���������һ��Ϊ����ֵ���ͣ���������,�������Ӻ�Ľ��ΪString
		System.out.println("sum = " + sum); //"sum = 7"
		System.out.println("sum = " + a + b);  //"sum = 34"
		System.out.println("sum = " + (a + b));

		//-
		System.out.println(10 - 20); // -10
		System.out.println(6 - 4.3); //1.7
		int x = 5,y = 6;
		int z = x - y;
		System.out.println("z = " + z);  //z = -1
		//ע�⣺������������ʱ�����뱣֤����������������ֵ����
		//System.out.println("z = " + x - y);  //"z = 5" - 6   ,���ֱ������
		System.out.println("z = " + (x - y)); */

		//*
		/*System.out.println(5 * 6);  //30
		System.out.println(5.0 * 6.0);  //30.0
		int m = 3,n = 4;
		int s = m * n;
		System.out.println("s = " + s);
		System.out.println("s = " + m * n);  //"s = 12"

		System.out.println(99999 * 0); //0
		System.out.println(1234567 * 1); //1234567
		System.out.println(2 * 2 * 2); */

		//����
		/*System.out.println(10 / 2); //5
		System.out.println(10 / 3);  //3
		System.out.println(11 / 4); //2
		System.out.println(7 / 2.0);  //3.5
		System.out.println("���Ϊ��" + 20 / 6); */

		// %
		System.out.println(10 % 5);  //0
		System.out.println(9 % 3.0);  //0.0
		System.out.println(4 % 6);  //4
		System.out.println(12 % 10);  //2
		System.out.println(0 % 10);  //0
		//System.out.println(6 % 0);  //ע�⣺��������Ϊ0
	}
}
class Operator06{
	public static void main(String[] args){
		//��ϰ������123���и���λ֮��
		int num = 123;
		//��ȡ��ǰ��123�еĸ���λ
		int gw = num % 10;
		int sw = num / 10 % 10;
		int bw = num / 100;
		//�������λ֮��
		int sum = gw + sw + bw;
		System.out.println("sum = " + sum);
	}
}
class Operator07{
	public static void main(String[] args){
		//++
		/*int a = 3;
		int b = ++a;  //a = 4   b = 4
		System.out.println("a = " + a + "\nb = " + b);

		int x = 5;
		//int y = x++;  //y = 5  x = 6
		int y = x++ + 2;  //x = 6  y = 7
		System.out.println("x = " + x + "\ny = " + y); */

		//--
		int a = 6,b = 8;
		//int c = a-- / 2;  //c = 3
		int c = --a * b++;   //a = 5  b = 9   c = 40
		System.out.println("c = " + c);
	}
}
class Operator08{
	public static void main(String[] args){
		/*int a = 12;
		int b = 3;
		String s = "" + a + b;
		
		//��ֵ�����
		int c = 3 * 2 % 6;
		
		//��չ��ֵ�����
		int x = 5;
		x = x + 1;  //Ҳ���Ա�дΪ��x += 1; */

		int a = 123,s = 0;
		//s = s * 10 + a % 10;  //s = 3
		//��һ������Ƿ�ȼ������´��룿 ----���ȼ�
		s *= 10 + a % 10;  //�ȼ���  s = s * (10 + a % 10);
		System.out.println("s = " + s);
		
		//�ܽ᣺������չ��ֵ�����ʱ���������յ���������û�з����ı�
		int x = 10;
		//x += 0.5;  //���x = 10 
		//x = x + 0.5;  //���ֱ������
		System.out.println("x = " + x);
	}
}
class Operator09{
	public static void main(String[] args){
		//��ϵ����������ս��Ϊboolean���͵�ֵ
		System.out.println(1 > 2);  //false
		System.out.println(10 > 9); //true
		System.out.println(5 != 3);  //true
		//���ȼ������������ > ��ϵ����� > ��ֵ�����
		System.out.println(9 % 2 == 0); //false
		System.out.println(2 + 3 / 6 <= 4 * 2 % 5); //true
		boolean b = 7 / 4 + 5 % 2 == 16 / 8 - 5 * 2 % 3;
		System.out.println("b = " + b); //false
	}
}
class Operator10{
	public static void main(String[] args){
		//�߼������:���ս��Ϊboolean���͵�ֵ
		/*System.out.println(9 > 1 & 0 != 1); //true
		System.out.println(3 <= 1 & 100 > 10);  //false
		//���ȼ������������ > ��ϵ����� > �߼������
		System.out.println(9 / 6 - 4 % 2 > 0 & 18 % 9 == 0);  //true
		System.out.println(0 > 1 & 3 <= 2);  //false */

		/*System.out.println(30 > 17 | 19 < -20);  //true
		System.out.println(12 % 3 != 1 | 81 / 9 == 0);  //true
		System.out.println(-1 > 3 | 8 > 77); //false */

		/*System.out.println(8 != 9 ^ 12 > 10);  //false
		System.out.println(0 < 1 ^ 1 > 10);  //true
		System.out.println(2 / 3 + 4 % 15 <= 10 % 7 ^ 12 / 5 <= 8 % 4);  //false*/

		/*System.out.println(!false);  //true
		System.out.println(!!false);  //false
		//System.out.println(!1 > 9); //���ֱ������
		System.out.println(!(1 > 9));  //true */

		//�ܽ᣺��·�롢�߼������н������ͬ������ִ�й��̿��ܲ�ͬ����ʹ�ö�·�룬���ҵ�һ������Ϊfalseʱ������ֱ��Ϊfalse
		/*System.out.println(10 > 5 && 8 != 1); //true
		System.out.println(10 > 5 & 8 != 1); //true

		System.out.println(3 > 19 && 0 < 1);  //false
		System.out.println(3 > 19 & 0 < 1);  //false
	
		System.out.println(5 < 6 && 1 >= 2);  //false
		System.out.println(5 < 6 & 1 >= 2);  //false */

		//�ܽ᣺��·���߼������н������ͬ������ִ�й��̿��ܲ�ͬ����ʹ�ö�·�򣬲��ҵ�һ������Ϊtrueʱ������ֱ��Ϊtrue
		System.out.println(1 != 2 || 55 > 66);  //true
		System.out.println(1 != 2 | 55 > 66);  //true

		System.out.println(2 >= 12 || 5 <= 9);  //true
		System.out.println(2 >= 12 | 5 <= 9);  //true

	}
}
class Operator11{
	public static void main(String[] args){
		/*
			��ϰ���ж�10����20
			�﷨��ʽ������ ? ����1 : ����2
		*/
		/*String s = 100 > 20 ? "����" : "������";
		System.out.println("s = " + s); */
		//��ϰ���ж�12����������ż��
		//��ϰ���ж�һ����(�磺-3)���������0�������1�����С��0�������-1���������0
		int num = -3;
		int i = num > 0 ? 1 : num < 0 ? -1 : 0;
		System.out.println(i);
	}
}
class Input12{
	public static void main(String[] args){
		//��ϰ������һ�����������������
		//�ڶ���������Scanner����
		Scanner input = new Scanner(System.in);
		//���������Ѻ���ʾ
		System.out.print("������һ������");
		//���Ĳ�����������
		int num = input.nextInt();  //ע�⣺�ȴ��û����ռ�s������ֵ�������س��������ʾ������ϣ������س�֮ǰ����������ݸ������ı���
		System.out.println("num = " + num);
	}
}
class Input13{
	public static void main(String[] args){
		//��ϰ�������������ĺ�
		Scanner input = new Scanner(System.in);
		System.out.print("�������һ������");
		int num1 = input.nextInt();
		System.out.print("������ڶ�������");
		int num2 = input.nextInt();
		int sum = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + sum); //6 + 7 = 13
	}
}