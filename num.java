
import java.io.*;
import java.util.Scanner;
class num
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{	
			a[i]=scan.nextInt();
			if(a[i]!=0)
			{	
				if(a[i]>0)
					System.out.println("POSITIVE");
				else
					System.out.println("NEGATIVE");
			}
			else
				System.out.println("ZERO");
		}			
	}
}
