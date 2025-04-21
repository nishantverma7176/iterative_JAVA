public class Question53 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int evenSum = 0, oddSum = 0;
        for (int num : arr) {
            if (num % 2 == 0) evenSum += num;
            else oddSum += num;
        }
        System.out.println("Difference: " + Math.abs(evenSum - oddSum));
    }
}