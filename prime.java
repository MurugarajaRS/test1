import java.util.*;
import java.io.*;
class prime
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int  s = scan.nextInt();
        int temp = 0;
        for(int i=2;i<=s/2;i++)
        {    
            if(s%i==0)
            {
                System.out.print("the given number is not prime number");
                temp= 1;
                break;
            }
        }
        if(temp == 0)
           System.out.print("the given number is prime ");
    }
}


