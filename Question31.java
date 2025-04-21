public class Question31 {
    public static void main(String[] args) {
        int num = 12345, count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        System.out.println("Number of digits: " + count);
    }
}