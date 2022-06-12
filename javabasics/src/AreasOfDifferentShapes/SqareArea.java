package AreasOfDifferentShapes;

public class SqareArea extends Area{
 
	private
	float a;
	SqareArea(float ab)
	{
		a=ab;
	}
	public void PrintArea() {
	
		float area=a*a;
		System.out.println("Area of Sqare is : "+ area);
		//return area;
	}
}
