import java.util.*;

class If01{
	public static void main(String[] args){
		//��ϰ1�����������μ�Java���ԣ��ж������95���������н���
		Scanner input = new Scanner(System.in);
		System.out.print("������������Java���Գɼ���");
		double score = input.nextDouble();
		/*if(score > 95){
			System.out.println("�н���");
		}*/

		//ע�⣺��Java�У��������ֻ��һ�����ʱ��������ſ���ʡ��,�����ѧ�߱�д������
		if(score > 95)
			System.out.println("�н���");
		System.out.println("OK");
		
	}
}
class If02{
	public static void main(String[] args){
		//��ϰ2�����������μ�Java���ԣ��ж������95���������н��������򷢺��
		Scanner input = new Scanner(System.in);
		System.out.print("������ɼ���");
		double score = input.nextDouble();
		//��һ�ַ�����ʹ������if����ɵ�
		/*if(score > 95){
			System.out.println("�н���");
		}
		if(score <= 95){
			System.out.println("�����");
		}*/

		//�ڶ��ַ�����ʹ��if else���
		/*if(score > 95){
			System.out.println("�н���");
		}else{
			System.out.println("�����");
		}*/

		//�����ַ�����ʹ����Ŀ��������
		//System.out.println(score > 95 ? "�н���" : "�����");
		
		//�����ַ�����ʹ�ö���ifѡ��ṹ���
		if(score > 95){
			System.out.println("�н���");
		}else if(score <= 95){
			System.out.println("�����");
		}
	}
}
class If03{
	public static void main(String[] args){
		//��ϰ3���ж�һ��������������ż��
		//��ϰ4���ж�һ�����Ƿ�����λ������
		Scanner input = new Scanner(System.in);
		System.out.print("������һ������");
		int num = input.nextInt();
		if(num >= 100 && num < 1000){
			System.out.println(num + "����λ������");
		}else{
			System.out.println(num + "������λ������");
		}
		//��ϰ5���������������ֱ�����a��b�У��ж�a+b�ĺʹ���100�������a��ֵ���������b��ֵ
	}
}
class If04{
	public static void main(String[] args){
		//��ϰ6��������������䣬��������ꡢ���ꡢ���껹������
		Scanner input = new Scanner(System.in);
		System.out.print("���������䣺");
		int age = input.nextInt();
		//���꣺55���ϣ����꣺30---54�����꣺18---29�����꣺18����(0---17)
		/*if(age >= 55){
			System.out.println("����");
		}else if(age >= 30){
			System.out.println("����");
		}else if(age >= 18){
			System.out.println("����");
		}else if(age < 18){
			System.out.println("����");
		}*/

		//ע�⣺����ifѡ��ṹ�е�����˳����Եߵ������ǿ��ܻ�Ӱ���������н��,����취�����ߵ�ʱ�����������д�Ͻ�
		/*if(age >= 55){
			System.out.println("����");
		}else if(age >= 18 && age <= 29){
			System.out.println("����");
		}else if(age >= 30){
			System.out.println("����");
		}else if(age < 18){
			System.out.println("����");
		}*/

		if(age >= 55){
			System.out.println("����");
		}else if(age >= 18 && age <= 29){
			System.out.println("����");
		}else if(age >= 30){
			System.out.println("����");
		}else if(age < 18 && age >= 0){
			System.out.println("����");
		}else{
			System.out.println("������������");
		}

		//��ϰ7���ж�һ���ַ�������Ǵ�д��ĸ��Сд��ĸ���������ַ�
	}
}
class If05{
	public static void main(String[] args){
		//��ϰ8���ж�һ����λ��������������ż��
		Scanner input = new Scanner(System.in);
		System.out.print("������һ������");
		int num = input.nextInt();
		//�жϣ���ǰ��num�Ƿ�����λ��
		/*if(num >= 10 && num <= 99){
			//�жϣ���ǰ������������ż��
			if(num % 2 == 0){
				System.out.println(num + "��ż��");
			}else{
				System.out.println(num + "������");
			}

		}else{
			System.out.println(num + "������λ��");
		}*/

		//��ϰ9���ж�һ����λ���������Ƿ���ˮ�ɻ���
		//�жϣ���ǰ���Ƿ�����λ������
		if(num >= 100 && num <= 999){  //num = 123
			//��ȡ����λ��
			int bw = num / 100,sw = num % 100 / 10,gw = num % 10;
			//�������λ��������
			int sum = bw * bw * bw + sw * sw * sw + gw * gw * gw;
			//�жϣ�����λ�������Ƿ��뵱ǰ��num���
			if(sum == num){
				System.out.println(num + "��ˮ�ɻ���");
			}else{
				System.out.println(num + "����ˮ�ɻ���");
			}

		}else{
			System.out.println(num + "������λ��������");
		}
	}	
}
class If06{
	public static void main(String[] args){
		//��ϰ10�����������μ�ȫ��Java��̱���������õ�һ������10W,����õڶ�������5W,����õ���������2W,����û���κν���
		Scanner input = new Scanner(System.in);
		System.out.print("���������Σ�");
		String info = input.next();
		/*
			��Java�У��ַ����Ƚ�ʱ��ʹ��==�Ƚϵ��ǵ�ַ�Ƿ�һ��
					  ������ַ����бȽ����ݣ������ʹ��equals(),��������Ϊtrue,����Ϊfalse
					  ���ַ������бȽ�����ʱ������̶�ֵ��д��ǰ��
		*/
		/*if(info == "��һ��"){
			System.out.println("����10W");
		}else if(info == "�ڶ���"){
			System.out.println("����5W");
		}else if(info == "������"){
			System.out.println("����2W");
		}else{
			System.out.println("�Բ���û���κν���!");
		}*/

		//��һ�ַ�����ʹ�ö���if���
		if("��һ��".equals(info)){
			System.out.println("����10W");
		}else if("�ڶ���".equals(info)){
			System.out.println("����5W");
		}else if("������".equals(info)){
			System.out.println("����2W");
		}else{
			System.out.println("�Բ���û���κν���!");
		}
	}
}
class Switch07{
	public static void main(String[] args){
		//��ϰ10�ĵڶ��ַ�����ʹ��switch case���
		Scanner input = new Scanner(System.in);
		System.out.print("���������Σ�");
		String info = input.next();
		/*switch(info){
		case "��һ��":
			System.out.println("����10W");
			break;  //��ʾ�жϣ�������break��ִ��switch case��������
		case "�ڶ���":
			System.out.println("����5W");
			break;
		case "������":
			System.out.println("����2W");
			break;
		default:
			System.out.println("�Բ���û���κν���!");
			break;
		}*/

		/*
			������ע�����
			1.case���泣��ֵ��˳��������⣬һ�㰴˳���д
			2.default˳��Ҳ���Ա�д��switch�е�����λ��
			  ������case��������ʱ��ִ��default
			  ����default��д������case�ĺ���
			3.break�ǿ��п��޵�
			  ��û�б�дbreak����ӵ�ǰ��һ��ƥ���caseһֱ����ִ��(Ҳ���Ǵ�͸)
			  ��ˣ����������ʵ���дbreak
			4.caseҲ���Ժϲ�
		*/
		switch(info){
		case "�ڶ���":
			System.out.println("����5W");
			
		case "��һ��":
			System.out.println("����10W");
			//break;  //��ʾ�жϣ�������break��ִ��switch case��������
		default:
			System.out.println("�Բ���û���κν���!");
			
		case "������":
			System.out.println("����2W");
		}
	}
}
class Switch08{
	public static void main(String[] args){
		//��ϰ11��������������ڣ��õ�����ÿ���������顣����һѧϰ�����ڶ�ѧϰ����������ϰ��������ѧϰ����������ϰ��������ѧϰ����������Ϣ
		Scanner input = new Scanner(System.in);
		System.out.print("please enter the number:");
		char week = input.next().charAt(0);
		switch(week){
		case '1':
		case '2':
		case '4':
		case '6':
			System.out.println("studying");
			break;
		case '3':
		case '5':
			System.out.println("www");
			break;
		default:
			System.out.println("rest");
			break;
		}
	}
}