public class Question66 {
    public static void main(String[] args) {
        int N = 10, sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += 2 * i;
        }
        System.out.println("Sum of first " + N + " even numbers: " + sum);
    }
}