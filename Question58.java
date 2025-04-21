public class Question58 {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int n = mat.length;
        for (int slice = 0; slice < 2 * n - 1; slice++) {
            int z = slice < n ? 0 : slice - n + 1;
            for (int j = z; j <= slice - z; j++) {
                System.out.print(mat[j][slice - j] + " ");
            }
            System.out.println();
        }
    }
}