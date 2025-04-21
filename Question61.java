public class Question61 {
    public static void main(String[] args) {
        String str1 = "listen", str2 = "silent";
        if (str1.length() != str2.length()) {
            System.out.println("Not Anagrams");
            return;
        }
        int[] count = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        boolean isAnagram = true;
        for (int c : count) {
            if (c != 0) {
                isAnagram = false;
                break;
            }
        }
        System.out.println(isAnagram ? "Anagrams" : "Not Anagrams");
    }
}