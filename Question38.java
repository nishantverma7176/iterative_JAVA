public class Question38 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 15, 30};
        int min = arr[0], max = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        System.out.println("Min: " + min + ", Max: " + max);
    }
}