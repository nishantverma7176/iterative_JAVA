public class Question74 {
    public static void main(String[] args) {
        int N = 10, a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        while (N-- > 0) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}