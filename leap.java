import java.util.*;
import java.io.*;
public class hi {
   public static void main(String args[]) {
	Scanner leap = new Scanner(System.in);
	int n=0;
	n=leap.nextInt(); 
	int a[]=new int[n];
	
	for(int i=0;i<n;i++)
	{	
		a[i]= leap.nextInt();
		if((a[i]%4)==0)
			System.out.println("this year is leap year");
		else
			System.out.println("this year is not leap year");
	}
 }
}
