class finalize
{
 public void finalize()
 {
  System.out.print("BASUDA");
 }
 public static void main(String args[])
 {
  finalize t=new finalize();
  finalize t1=new finalize();
 }
}