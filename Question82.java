public class Question82 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j % 2 == 0 ? "0 " : "* ");
            }
            System.out.println();
        }
    }
}