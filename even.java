import java.io.*;
import java.util.Scanner;
class even
{
	public static void main(String args[])
	{
		Scanner odd = new Scanner (System.in);
		int n=odd.nextInt();
		if((n%2)==0)
			System.out.println("GIVEN NUMBER IS EVEN");
		else
			System.out.println("GIVEN NUMBER IS ODD");
		
	}
}
