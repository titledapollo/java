
class Test extends Thread{
public void run()
{
for(int i=0;i<5;i++)
{
try{
Thread.sleep(500);
}
catch(InterruptedException e)
{
System.out.println(e);
}
System.out.println(i);
}}
public static void main(String args[])
{
Test t1= new Test();
Test t2=new Test();
Test t3=new Test();
t1.start();
try{
t2.join();
}
catch(Exception e)
{
System.out.println(e);
}
t2.start();
t3.start();
}
}

