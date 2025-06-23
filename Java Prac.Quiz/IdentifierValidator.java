import java.util.Scanner;

public class IdentifierValidator {
    public boolean isValidIdentifier(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        // First character must be a letter or underscore
        if (!Character.isLetter(str.charAt(0)) && str.charAt(0) != '_') {
            return false;
        }

        // Remaining characters must be letters, digits, or underscores
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isLetterOrDigit(ch) && ch != '_') {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            IdentifierValidator validator = new IdentifierValidator();

            while (true) {
                System.out.println("Enter a string to check if it is a valid identifier ('Quit' to Exit):");
                String input = scn.nextLine().trim();

                if (input.equalsIgnoreCase("Quit")) {
                    break;
                }

                boolean isValid = validator.isValidIdentifier(input);
                if (isValid) {
                    System.out.println(input + " is a valid identifier");
                } else {
                    System.out.println(input + " is not a valid identifier");
                }
                System.out.println();
            }
            System.out.println("System Terminated");
        }
    }
}