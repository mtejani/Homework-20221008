import java.util.Scanner;

public class VowelOrConsonant16 {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please any Alphabetical character to find out if character is Vowel or Consonant : ");
        char iAlpha=scanner.next().charAt(0);


        if (iAlpha == 'a' || iAlpha == 'e' || iAlpha == 'i' || iAlpha == 'o' || iAlpha == 'u')
            System.out.println(iAlpha + " is vowel");
        else
            System.out.println(iAlpha + " is consonant");


    }
}