public class Question81 {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.print("Reversed string: ");
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}