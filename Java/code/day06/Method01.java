import java.util.*;
class Method01{
	public static void print(){
		System.out.print("hello");
	}
	public static void main(String[] args){
		print();
	}
}
class Method02{
	public static void main(String[] args){
		//����Method01���е�print����
		//Method01.print();
		//print();  //���ֱ������
	}
}
class Method03{
	/*
		��ϰ3������1+2�ĺͣ�Ҫ��ʹ�÷������
		������
			1.����ֻ��һ���������ʱ�Ϳ��Ա�дΪ���������͵ķ������
			2.���������͵ķ����﷨��ʽ��
				public static �������� ��������(){
					������
				}
			
			3.�÷������ظ���Ľ������˷������ͱ�дΪ��Ӧ���������
			�������ͱ�дΪĿǰ��ѧ9����������֮һ���磺int  double String char boolean......
			4.�����ڷ�������ͨ��return���������
			5.�ڵ��ô����д���
				ʹ�ñ������գ�Ȼ������������е�ֵ
	*/
	public static int sum(){
		int s = 1 + 2;
		return s; //ͨ��return�����s��ֵ3���ص������ĵ��ô�
	}
	/*
		��ϰ2�����1---100�е�ÿ������Ҫ��ʹ���޲��޷������͵ķ������
		�﷨��ʽ��
		public static void ��������(){
			������
		}
	*/
	public static void print(){
		for(int i = 1;i <= 100;i++){
			System.out.println(i);
		}
	}
}
class Method04{
	public static void main(String[] args){
		//����Method03���е�print����
		//Method03.print();

		//����Method03���е�sum����
		int a = Method03.sum();  //ע�⣺�ȵ��÷�����Ȼ�󽫷������صĽ�����磺3���ٸ������ı�������a
		System.out.println(a);
	}
}
class Method05{
	//��ϰ6���ж�һ����(�磺12),�Ƿ�����λ��
	//��ϰ5���ж�һ���ַ�(��:'d'),�ж��Ǵ�д��ĸ��Сд��ĸ���������ַ�
	public static String result2(){
		char ch = '#';
		if(ch >= 'A' && ch <= 'Z'){
			return "��д��ĸ";
		}else if(ch >= 'a' && ch <= 'z'){
			return "Сд��ĸ";
		}else if(ch >= '0' && ch <= '9'){
			return "�����ַ�";
		}else{
			return "�����ַ�";
		}
	}

	//��ϰ4:�ж�12����������ż��
	public static String result(){
		/*if(12 % 2 == 0){
			return "��ż��";
		}else{
			return "������";
		}*/

		//Ҳ���Ա�дΪ��
		return 12 % 2 == 0 ? "��ż��" : "������";
	}
	
	public static void main(String[] args){ 
		//����result����
		/*String s = result();
		System.out.println(s);*/

		//Ҳ���Ա�дΪ���´��룺
		//System.out.println(result());
		
		//���ñ����е�result2����
		System.out.println(result2());  //�ȵ��÷����� Ȼ�󽫷��ؽ���ٽ������
	}
}
class Method06{
	//�����1	2
	public static void print3(){
		for(int i = 1;i <= 5;i++){
			if(i == 3){
				return;  //���ص������ĵ��ô�
			}
			System.out.print(i + "\t");
		}
		System.out.println("OK");
	}
	//�����1	2	4	5	yes
	public static void print2(){
		for(int i = 1;i <= 5;i++){
			if(i == 3){
				continue;
			}
			System.out.print(i + "\t");
		}
		System.out.println("yes");
	}
	//���:1	2	Hello
	public static void print(){
		for(int i = 1;i <= 5;i++){
			if(i == 3){
				break;
			}
			System.out.print(i + "\t");
		}
		System.out.println("Hello");
	}
	public static void main(String[] args){
		//print();
		//print2();
		print3();
	}
}
class Method07{
	//��ϰ7��������������ڣ��õ�ÿ���������飬����һ�����ڶ��������ġ�������ѧϰ������������������ϰ����������Ϣ
	public static String getInfo(){
		String week = "����5";
		switch(week){
		case "����һ":
		case "���ڶ�":
		case "������":
		case "������":
			return "ѧϰ";
			//break;  //���ֱ���������޷����ʵ���䣬ԭ�򣺸������֮����return,������return�ͷ��ص����ô�
		case "������":
		case "������":
			return "��ϰ";
			//break;
		default:
			return "��Ϣ";
			//break;
		}
	}
	public static void main(String[] args){
		//���ñ����е�getInfo����
		System.out.println(getInfo());
	}	
}
class Method08{
	//��ϰ9�������������Ĳ���Ա�дΪ�����޷������͵ķ������
	public static void sub(double num1,double num2){  //num1��num2�����β�
		double result = num1 - num2;
		System.out.println(num1 + " - " + num2 + " = " + result);
	}
	/*
		��ϰ8:ʹ�÷�����ɣ����1---n�е�ÿ����
		�����õ���
			1.��������δ֪��������˿��Ա�дΪ�������ķ���
			2.���η������﷨��ʽ��
				public static void ��������(�����б�){
					������
				}
			3.ÿ�������﷨��ʽ���������� ��������
			  �������֮��ʹ��Ӣ�Ķ��Ÿ���
			4.������δ֪�ı�дΪ��������Ϊ��ʽ��������β�
			  ���÷���ʱ����Ϊ��֪�ĳ�Ϊʵ�ʲ��������ʵ��
			  Ҳ����ʵ�ε�ֵ�����βα���,���뱣֤ʵ�����βθ���һ�¡�����һ�¡�˳��һ��
	*/
	public static void print(int n){ //n�����β�
		for(int i = 1;i <= n;i++){
			System.out.println(i);
		}
	}
	public static void main(String[] args){
		//���ñ����е�print����
		/*print(5);  //5����ʵ��
		System.out.println();
		print(10); */

		//����Method08���е�sub����
		//Method08.sub(5.6,0.9);
		
		double num1 = 5.6;
		double num2 = 0.9;
		Method08.sub(num1,num2);
	}
}
class Method09{
	/*
		��ϰ11���ж�һ����λ���Ƿ���ˮ�ɻ���
		�����õ���1.������δ֪����λ������дΪ�������磺int num
				   2.�������������������ֻ�õ�һ���������˿��Ա�дΪ����������
				   3.��һ�������Ƿ��������ʱ��һ�㷵�����ͱ�дΪboolean
	*/
	public static boolean isFlag(int num){
		//���ж��Ƿ�����λ��
		if(num >= 100 && num <= 999){
			//��ȡ��ǰ��num�еĸ���λ
			int gw = num % 10,sw = num / 10 % 10,bw = num / 100;
			//�������λ��������
			int sum = gw * gw * gw + sw * sw * sw + bw * bw * bw;
			//�ж��������Ƿ��뵱ǰ��num���
			/*if(sum == num){
				return true; //true��ʾ��ˮ�ɻ���
			}else{
				return false; //false��ʾ����ˮ�ɻ���
			}*/
			
			//�ȼ��������if else
			return sum == num;
		}else{
			return false; //false��ʾ����ˮ�ɻ���
		}
	}
	//��ϰ10���ж�һ�����䣬������ꡢ���ꡢ���ꡢ����
	public static void print(int age){
		if(age >= 65){
			System.out.println("����");
		}else if(age >= 30){
			System.out.println("����");
		}else if(age >= 18){
			System.out.println("����");
		}else{
			System.out.println("����");
		}
	}
	//��д�����ش������ķ���
	public static String getInfo(int age){
		if(age >= 65){
			return "����";
		}else if(age >= 30){
			return "����";
		}else if(age >= 18){
			return "����";
		}else{
			return "����";
		}
	}

	public static void main(String[] args){
		/*Scanner input = new Scanner(System.in);
		System.out.print("���������䣺");
		int age = input.nextInt();
		//print(age);

		System.out.println(getInfo(age)); */

		System.out.println(isFlag(153));
	}
}
class Method10{
	//��ϰ12����д����ʵ�����������λ����ˮ�ɻ���
	public static void print(){
		for(int i = 100;i <= 999;i++){
			if(Method09.isFlag(i)){
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args){
		//���ñ����е�print����
		print();
	}
}
class Method11{
	//�ܽ᣺��ͬһ�����У�������������ͬ�������б���벻ͬ(���Ͳ�ͬ��������ͬ��˳��ͬ),�뷵�������޹أ����ɷ���������
	//��ϰ13��ʹ�÷�����ɣ���ȡ�������е������
	public static int max(int a,int b){
		return a > b ? a : b;
	}
	public static void max(double x,int y){
		System.out.println(x > y ? x : y);
	}
	public static void max(double x,double y){
		System.out.println(x > y ? x : y);
	}
	public static void main(String[] args){
		System.out.println(max(10,12));
		System.out.println(max(345,54));
		max(0.9,1);
		max(13.1,12.9);


		System.out.println(123);
		System.out.println("HelloWorld");
		System.out.println();
	}
}