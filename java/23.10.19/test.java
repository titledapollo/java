class Test implements Runnable
{
public void run()
{
System.out.println("running");
}
public static void main(String args[])
{
 Test t=new Test();
 Thread m=new Thread(t);
 m.start();
 }
 }