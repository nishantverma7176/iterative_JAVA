public class Question11 {
    public static void main(String[] args) {
        int N = 50, sum = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) sum += i;
        }
        System.out.println("Sum of even numbers from 1 to " + N + ": " + sum);
    }
}