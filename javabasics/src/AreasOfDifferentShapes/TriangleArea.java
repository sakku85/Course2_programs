package AreasOfDifferentShapes;

public class TriangleArea extends Area{
	private
	float ht,bs;
	TriangleArea()
	{
		
	}
	public TriangleArea(float h,float b)
	{
		ht=h;
		bs=b;
	}
	public void PrintArea() {
	
		float area=(float) (0.5*ht*bs);
	    System.out.println("Area of Triangle is : "+area);
		//return area;
	}
	
	
//	public static void main(String[] args) {
		
	

//Area a=new Area();
//TriangleArea b=new TriangleArea();

//a.print();
//}
}

