public class Question84 {
    public static void main(String[] args) {
        int num = 123456, sum = 0;
        while (num != 0) {
            int digit = num % 10;
            if (digit % 3 == 0) sum += digit;
            num /= 10;
        }
        System.out.println("Sum of digits divisible by 3: " + sum);
    }
}