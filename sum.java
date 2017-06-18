import java.io.*;
import java.util.*;
class sum

{
	public static void main(String args[])	
	{
		Scanner scan = new Scanner(System.in);
	    int N = scan.nextInt();
	    int sum = 0;
	    int a[] = new int[N];
	    System.out.println("Enter the number: ");
	    for (int i=0;i<N;i++)
	    {
	        a[i] = scan.nextInt();
	        sum=a[i]+sum;
	    }
	        System.out.println("Sum is " +sum);
	}
}		


