import java.util.Scanner;

public class FourOperationUsingSwitch13
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number for your maths operation : ");
        double num1 = scanner.nextInt(); //sName where s state String & Seller' ame
        System.out.println("Please enter Second number for your maths operation : ");
        double num2 = scanner.nextInt(); //sName where s state String & Seller' ame

        System.out.println("Please enter one of four operation char to calculate Addition, Subtraction, Multiplication or Division: Acceptable sing '+', '-','*' or '/' only ");
        char operator=scanner.next().charAt(0);
//        String iOperation = scanner.next(); //sName where s state String & Seller' ame

        double output=0;

        switch (operator) {
            case '+' -> output = num1 + num2;
            case '-' -> output = num1 - num2;
            case '*' -> output = num1 * num2;
            case '/' -> output = num1 / num2;
            default -> System.out.println("invalid operation");
        }
        System.out.println("The Output Is:"+output);
    }
}
//        switch (iOperationd)
//        {
//            case +: // look for the int 1 not the char '1'
//                // also, print out what the methods are returning:
//                System.out.println("The answer is: " + add(a, b));
//                break;
//        case 2:
//        subtract(a, b);
//        break;
//        case 3:
//        multiply(a, b);
//        break;
//        case 4:
//        divide(a, b);
//        break;
//        default:
//        System.out.println("You did not make a valid choice, please run the program again.");
//        System.exit(0);

