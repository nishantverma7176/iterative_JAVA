public class Question69 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 15, 30};
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        System.out.println("Largest element: " + max);
    }
}