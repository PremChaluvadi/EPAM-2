import java.io.*;
import java.util.Scanner;
class Vijay
{
public static void main(String args[])
	{
	int p=0,ne=0,t=0;
	float avg,tot=0;
	Scanner s=new Scanner(System.in);
	while(true)
	{
		int n;
		System.out.print("Enter a value:");
		n=s.nextInt();
	if(n==0)
	break;
	else
	{
	if(n!=0)
	t=t+n;
	if(n>0)
	p++;
	else if(n<0)
	ne++;
	}
	}
	tot=t;
	avg=tot/(p+ne);
	System.out.println("the total is:"+t);
	System.out.println("the avg is:"+avg);
	System.out.println("total positive numbers is:"+p);
	System.out.println("total negative numbers is:"+ne);
	}
}	