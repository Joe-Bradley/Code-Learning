class Method01{
	//使用递归完成，计算n!
	public static int mul(int n){
		if(n == 0 || n == 1){
			return 1;
		}
		return n * mul(n - 1); 
	}
	public static void main(String[] args){
		System.out.println(mul(3));
	}
}