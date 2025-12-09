class bsearch
{
bsearch(int x)
{
  int i,a[],f,l,m;
  a=new int[]{1,2,3,4,5};
  f=0;
  l=4;
  m=((l+f)/2);
  while(f<=l)
  {
    if(a[m]<x)
     {
       f=m+1;
     }
     else if(a[m]==x)
     {
        System.out.print("Item found");
         break;
     }
     else
     l=m-1;
     m=(f+l)/2;
  }
    if(f>l)
    {
        System.out.print("Item not found");
    }
 }
public static void main(String args[])
{
bsearch b=new bsearch(7);
}
}

