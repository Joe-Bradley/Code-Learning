import java.util.*;

class Hello01{
	public static void main(String[] args){
		//��ϰ1�����5��HelloWorld!,ʹ��forѭ�����
		/*System.out.println("HelloWorld!");
		System.out.println("HelloWorld!");
		System.out.println("HelloWorld!");
		System.out.println("HelloWorld!");
		System.out.println("HelloWorld!"); */

		for(int i = 1;i <= 5;i++){
			System.out.println("��" + i + "��HelloWorld!");
		}
	}
}
class For02{
	public static void main(String[] args){
		//��ϰ2��ʹ��forѭ����ɣ����1---10�е�ÿ����
		//��ϰ3��ʹ��forѭ����ɣ����1---50�����е�ż��
		//��һ�ַ�����
		/*for(int i = 2;i <= 50;i += 2){
			System.out.println(i);
		}*/

		//�ڶ��ַ�����
		/*for(int i = 1;i <= 50;i++){
			//�жϵ�ǰ��i���Ƿ��ܱ�2����
			if(i % 2 == 0){
				System.out.println(i);
			}
		}*/

		//��ϰ4��ʹ��forѭ����ɣ����������λ�����ܱ�6��������������ÿ����ʾ5��
		int count = 0; //count��ʾͳ���ܱ�6�������ĸ���
		for(int i = 100;i <= 999;i++){
			//�жϣ���ǰ��i�Ƿ���6�ı���
			if(i % 6 == 0){
				System.out.print(i + "\t");
				count++;  //count = 2
				//�жϣ���count��ֵΪ5�ı���ʱ����
				if(count % 5 == 0){
					System.out.println();
				}
			}
		}
	}
}
class For03{
	public static void main(String[] args){
		/*
			��ϰ5���������Ч����Ҫ��ÿ�����һ��*
			 ******
		*/
		/*for(int i = 1;i <= 6;i++){
			System.out.print("*");
		}*/

		/*
			��ϰ6���������Ч����Ҫ��ÿ�����һ��*
			 ******
			 ******
			 ******
		*/
		//��һ�ַ�����ʹ��һ��ѭ�����
		/*for(int i = 1;i <= 18;i++){
			System.out.print("*");
			//�жϣ���ǰ��iΪ6�ı���ʱ����
			if(i % 6 == 0){
				System.out.println();
			}
		}*/
		//�ڶ��ַ�����ʹ��˫��ѭ�����
		//���1�е�6��*
		/*for(int i = 1;i <= 6;i++){
			System.out.print("*");
		}
		System.out.println();
		for(int i = 1;i <= 6;i++){
			System.out.print("*");
		}
		System.out.println();
		for(int i = 1;i <= 6;i++){
			System.out.print("*");
		}
		System.out.println(); */

		//�Ż�����Ĵ��룬���£�
		for(int j = 1;j <= 3;j++){
			for(int i = 1;i <= 6;i++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
class For04{
	public static void main(String[] args){
		//ע�⣺1.��forѭ���У��������ʽ������ʡ�ԣ����Ƿֺű����д���������ѭ��Ҳ��������ѭ��������취����ctrl + cǿ����ֹ��������
		/*for(;;){
			System.out.println("OK");
		}*/
		
		//ע�⣺2.��forѭ���У�ʡ�Ա��ʽ1������ֱ�����󣬽���취�������ʽ1��д��forѭ������
		/*int i = 1;
		for(;i <= 5;i++){
			System.out.println(i);
		}*/

		//ע�⣺3.��forѭ���У�ʡ�Ա��ʽ2���������ѭ��������ѭ����Ҳ����˵��ʡ�Ա��ʽ2ʱ��������Ĭ��Ϊtrue
		/*for(int i = 1;;i++){
			System.out.println(i);
		}*/

		//ע�⣺4.��forѭ���У���ʡ�Ա��ʽ3���������ѭ��������취�������ʽ3��д��ѭ���������һ�����
		/*for(int i = 1;i <= 5;){
			System.out.println(i);
			i++;
		}*/

		//ע�⣺5.��forѭ���б��ʽ1�����е�ֵ��ѭ�������ʹ�ã�����ֱ�����󣬽���취�������ʽ1�������ı�������д��forѭ�������������
		int i;
		for(i = 1;i <= 5;i++){
			System.out.println(i);
		}
		System.out.println(i);  //6
	}
}
class While05{
	public static void main(String[] args){
		//��ϰ7��ʹ��whileѭ��������1---10�е�ÿ����
		/*int i = 1;
		while(i <= 10){
			System.out.println(i);
			i++;
		}*/

		//��ϰ8��ʹ��whileѭ�����������е���λ��
		//��ϰ9��ʹ��whileѭ��������50----100��Χ�����е�����
		//��һ�ַ�����
		/*int i = 51;
		while(i <= 100){
			System.out.println(i);
			i += 2;
		}*/

		//�ڶ��ַ�����
		int i = 50;
		while(i <= 100){
			if(i % 2 != 0){
				System.out.println(i);
			}
			i++;
		}
	}
}
class While06{
	public static void main(String[] args){
		//��ϰ10��ʹ��whileѭ��������������λ�����ܱ�4��������������ÿ����ʾ5��
		int i = 100,count = 0;  //i��ʾ��100��ʼ��count��ʾͳ���ܱ�4�����ĸ���
		while(i <= 999){
			if(i % 4 == 0){
				System.out.print(i + "\t");
				count++;
				//�жϵ�ǰcount�����Ƿ���5�ı���
				if(count % 5 == 0){
					System.out.println();
				}
			}
			i++;
		}
	}
}
class DoWhile07{
	public static void main(String[] args){
		//��ϰ11��������������л�������ԣ�Ҫ���ȱ�д�ϻ�����룬Ȼ����ʦ��飬�����鲻�ϸ��������д���룬Ȼ����ʦ�ټ��......һֱ�����ϸ�Ϊֹ
		Scanner input = new Scanner(System.in);  //�����������д��ѭ������
		char info; //ע�⣺info���������д��ѭ���������������������ѭ�������в���ʹ��
		do{
			System.out.println("��д����.......");
			System.out.println("��ʦ����Ƿ�ϸ�?(y/n)");
			info = input.next().charAt(0);  
			//��info��ֵΪnʱ�������д���룬��ʦ���
		}while(info == 'n');
	}
}
class DoWhile08{
	public static void main(String[] args){
		//��ϰ12������һ�������������������ĺͣ�������0ʱ��������
		Scanner input = new Scanner(System.in);
		int sum = 0;  //sum��ʾ����������ĺ�
		do{
			System.out.print("������һ��������");
			int num = input.nextInt();
			//���жϵ�ǰ��num�Ƿ�Ϊ0
			if(num == 0){
				//�������
				break;  //break��ʾ�жϣ�����ѭ��������break�������ǰ����ѭ����ִ��ѭ����������
			}
			//�Ե�ǰ��num�ۼ����
			sum += num;  //sum = -37
		}while(true);
		System.out.println("�������ĺͣ�" + sum);
	}
}
class For09{
	public static void main(String[] args){
		//��ϰ13������5���˵�Java���Գɼ���ͳ�Ƴɼ���95�����ϵ�����
		Scanner input = new Scanner(System.in);
		int count = 0; //��ʾͳ��95�����ϵ�����

		for(int i = 1;i <= 5;i++){ //i = 6
			System.out.print("�������" + i + "���˵ĳɼ���");
			double score = input.nextDouble();
			//�жϣ���ǰ�ɼ�score,�����95�ּ����������������һ���˳ɼ�
			if(score <= 95){
				continue; //��ʾ������������continue���ʱ�����������ѭ������ִ����һ��ѭ��
			}
			//ͳ��95�����ϵ�����
			count++; //count = 2
		}
		System.out.println("95�����ϵ�������" + count);
	}
}
