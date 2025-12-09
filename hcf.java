class hcf
{
public static void main(String args[])
{
int n=81,m=153,hcf=1,i;
for(i=1;i<=n && i<=m;i++)
{
if(n%i==0 && m%i==0)
    hcf=i;
	}
System.out.print("gcd"+hcf);
}
}