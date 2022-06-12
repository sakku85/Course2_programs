package AreasOfDifferentShapes;


public class Circle extends Area {
	float pi=(float) 3.14;
	float r;
	Circle(float r)
	{
		this.r=r;
	}
	public void PrintArea() {
		float a=pi*r*r;
		System.out.println("Area of triangle is : "+a);
	}

}
