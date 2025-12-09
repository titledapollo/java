import java.util.Scanner;
class scanner
{
int sum,num1,num2;
scanner(int a,int b)
{
num1=a;
num2=b;
}
void add()
{
sum=num1+num2;
}
void display()
{
System.out.print("addition is="+sum);
}
public static void main(String args[]) 
{
int p,q;
Scanner s = new Scanner(System.in);
p=s.nextInt();
q=s.nextInt();
scanner t = new scanner(p,q);
t.add();
t.display();
}
}
