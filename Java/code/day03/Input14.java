import java.util.Scanner;
class Input14{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String name = input.next();
		int age = input.nextInt();
		String s = input.next();
		char sex = s.charAt(0);
		double score = input.nextDouble();
		boolean isFlag = input.nextBoolean();
		input.close();
		System.out.println(name+'\n'+age+'\n'+sex+'\n'+score+'\n'+isFlag);
	}
}