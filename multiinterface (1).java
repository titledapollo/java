interface test{
	int a=10;
	 public void show();
}
interface test1 extends test{
	void shows();
}
class test2 implements test1{
	public void show(){
		System.out.print("I love ");
	}
	public void shows(){
		System.out.print("My India");
	}
	
	public static void main(String args[]){
		test t =new test2();
		t.show();
		test1 a= new test2();
		a.shows();
	}
	
}