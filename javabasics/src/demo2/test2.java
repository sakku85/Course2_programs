package demo2;

import demo.cal2;

public class test2 {
	 public String fullname(String firstname)
	 {
		 String name= firstname+ " krishna";
		 return name;
	 }
	public static void main(String[] args) {
		//creating object of container class 
		test2 a=new test2();
		String fname=a.fullname("sakunthala");
		System.out.println(fname);
	}

}
