import java.util.Random;

public class Question96 {
    public static void main(String[] args) {
        int rows = 3, cols = 3;
        int[][] mat = new int[rows][cols];
        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = rand.nextInt(100);
            }
        }
        for (int[] row : mat) {
            for (int num : row) System.out.print(num + "\t");
            System.out.println();
        }
    }
}