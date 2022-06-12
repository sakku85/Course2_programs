package ExceptionHandling;

import java.util.Scanner;

public class Calculator {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		try
		{
		System.out.println("enter a number");
		
		int num1=sc.nextInt();
		
		System.out.println("enter a number");
		int num2=sc.nextInt();
		
		System.out.println(num1/num2);
		}
		
		catch(Exception e)
		{
			System.out.println("please enter valid data");
		}
	}
}
