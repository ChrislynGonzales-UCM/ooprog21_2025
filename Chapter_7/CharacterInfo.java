

import java.util.Scanner;

public class CharacterInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a single character: ");
        char ch = input.next().charAt(0);

        System.out.println("\n--- Character Information ---");
        System.out.println("Character entered: '" + ch + "'");

        
        if (Character.isUpperCase(ch))
            System.out.println("It is an uppercase letter.");
        else if (Character.isLowerCase(ch))
            System.out.println("It is a lowercase letter.");
        else
            System.out.println("It is not a letter.");

        
        System.out.println("Uppercase version: " + Character.toUpperCase(ch));
        System.out.println("Lowercase version: " + Character.toLowerCase(ch));

        
        if (Character.isLetterOrDigit(ch))
            System.out.println("It is a letter or digit.");
        else
            System.out.println("It is NOT a letter or digit.");

        
        if (Character.isWhitespace(ch))
            System.out.println("It is a whitespace character.");
        else
            System.out.println("It is NOT a whitespace character.");

        input.close();
    }
}
