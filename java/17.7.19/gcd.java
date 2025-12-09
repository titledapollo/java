class gcd
{
public static void main(String args[])
{
int a=10,b=20,c=0,i;
for(i=1;i<=a&&i<=b;i++)
{
if(a%i==0 && b%i==0)
c=i;
}
System.out.print("GCD="+c);
}
}