package loops;

import java.util.Scanner;

public class whileloop {
	public static void main(String[] args) {
		int pinInDb=1234;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the pin");
		//Scanner sc=new Scanner(System.in);
		int pin=sc.nextInt();
		int i=1;
	if(pin!=pinInDb && i<4) 
	{
  	while(pin!=pinInDb ) 
  	{	     System.out.println("plese enter correct pin");
  	   pin=sc.nextInt();
  	  i++;
  	}
	}
  	else
  	System.out.println("welcome");
  	}

}
}
