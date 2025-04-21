public class Question57 {
    public static void main(String[] args) {
        int[] arr = {123, 45, 6789, 1};
        int totalDigits = 0;
        for (int num : arr) {
            totalDigits += String.valueOf(num).length();
        }
        System.out.println("Total digits: " + totalDigits);
    }
}