public class For_test {
    public static void changeData(int n) {
        n = 10;
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println("Before change, n = " + n);
        changeData(n);
        System.out.println("After changeData(n), n = " + n);
    }
}
