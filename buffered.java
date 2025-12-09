import java.io.*;
class buffered
{
 int sum,num1,num2;
 buffered(int a,int b)
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
  System.out.println("Result="+sum);
 }
 public static void main(String[]args)throws IOException
 {
  int a,c;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  a=Integer.parseInt(br.readLine());
  c=Integer.parseInt(br.readLine());
  buffered b=new buffered(a,c);
  b.add();
  b.display();
 }
}