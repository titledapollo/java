class bat
{
 double avg;
 void average(int a,int b,int c)
 {
  avg=((a+b+c)/3);
  System.out.println("Batting average="+avg);
 }
 
 public static void main(String args[])
 {
 bat b=new bat();
 bowl c=new bowl();
 b.average(30,40,50);
 c.average(10,20,30);
 }
}
class bowl
 {
  double avg;
 void average(int a,int b,int c)
 {
  avg=((a+b+c)/3);
  System.out.println("Bowling average="+avg);
 }
 