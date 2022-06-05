package collectionsDemo;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList<String> cities=new ArrayList<String>();//ArrayList is Predefined Class in Java
		cities.add("Hyd");
		cities.add("chennai");
		cities.add("delhi");
		cities.add("vizag");
		
		for(String a: cities)//retrieve all values in cities object
		{
			System.out.println(a);
		}
		System.out.println(cities.get(2));
		System.out.println(cities.indexOf("Hyd"));
		System.out.println(cities.size());
		
		
		
 	}

}
