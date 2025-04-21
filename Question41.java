public class Question41 {
    public static void main(String[] args) {
        int num = 123456, sum = 0, pos = 1;
        while (num != 0) {
            if (pos % 2 == 0) sum += num % 10;
            num /= 10;
            pos++;
        }
        System.out.println("Sum of digits at even positions: " + sum);
    }
}