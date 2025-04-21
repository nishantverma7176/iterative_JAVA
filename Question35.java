public class Question35 {
    public static void main(String[] args) {
        int N = 50, count = 0;
        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) count++;
        }
        System.out.println("Prime numbers up to " + N + ": " + count);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}