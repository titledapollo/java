import java.io.*;
class Test{
int sum,num1,num2;
Test(int a,int b){
num1=a;
num2=b;	
}
void sum(){
sum=num1+num2;
System.out.println("Addition is:"+sum);
}
public static void main(String[]args) throws IOException{
int x,y;
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
x=Integer.parseInt(b.readLine());
y=Integer.parseInt(b.readLine());
Test t=new Test(x,y);
t.sum();
}
}  
