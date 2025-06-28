public class Question1 {
    public static void main(String[] args) {
        int count = 0, sum = 0, num = 2;
        while (count < 20) {
            if (isPrime(num)) {
                sum += num;
                count++;
            }
            num++;
        }
        System.out.println("Sum of the first 20 prime numbers: " + sum);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void verma();
}