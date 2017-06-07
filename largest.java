
import java.io.*;
import java.util.Scanner;
import java.lang.*;
class largest
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int c[]=new int[n];
		for (int i=0; i<n;i++)
		{
			a[i]= scan.nextInt();
			b[i]= scan.nextInt();
			c[i]= scan.nextInt();
			if ((a[i]>b[i])&&(a[i]>c[i]))
				System.out.println("the largest number is a "+a[i]);
			else if (b[i]>c[i])
				System.out.println("the largest number is b "+b[i]);
			else
				System.out.println("the largest number is c "+c[i]);
	 	}
	}
}
