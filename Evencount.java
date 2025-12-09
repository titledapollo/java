import java.util.Scanner;
 
class Evencount
{
   public static void main(String args[])
   {
   int len,count;
      String str;
      Scanner s= new Scanner(System.in);
      System.out.println("Enter a string:");
      str = s.nextLine();
      len= str.length();
	  count=(len/2);
	  System.out.println("The no. of spaces are="+count);
	  }
}
