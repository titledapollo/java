class complex
{
int real,img;
complex(int a,int b)
{
real=a;
img=b;
}
void sum(complex x)
{
real=real+x.real;
img=img+x.img;
System.out.println("complex number addition is-->"+real+"+"+img+"i");
}
void sub(complex x)
{
real=real-x.real;
img=img-x.img;
System.out.println("complex number subtraction is-->"+real+"+"+img+"i");
}
 public static void main(String args[])
{
complex c1=new complex(10,12);
complex c2=new complex(50,90);
c1.sum(c2);
c1.sub(c2);
}
}

