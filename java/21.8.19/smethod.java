class smethod
{
static int a=1;
int x,y;
smethod()
{
a=a+1;
}
static void show()
{
System.out.println("Result="+a);
}
public static void main(String args[])
{
smethod.show();
smethod.show();
}


}