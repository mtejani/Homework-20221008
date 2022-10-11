import java.util.Scanner;

public class AlphabetToRevertinLowerOrUpper12 {

    public static void main(String args[]) {

        // printing alphabets in lower case i.e. 'a' to 'z'
       // printing alphabets in upper case i.e. 'A' to 'Z'

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age to verify if you are eligible for voting or not : ");
        String letters = scanner.next();

        for (int i = 0; i < letters.length(); i++) {
            char letter1 = letters.charAt(0);
            if (Character.isUpperCase(letter1)) {
                System.out.println(Character.toLowerCase(letter1));
            } else {
                System.out.println(Character.toUpperCase(letter1));
            }
        }


    }
 }









