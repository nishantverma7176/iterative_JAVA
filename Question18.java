public class Question18 {
    public static void main(String[] args) {
        int num = 28;
        System.out.print("Divisors of " + num + ": ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) System.out.print(i + " ");
        }
    }
}