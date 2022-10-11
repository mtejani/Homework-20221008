import java.util.Scanner;

public class AlphabetCity10
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first character of your city between A to E : ");
        char cName = scanner.next().charAt(0); //sName where s state String & Seller' ame


        switch (cName) {
            case 'a': case'A': System.out.println("Aberdeen");break;
            case 'b': case'B': System.out.println("Birmingham");break;
            case 'c': case'C': System.out.println("Coventry");break;
            case 'd': case'D': System.out.println("Derby");break;
            case 'e': case'E': System.out.println("Edinburgh");break;
            default : System.out.println("Invalid character");break;
        }
    }


}
