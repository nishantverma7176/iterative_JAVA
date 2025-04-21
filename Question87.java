public class Question87 {
    public static void main(String[] args) {
        int[][] mat = {{1, -2, 3}, {-4, 5, -6}, {7, -8, 9}};
        int sum = 0;
        for (int[] row : mat) {
            for (int num : row) {
                if (num > 0) sum += num;
            }
        }
        System.out.println("Sum of positive elements: " + sum);
    }
}