class prime
{
public static void main(String args[])
{
int a=4,b,c=1,i;
b=a-1;
for(i=b;i>1;i--)
{
if(a%i==0)
{
c=0;
}
else
{
c=1;
}
}
if(c==1)
{
System.out.print("It is a prime number");
}
else
{
System.out.print("It is not a prime number");
}
}
}