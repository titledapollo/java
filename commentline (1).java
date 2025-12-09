class addition
{
int sum,num1,num2;
addition(int a,int b)
{
sum=0;
num1=a;
num2=b;
}
void add()
{
sum=num1+num2;
}
void display()
{
System.out.println("Addition="+sum);
}
public static void main(String args[])
{
int c,d;
c=Integer.parseInt(args[0]);
d=Integer.parseInt(args[1]);
addition ad=new addition(c,d);
ad.add();
ad.display();
}
}