package constructordemo;

public class Car {

	private String colour;
	private String enginetype;
	
	public void print(){
		System.out.println("car colour is "+ colour + " engine type is "+ enginetype);
		
	}
	//constructor should not have return type
	//constructor is ussed to initialise the variables
	//constructor name should be same as class name
	
	public Car(String col,String engtype)//parameterised constructor
	{
		colour=col;
		enginetype=engtype;
	}
	public Car()
	{
		colour="white";
		
		enginetype="petrol";
	}
	public static void main(String[] args) {
		
		Car mercedes=new Car("silver","petrol");
		Car audi =new Car("bllack","diesel");
		Car Bmw=new Car();
		Bmw.print();
		mercedes.print();
		audi.print();
		
		
	}
}
