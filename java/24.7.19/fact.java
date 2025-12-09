class fact
{
fact(int x)
{
int i,f=1;
for(i=1;i<=x;i++)
{
f=f*i;
}
System.out.print("Factorial="+f);
}
public static void main(String args[])
{
fact f=new fact(5);
}
}