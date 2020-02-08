package com.epam.assignment1.premchaluvadi;
import java.util.*;
public class Func {
	public static void main( String[] args ) {
    	Scanner scanner=new Scanner(System.in);
    	System.out.print("Enter the number of sweets u like : ");
    	int input=scanner.nextInt();
    	int i;
    	int add=0;
    	for(i=0;i<input;i++) {
    		System.out.print("Enter the name of tasty sweet u like : ");
    		String sweet=scanner.next();
    	Func1 s;
    		if(sweet.equals("GulabJam"))
    		{
    			s=new Func2();
    		}
    		else if(sweet.equals("Sunnunda"))
    		{
    			s=new Func3();
    		}
    		else if(sweet.equals("Barfi"))
    		{
    			s=new Func4();
    		}
    		else if(sweet.equals("Halwa"))
    		{
    			s=new Func5();
    		}
    		else if(sweet.equals("BadamKaju"))
    		{
    			s=new Func6();
    		}
    		else
    		{
    			System.out.println("Sorry,We don't have such sweet ");
    			i--;
    			continue;
    		}
    		System.out.print("Sir,How many kg's do u want: ");
    		int kilogram=scanner.nextInt();
    		add+=s.getprice()*kilogram;
    	}
    	System.out.println("total amount u need to pay is : "+add);
    }
}