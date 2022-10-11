import java.util.Scanner;

public class WeekDayWithSwitch15
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter week day number between 1 to 7 i.e. for Monday enter 1: ");
        int i = scanner.nextInt(); //sName where s state String & Seller' ame


        switch (i) {
            case 1:  System.out.println("Monday");break;
            case 2:  System.out.println("Tuesday");break;
            case 3:  System.out.println("Wednesday");break;
            case 4:  System.out.println("Thursday");break;
            case 5:  System.out.println("Friday");break;
            case 6:  System.out.println("Saturday");break;
            case 7:  System.out.println("Sunday");break;
            default : System.out.println("Invalid number please try again");break;
        }
    }



}
