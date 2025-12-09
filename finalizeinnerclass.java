class test
{
public void finalize(){
System.out.println("Object ends");
}
public static void main(String args[])
{
test t =new test();
t.finalize();
test t1= new test();
t1.finalize();
}
}