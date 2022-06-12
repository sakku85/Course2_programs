package AreasOfDifferentShapes;

import java.util.ArrayList;

public class Area {
	String sh;
	
	/*Area()
	{
		//System.out.println("area of");
	}
	Area(float h,float b)
	{
	System.out.println("The area of the triangle is:");
	}*/
	public void PrintArea()
	{
		//Area b= new a();
		
	}
	
	
	public static  void main(String[] args) {
		
		//Area a=new Area();
		TriangleArea t=new TriangleArea(12,5);
		SqareArea s=new SqareArea(5);
		Circle c=new Circle(8);
		ArrayList<Area> ar=new ArrayList<Area>();
		ar.add(t);
		ar.add(s);
		ar.add(c);
		for(Area f:ar)
			f.PrintArea(f);
			
		
         
	//System.out.println(f);
			//t.println(f)System.ou;
	
		
		
		
		
	}
}
