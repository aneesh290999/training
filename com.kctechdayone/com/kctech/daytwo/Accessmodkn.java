package com.kctech.daytwo;

public class Accessmodkn {
	
	public void method()
	{
		System.out.println("I'm a public method you can access me anywhere");
	}
	
	protected void methodtwo()
	{
	  System.out.println("accessed all over except from non subclass in a different package ");
	}
	
	@SuppressWarnings("unused")
	private void methodthree()
	{
		System.out.println("Only be accessed in the same class");
	}

    void methodfour()
	{
		System.out.println("Only can be accessed in the same package");
	}
	public static void main(String[] args) {
	Accessmodkn obj = new Accessmodkn();
	System.out.println();
	obj.methodthree();
	

	}

}
