import java.io.Console;
class addition_c
{
int sum,num1,num2;
addition_c(int a,int b)
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
System.out.print(" "+sum);
}
public static void main(String args[])
{
int p,q;
Console s= System.console();
p=Integer.parseInt(s.readLine());
q=Integer.parseInt(s.readLine());
addition_c t = new addition_c(p,q);
t.add();
t.display();
}
}
