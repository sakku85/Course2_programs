package collectionsDemo;

import java.util.HashSet;

public class HashSetDemo {

	
	public static void main(String[] args) {
		
		HashSet<String> cities=new HashSet<String>();
		cities.add("Hyd");
		cities.add("chennai");
		cities.add("delhi");
		cities.add("vizag");
		cities.add("Hyd");//will not allow duplicate values by hash set
		//stores items randomly in memory
		
		for(String a: cities)//retrieve all values in cities object
		{
			System.out.println(a);
		}
//		System.out.println(cities.get(2));
	//	System.out.println(cities.indexOf("Hyd"));
		System.out.println(cities.size());
		
		
		
 	}

}



