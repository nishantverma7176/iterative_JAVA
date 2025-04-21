public class Question99 {
    public static void main(String[] args) {
        String str = "hello world";
        int[] count = new int[256];
        for (char ch : str.toCharArray()) {
            count[ch]++;
        }
        for (int i = 0; i < 256; i++) {
            if (count[i] > 0) System.out.println((char) i + ": " + count[i]);
        }
    }
}