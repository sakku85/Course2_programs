package InheritanceDemo;

public class B extends D{
	
	public void month() {
		
		System.out.println("This is month is May");
	}
	public static void main(String[] args) {
		B b=new B();
		b.date();
		b.month();
		b.nextYear();
		
		
	}

}
