import java.io.*;
import java.util.*;
class digit

{
	public static void main(String args[])	
	{
		Scanner scan = new Scanner(System.in);
	    int count = 0;
	    boolean flag = false;
	    System.out.println("Enter the String containing numbers: ");
	    String str = scan.next();
	    char a[] =str.toCharArray();
	    
	    for (int i=0;i<str.length();i++)
	    {
	        //a[i] = scan.nextInt();
	        //if(a[i])
	        flag = Character.isDigit(a[i]);
	        if(flag == true)
	            count = count+1;
	            
	    }
	        System.out.println("Digit is " +count);
	}
}		


