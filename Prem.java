import java.io.*;
import java.util.Scanner;
class Prem
{
public static void main(String args[])
	{
	byte a;
	int b;
	float c;
	double d;
	String e;
	Scanner s=new Scanner(System.in);
	System.out.print("Enter a byte value ");
	a=s.nextByte();
	System.out.println("Entered byte value is "+a);
	System.out.print("Enter a integer value ");
	b=s.nextInt();
	System.out.println("Entered integer value is "+b);
	System.out.print("Enter a float value ");
	c=s.nextFloat();
	System.out.println("Entered float value is "+c);
	System.out.print("Enter a double value ");
	d=s.nextDouble();
	System.out.println("Entered double value is "+d);
	s.nextLine();
	System.out.print("Enter a string ");
	e=s.nextLine();
	System.out.println("Entered string is "+e);
	}
}