public class Question4 {
    public static void main(String[] args) {
        int num = 12345, reversed = 0;
        for (; num != 0; num /= 10) {
            reversed = reversed * 10 + num % 10;
        }
        System.out.println("Reversed number: " + reversed);
    }
}