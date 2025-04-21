public class Question60 {
    public static void main(String[] args) {
        String str = "Hello World";
        char target = 'l';
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == target) count++;
        }
        System.out.println("Occurrences of '" + target + "': " + count);
    }
}