public class Question13 {
    public static void main(String[] args) {
        int N = 50;
        System.out.print("Prime numbers from 1 to " + N + ": ");
        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) System.out.print(i + " ");
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}