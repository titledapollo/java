import java.util.Scanner;
 
class Count
{
   public static void main(String args[])
   {
   int len;
      String str;
      Scanner s= new Scanner(System.in);
      System.out.println("Enter a string:");
      str = s.nextLine();
      len= str.length();
	  System.out.println("The word lenght is="+len);
	  }
}