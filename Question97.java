public class Question97 {
    public static void main(String[] args) {
        int N = 5;
        int[][] mat = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int[] row : mat) {
            for (int num : row) System.out.print(num + "\t");
            System.out.println();
        }
    }
}