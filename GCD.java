import java.util.Scanner;

public class GCD 
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    int gcd=1;
    System.out.print("Enter the first number: ");
    int x=sc.nextInt();
    System.out.print("Enter the second number: ");
    int y=sc.nextInt();
    for(int i=1;i<=x && i<=y ; i++)
    {
        if(x%i==0 && y%i==0)
        {
            gcd=i;
        }
    }
    System.out.println("GCD of " + x + " and " + y + " is " + gcd);
    sc.close();
    }
}

