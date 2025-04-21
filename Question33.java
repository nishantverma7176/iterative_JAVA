public class Question33 {
    public static void main(String[] args) {
        int num = 1234567, sum = 0;
        while (num != 0) {
            int digit = num % 10;
            if (digit % 2 != 0) sum += digit;
            num /= 10;
        }
        System.out.println("Sum of odd digits: " + sum);
    }
}