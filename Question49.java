public class Question49 {
    public static void main(String[] args) {
        int a = 12, b = 18;
        System.out.print("Common divisors of " + a + " and " + b + ": ");
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) System.out.print(i + " ");
        }
    }
}