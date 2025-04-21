public class Question68 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 15, 30};
        int min = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
        }
        System.out.println("Smallest element: " + min);
    }
}