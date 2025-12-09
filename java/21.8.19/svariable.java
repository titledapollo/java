class svariable
{
 static int a=1;
 svariable()
 {
  a=a+1;
 }
 void show()
 {
  System.out.println("Result="+a);
 }
public static void main(String args[])
{
  svariable s=new svariable();
  s.show();
  svariable s1=new svariable();
  s1.show();
}
}