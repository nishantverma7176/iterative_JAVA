public class Question94 {
    public static void main(String[] args) {
        int num = 102030, count = 0;
        while (num != 0) {
            if (num % 10 != 0) count++;
            num /= 10;
        }
        System.out.println("Non-zero digits: " + count);
    }
}