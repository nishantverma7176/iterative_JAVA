public class Question88 {
    public static void main(String[] args) {
        int N = 50, count = 0;
        for (int i = 1; i * i <= N; i++) {
            count++;
        }
        System.out.println("Perfect squares up to " + N + ": " + count);
    }
}