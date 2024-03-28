
public class FirstCharCheck {


    public static String repFirstChar(String input) {

        if (input == null || input.isEmpty()) {
            return "empty";
        }

        char firstChar = input.charAt(0);
        if (Character.isUpperCase(firstChar)) {
            return "upper";
        } else if (Character.isLowerCase(firstChar)) {
            return "lower";
        } else if (Character.isDigit(firstChar)) {
            return "digit";
        } else {
            return "other";
        }
    }

    public static void main(String[] args) {
        String[] testStrings = {"Hello", "world", "123", "$", ""};
        for (String str : testStrings) {
            System.out.println("First character of \"" + str + "\": " + repFirstChar(str));
        }
    }
}
