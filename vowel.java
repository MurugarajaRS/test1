import java.io.*;
import java.util.*;
class vowel

{
	public static void main(String args[])	
	{
		Scanner scan = new Scanner(System.in);
	    char a = scan.next().charAt(0);
	    if ((a=='a')||(a=='e')||(a=='i')||(a=='o')||(a=='u'))
	        System.out.println("the given character " +a+ " is vowel in lower case");
	    else if ((a=='A')||(a=='E')||(a=='O')||(a=='I')||(a=='U'))	   
	        System.out.println("the given character " +a+ "is vowel in upper case");
	    else
	        System.out.println("the given character " +a+ " is consonant");
	   
	    
	    
	}
}		


