import java.util.Scanner;

public class StudentGradeCalculation 
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

        // Calculate sun of the all marks
        int sum = sub1 + sub2 + sub3 + sub4 + sub5;
        System.out.println("the sun of marks in all subject is = " + sum);

        // Calculate the average percentage
        double percentage = (double)sum / 5;
        System.out.println("The Total percentage of student is = " + percentage + "%");

        // Determine the grade based on percentage
        if(percentage >= 90)
        {
            System.out.println("the grade og student is = A");
        }
        else if(percentage >= 80)
        {
            System.out.println("The grade of student is = B");
        }
        else if(percentage >=70)
        {
            System.out.println("The grade of student is = C");
        }
        else if(percentage >= 60)
        {
            System.out.println("The grade of student is = D");
        }
        else if(percentage >= 40)
        {
            System.out.println("The grade of student is = E");
        }
        else
        {
            System.out.println("The grade of student is = Fail");
        }
    }
}
