import java.util.Scanner;
 
class Count
{
   public static void main(String args[])
   {
   int len,count,i;
      String str;
	  
      Scanner s= new Scanner(System.in);
      System.out.println("Enter a string=");
      str = s.nextLine();
	  System.out.println("Enter the character=");
      char c = s.next().charAt(0);
      len= str.length();
	  count=0;
	  for (i = 0; i < len; i++) 
	  {
    if (str.charAt(i)==c) 
	{
        count++;
    }
}
 System.out.println("The charecter no. is="+count);
}
}
