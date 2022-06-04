package demo;

public class Calculator 
{
	//defining add() method
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public void subtract(int a,int b)
	{
		System.out.println(a-b);
	}
	public void multiply(int a,int b)
	{
		System.out.println(a*b);
	}
	public void divide(int a,int b)
	{
		System.out.println(a/b);
	}
	public static void main(String[] args) 
	{
	   //Class object=new Class()
		
		Calculator basicCal=new Calculator();
		 
		//object.method()
		basicCal.add(30,20);//calling/invoking the add() method
		basicCal.subtract(50, 10);
		basicCal.multiply(20, 5);
		basicCal.divide(2000, 20);
		
	}

}
