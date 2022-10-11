import java.util.Scanner;

public class NegativeOrZero08
{


        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your number to find if number if positive, neegative or zero : ");
            double i = scanner.nextInt(); // to enter your year

            if (i>0)
            {
                System.out.println(i + ": Is positive number.");}

            else if (i==0)
                 {
                     System.out.println(i + ": Is Zero."); }

             else {
                System.out.println(i + " : Is negative number");


        }

}
















}
