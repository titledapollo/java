class prime
{
public static void main(String args[])
{
int n=5,i,c=0;
for(i=2;i<=n/2;i++)
{
if(n%i==0)
{
System.out.print("not a prime no:");
c=1;
break;
}
}
if(c==0)
{
System.out.print(" a prime no:");
}
}
}
