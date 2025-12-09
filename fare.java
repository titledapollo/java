class fare
{
int distance,rup;
fare(int distance)
{
this.distance=distance;
}
void calculate()
{
if(this.distance<=4)
{
System.out.println("the fare will be rs 50");
}
else if(this.distance>4&&this.distance<=10)
{
rup=50+((this.distance-4)*7);
}
else if (this.distance>10&& this.distance<=20)
{
rup=50+42+((this.distance-10)*8);
}
else{
rup=50+42+80+((this.distance-20)*10);
}
System.out.println(rup);
}
public static void main (String args[])
{
fare x = new fare(8);
x.calculate();
}
}
