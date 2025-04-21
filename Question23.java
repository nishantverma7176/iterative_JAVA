public class Question23 {
    public static void main(String[] args) {
        int N = 5, sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares of first " + N + " natural numbers: " + sum);
    }
}