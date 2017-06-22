import java.util.*;
import java.io.*;
class palindrome
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int  s = scan.nextInt();
        int r = 0,temp,sum = 0;
        temp = s;
       
        while(s>0)
        {
            r=s%10;
            sum=(sum*10)+r;
            s=s/10;
        }
        if(temp == sum)
           
            System.out.print("the given number is palindrome");
        else
            System.out.print("the given number is not palindrome");
            
    }
}


