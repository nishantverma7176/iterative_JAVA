public class Question77 {
    public static void main(String[] args) {
        int num = 16;
        boolean isPowerOfTwo = (num > 0) && ((num & (num - 1)) == 0);
        System.out.println(isPowerOfTwo ? "Power of two" : "Not power of two");
    }
}