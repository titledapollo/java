class tesst {
 int a,b,c;
 tesst()
 {
 b=0;a=10;}
 
 void divide(){
 try{
 c=a/b;
 }
 catch (ArithmeticException e)
 {
 System.out.println("an exception occured"+ e);
 }
 }
 public static void main(String args[])
 {
tesst t=new tesst();
     t.divide();
}
}