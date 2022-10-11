import java.util.Scanner;

public class VoterEligibility11
{
    int iAge;
    public static void main(String[] args)
    {


           Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your age to verify if you are eligible for voting or not : ");
        int iAge=scanner.nextInt();//iName where s state int & Age

        if (iAge>=18) {System.out.println("You are eligible for voter registration to cast your Vote.");}
        else { System.out.println("You are NOT eligible for voter registration!!!.");}
    }








}
