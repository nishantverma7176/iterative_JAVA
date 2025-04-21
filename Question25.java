public class Question25 {
    public static void main(String[] args) {
        int num = 153, originalNum = num, sum = 0;
        int digits = String.valueOf(num).length();
        while (num != 0) {
            int rem = num % 10;
            sum += Math.pow(rem, digits);
            num /= 10;
        }
        System.out.println(sum == originalNum ? "Armstrong" : "Not Armstrong");
    }
}