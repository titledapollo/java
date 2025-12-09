import java.util.Scanner;
class palindrome
{
public static void main(String args[])
{
int len;
String str,rev="";
Scanner S=new Scanner(System.in);
System.out.println("enter a string");
str=S.nextLine();
len=str.length();
for(int i=len-1;i>=0;i--)
rev= rev+str.charAt(i);
if(str.equals(rev))
 System.out.println(str+"is a palindrome");
 else
 System.out.println(str+"is not a palindrome");
 }
 }