import java.util.Scanner;

public class EmployeeSalary06
{
        static double SalaryBasic, DA,HRA,TA,PF,GrossSalary;
//
//    public static void setHRA(double HRA) { EmployeeSalary06.HRA = HRA;
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your Name : ");
        String sName = scanner.next(); //sName where s state String

        System.out.println("Please enter your Employee ID: ");
        String sEmoloyeeID = scanner.next();

        System.out.println("Please enter your Basic Salary: ");
        double BasicSalary = scanner.nextInt(); //for your Math Marks

        System.out.println("Please enter your HRA Allowance %: ");
        double HRA = scanner.nextInt(); //for your Math Marks

        System.out.println("Please enter your DA Allowance %: ");
        double DA = scanner.nextInt(); //for your Math Marks

        System.out.println("Please enter your TA Allowance %:: ");
        double TA = scanner.nextInt(); //for your Math Marks

        System.out.println("Please enter your PF Allowance %: ");
        double PF = scanner.nextInt(); //for your Math Marks

        HRA=HRA*(BasicSalary/100);
        DA=DA*(BasicSalary/100);
        TA=TA*(BasicSalary/100);
        PF=PF*(BasicSalary/100);
        GrossSalary=BasicSalary+ + HRA + + DA + +  TA + +PF;

        System.out.println("Employee Name: " + sName);
        System.out.println("Employee ID: " + sEmoloyeeID);
        System.out.println("Your Basic Salary is : " + BasicSalary);
        System.out.println("Your HRA is : " + HRA);
        System.out.println("Your HRA is : " + DA);
        System.out.println("Your HRA is : " + TA);
        System.out.println("Your HRA is : " + PF);

        System.out.println("Your Gross Salary is : "+ GrossSalary);

    }
}
