import java.util.Scanner;

public class StudentMarks03
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int iTotal; //iTotal where i state int
        int iPercentage;

        System.out.println("Please enter your Name : ");
        String sName = scanner.next(); //sName where s state String

        System.out.println("Please enter your Roll No.: ");
        String sRollNum = scanner.next();

        System.out.println("Please enter your mark for Math : ");
        int iMath=scanner.nextInt(); //for your Math Marks

        System.out.println("Please enter your mark for English : ");
        int iEnglish=scanner.nextInt(); //for your English Marks

        System.out.println("Please enter your mark for Science : ");
        int iScience=scanner.nextInt(); //for your Science Marks


        iTotal = iMath + iEnglish +iScience;
        iPercentage = iTotal/ 3;

        System.out.println("Student Name : "+sName);
        System.out.println("Student Roll no.: "+sRollNum);
        System.out.println("Student total marks is = " + iTotal );
        System.out.println("Student percentage received = " + iPercentage);


            if (iPercentage>=80  && iPercentage<=100) {
                System.out.println("Congratulations !!! Welldone you have paased and Achived Grade : A+ in the Exam.");}
                else if (iPercentage>=60  && iPercentage<80){
                    System.out.println("Congratulations !!! Welldone you have paased and Achived Grade : A in the Exam.");}
                    else if (iPercentage>=50  && iPercentage<60) {
                        System.out.println("Congratulations !!! Welldone you have paased and Achived Grade : B in the Exam.");}
                        else if (iPercentage>=35  && iPercentage<50) {
                            System.out.println("Congratulations !!! Welldone you have paased and Achived Grade : C  in the Exam.");
            } else {
            System.out.println("You have failed!!!");
            }



    }



}
