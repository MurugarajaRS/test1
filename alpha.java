import java.util.*;
class alpha
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        char c1 = scan.next().charAt(0);
        //"the given character is alphabet");
        int c=(int)c1;
        System.out.println(c);
        if ((65<=c)&&(c<=90))
            System.out.println("the given character is upper case alphabet");
        else if ((97<=c)&&(c<=122))
            System.out.println("the given character is lower case alphabet");
        else
            System.out.println("the given character is not alphabet");
            
    }
}
