public class Question86 {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, 5, -6};
        int positive = 0, negative = 0;
        for (int num : arr) {
            if (num > 0) positive++;
            else if (num < 0) negative++;
        }
        System.out.println("Positive: " + positive + ", Negative: " + negative);
    }
}