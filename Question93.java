public class Question93 {
    public static void main(String[] args) {
        String str = "madam racecar hello";
        String[] words = str.split(" ");
        for (String word : words) {
            if (isPalindrome(word)) System.out.print(word + " ");
        }
    }

    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }
}