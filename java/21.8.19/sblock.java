class sblock
{
static
{
System.out.println("SKFGI");
}
static int a=1;
 sblock()
 {
 a=a+1;
 }
 static void show()
 {
 System.out.println("Result="+a);
 }
 public static void main(String args[])
 {
 sblock s=new sblock();
 s.show();
 sblock s1=new sblock();
 s1.show();
 }
 }
 
