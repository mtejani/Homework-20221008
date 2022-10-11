import java.util.Scanner;
public class Average07
{


    static double num1, num2,num3,num4,num5;
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your num1: ");
        double num1 = scanner.nextInt(); //for your Math Marks

        System.out.println("Please enter your num2: ");
        double num2 = scanner.nextInt(); //for your Math Marks

        System.out.println("Please enter your num3: ");
        double num3 = scanner.nextInt(); //for your Math Marks

        System.out.println("Please enter your num4: ");
        double num4 = scanner.nextInt(); //for your Math Marks

        System.out.println("Please enter your num5 ");
        double num5 = scanner.nextInt(); //for your Math Marks



        System.out.print("Your average number for last 5 Digit is: " +((num1 + +num2+ +num3 + +num4 + +num5)/5));

    }
}

