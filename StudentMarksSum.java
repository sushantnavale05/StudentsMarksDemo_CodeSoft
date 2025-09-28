import java.util.Scanner;

public class StudentMarksSum 
{
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Marks in sub1 out of (1 to 100) = ");
        int sub1 =sc.nextInt();

        System.out.println("Enter the marks in sub2 out of (1 to 100) = ");
        int sub2 = sc.nextInt();

        System.out.println("Enter the marks in sub3 put of (1 to 100) = ");
        int sub3 = sc.nextInt();

        System.out.println("Enter the marks in sub4 out of (1 to 100) = ");
        int sub4 = sc.nextInt();

        System.out.println("Enter the marks in sub5 out of (1 to 100) = ");
        int sub5 = sc.nextInt();

        int sum = sub1 + sub2 + sub3 + sub4 + sub5;
        System.out.println("the sun of marks in all subject is = " + sum);
    }
    
}
