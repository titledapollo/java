package pkg;
public class pub
{
public void show()
{
System.out.println("s.k.f.g.i publicers");
}

}


package pkg1;
import pkg.pub;
public class book{
public void show(){
System.out.println("JAVA");
pub p=new pub();
p.show();
}
}



import pkg1.book;
class import_show{
public static void main(String args[]){
book b=new book();
b.show();
}
}