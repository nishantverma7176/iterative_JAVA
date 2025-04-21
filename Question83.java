public class Question83 {
    public static void main(String[] args) {
        int num = 11223344;
        int[] count = new int[10];
        while (num != 0) {
            count[num % 10]++;
            num /= 10;
        }
        for (int i = 0; i < 10; i++) {
            if (count[i] > 0) System.out.println(i + ": " + count[i]);
        }
    }
}