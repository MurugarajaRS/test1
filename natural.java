import java.util.*;
class natural
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the number");
        int n = scan.nextInt();
        for (int i=0;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("the sum of the natural number is "+sum);
            
    }
}
