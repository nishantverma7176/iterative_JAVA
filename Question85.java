public class Question85 {
    public static void main(String[] args) {
        int n = 4, val = 1;
        int[][] mat = new int[n][n];
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) mat[top][i] = val++;
            top++;
            for (int i = top; i <= bottom; i++) mat[i][right] = val++;
            right--;
            for (int i = right; i >= left; i--) mat[bottom][i] = val++;
            bottom--;
            for (int i = bottom; i >= top; i--) mat[i][left] = val++;
            left++;
        }
        for (int[] row : mat) {
            for (int num : row) System.out.print(num + "\t");
            System.out.println();
        }
    }
}