public class Question22 {
    public static void main(String[] args) {
        int N = 10, count = 0, num = 2;
        System.out.print("First " + N + " prime numbers: ");
        while (count < N) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
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