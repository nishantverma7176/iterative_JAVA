public class Question71 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print((i + j) % 2 == 0 ? "* " : "  ");
            }
            System.out.println();
        }
    }
}