import java.util.Scanner;

public class Sum_num
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int num =scan.nextInt();
        if(num<=0)
        {
            System.out.println("Please,enter a positive number: ");
            num = scan.nextInt();
        }
        else
        {
            int sum=0;
            for(int i=0;i<=num;i++)
            {
                sum=sum+i;
            }
            System.out.println("The sum of " + num + "positive numbers is: " + sum );
        }
        scan.close();
        
    }
}

//this is question number 1.
