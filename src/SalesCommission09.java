import java.util.Scanner;

public class SalesCommission09
{

    static double iSales;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter Sellers name : ");
        String sName = scanner.next(); //sName where s state String & Seller' ame

        System.out.println("Please enter Sales ID: ");
        String sID = scanner.next();

        System.out.println("Please enter your Basic Salary: ");
        double BasicSalary = scanner.nextInt(); //for your Math Marks

        System.out.println("Please enter your Sales Ammount: ");
        double iSales = scanner.nextInt(); //for your Math Marks
//
//        System.out.println("Please enter your DA Allowance %: ");
//        double DA = scanner.nextInt(); //for your Math Marks
//
//        System.out.println("Please enter your TA Allowance %:: ");
//        double TA = scanner.nextInt(); //for your Math Marks
//
//        System.out.println("Please enter your PF Allowance %: ");
//        double PF = scanner.nextInt(); //for your Math Marks
//
//        HRA=HRA*(BasicSalary/100);
//        DA=DA*(BasicSalary/100);
//        TA=TA*(BasicSalary/100);
//        PF=PF*(BasicSalary/100);
//        GrossSalary=BasicSalary+ + HRA + + DA + +  TA + +PF;
//
//        System.out.println("Employee Name: " + sName);
//        System.out.println("Employee ID: " + sEmoloyeeID);
//        System.out.println("Your Basic Salary is : " + BasicSalary);
//        System.out.println("Your HRA is : " + HRA);
//        System.out.println("Your HRA is : " + DA);
//        System.out.println("Your HRA is : " + TA);
//        System.out.println("Your HRA is : " + PF);
//
//        System.out.println("Your Gross Salary is : "+ GrossSalary);

        if (iSales < 10000) {
            System.out.println(sName + " Is Entitled for Basic Salary +  2% Commission!");
        } else {
            if (iSales >= 50000) {
                System.out.println(sName + " Is Entitled for Basic Salary +  35% Commission!");
            } else if (iSales >= 30000 && iSales < 49999.99) {
                System.out.println(sName + " Is Entitled for Basic Salary +  20% Commission!");
            } else if (iSales >= 20000 && iSales < 29999.99) {
                System.out.println(sName + " Is Entitled for Basic Salary +  10% Commission!");
            } else if (iSales < 19999.99) {
                System.out.println(sName + " Is Entitled for Basic Salary +  20% Commission!");


            }


}}}