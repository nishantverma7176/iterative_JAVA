public class Question9 {
    public static void main(String[] args) {
        String str = "Hello World";
        int vowels = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.toLowerCase().charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
        }
        System.out.println("Number of vowels: " + vowels);
    }
}