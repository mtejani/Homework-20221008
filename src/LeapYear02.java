import java.time.Year;
import java.util.Scanner;

public class LeapYear02
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year : ");
        int year = scanner.nextInt(); // to enter your year

        int iYear;
        String LeapYear = (year%4 ==0) ? " a leap year. " : " not a leap year. " ;
        System.out.println(year + " Is " + LeapYear);

    }

}
