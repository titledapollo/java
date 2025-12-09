class chaining{
	int x; double y;
	chaining()
	{
		System.out.println("Hello World.");
	}
	chaining(int a){
		this();
		this.x=a;
		
	}
	chaining(double a){
		this(10);
		this.y=a;
	}
	
	void show(){
		System.out.println("x= "+this.x);
		System.out.println("x= "+this.y);
	}
	public static void main(String args[]){
		chaining T=new chaining(10.5);
		T.show();
	}
}