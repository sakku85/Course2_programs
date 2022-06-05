package collectionsDemo;

import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		TreeSet<String> cities=new TreeSet<String>();
		
		cities.add("Hyd");
		cities.add("chennai");
		cities.add("delhi");
		cities.add("vizag");
		
		for(String a: cities)//retrieve all values in cities object
		{
			System.out.println(a);
		}
	//	System.out.println(cities.get(2));
		//System.out.println(cities.indexOf("Hyd"));
		System.out.println(cities.size());
		
		
		
 	}

}

	


