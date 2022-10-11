import java.util.Scanner;

public class TurneryOperator01
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt(); // to enter your number

        String evenOdd = (num%2 ==0) ? " an Even number " : " a Odd number " ;
        System.out.println(num + " is " + evenOdd);

    }
}

