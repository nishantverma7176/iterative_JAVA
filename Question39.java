public class Question39 {
    public static void main(String[] args) {
        int num = 28;
        System.out.print("Factors of " + num + ": ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) System.out.print(i + " ");
        }
    }
}