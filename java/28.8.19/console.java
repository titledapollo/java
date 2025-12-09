import java.io.Console;
class console
{
int sum,num1,num2;
console(int a,int b)
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
console t = new console(p,q);
t.add();
t.display();
}
}