public class Question19 {
    public static void main(String[] args) {
        int N = 10, a = 0, b = 1;
        System.out.print("Fibonacci Series up to " + N + " terms: ");
        for (int i = 1; i <= N; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}