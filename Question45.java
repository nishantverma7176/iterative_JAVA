public class Question45 {
    public static void main(String[] args) {
        String sentence = "Hello world this is Java";
        String[] words = sentence.split(" ");
        String shortest = words[0];
        for (String word : words) {
            if (word.length() < shortest.length()) shortest = word;
        }
        System.out.println("Shortest word: " + shortest);
    }
}