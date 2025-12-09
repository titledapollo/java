class test1{
	void prints(){
		System.out.print(" My India");
	}
}
interface test{
	int a=10;
	public void show();
}
 class A extends test1 implements test {
public void show(){
		System.out.print("I love ");
	}
	
	public static void main(String args[]){
		test t =new A();
		t.show();
		A a= new A();
		a.prints();
	}
}