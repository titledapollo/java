class dbc
{
dbc(int n)
{
     int r,s=0,i=0,m=0,j=0,d;
     double p;   
		while(n!=0)
           {
            r=n%2;
            n=n/2;
            s=(s*10)+r;
            i=i+1;
           }
        while(s!=0)
          {
           m=m*10;
           m=m+(s%10);
           s=s/10;
           j=j+1;
          }
        d=i-j;
		System.out.println(m);
        p=m*Math.pow(10,d);
        System.out.println("Binary="+(int)p);
}
public static void main(String args[])
{
dbc b=new dbc(10);
}
}