import java.io.*;
import java.util.Scanner;
class Demo
   {
   void disp(int a, int b)
   {
	if(a>=b)
	System.out.println(a+" is bigger than "+b);
	else
	System.out.println(b+" is bigger than "+a);
   }
   void disp(double a,double b)
   {
	if(a>=b)
	System.out.println(a+" is bigger than "+b);
	else
	System.out.println(b+" is bigger than "+a); 
   }
   void disp(double a, double b, double c)
   {
	if(a>=b&&a>=c)
	System.out.println(a+" is bigger than "+b+ " and "+c);
	else if(b>=a&&b>=c)
	System.out.println(b+" is bigger than "+a+ " and "+c);
	else
	System.out.println(c+" is bigger than "+a+ " and "+b);
   }
   }
class Maximum
{ 
   public static void main(String args[])
   {
	Demo obj= new Demo();
	Scanner s=new Scanner(System.in);
	int a,b;
	double c,d,e,f,g;
	a=s.nextInt();
	b=s.nextInt();
	c=s.nextDouble();
	d=s.nextDouble();
	e=s.nextDouble();
	f=s.nextDouble();
	g=s.nextDouble();
	obj.disp(a,b);
	obj.disp(c,d);
	obj.disp(e,f,g);
   }
}