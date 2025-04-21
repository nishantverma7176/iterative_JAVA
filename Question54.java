public class Question54 {
    public static void main(String[] args) {
        String str = "12345";
        boolean isDigits = true;
        for (char ch : str.toCharArray()) {
            if (!Character.isDigit(ch)) {
                isDigits = false;
                break;
            }
        }
        System.out.println(isDigits ? "Only digits" : "Not only digits");
    }
}