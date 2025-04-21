public class Question12 {
    public static void main(String[] args) {
        int N = 50, sum = 0, i = 1;
        while (i <= N) {
            if (i % 2 != 0) sum += i;
            i++;
        }
        System.out.println("Sum of odd numbers from 1 to " + N + ": " + sum);
    }
}