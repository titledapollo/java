
class command{
int sum,num1,num2;
command(int a,int b){
	num1=a;
	num2=b;	
}
void sum(){
	sum=num1+num2;
	System.out.println("Addition is:"+sum);
}
public static void main(String[]args){
	int x,y;
	x=Integer.parseInt(args[0]);
	y=Integer.parseInt(args[1]);
	command t=new command(x,y);
	t.sum();
}
}
