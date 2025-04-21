public class Question50 {
    public static void main(String[] args) {
        int N = 10, a = 0, b = 1, sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += a;
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println("Sum of first " + N + " Fibonacci numbers: " + sum);
    }
}