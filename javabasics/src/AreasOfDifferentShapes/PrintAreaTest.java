package AreasOfDifferentShapes;

import java.util.ArrayList;


public class PrintAreaTest {
	
	public void PrintAreaT(Area a)
	{
		a.PrintArea();
	}
	
	
	public static void main(String[] args) {
		
		Area t=new TriangleArea(12,5);
		Area s=new SqareArea(5);
		Area c=new Circle(8);
		ArrayList<Area> ar=new ArrayList<Area>();
		ar.add(t);
		ar.add(s);
		ar.add(c);
		PrintAreaTest ptr=new PrintAreaTest();
		for(Area f:ar)
			
			ptr.PrintAreaT(f);
			
		
	}

}
