import java.util.*;

class A
{
   private int a;
   protected int b;
   int c;
   void display()
  {  System.out.println(a+" "+b+" "+c);}
}
  
class B extends A

{
   int d;
   void display()
{  System.out.println(a+" "+b+" "+c+" "+d);}
}

class C
{
   void display()
{    System.out.println(a+" "+b+" "+c);
     A a1=new A();
    System.out.println(a1.a+a1.b+a1.c);
     B b1= new B();
   System.out.println(b1.a+b1.b+b1.c+b1.d);
}
}
 class prodemo
{
  public static void main(String args[])
{
    A a2=new A();
    System.out.println(a2.a+a2.b+a2.c);;
   B b2 = new B();
   System.out.println(b2.a+b2.b+b2.c+b2.d);
}
}


  
