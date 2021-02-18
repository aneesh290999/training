package com.kctech.daytwo;
class Vechile
{
void Bike()
   {
	System.out.println("Bike Start");
   }
{
	System.out.println("Bike Stop");
}
}
class Car extends Vechile
{
void Car()
{
	System.out.println("Car Start");
}


}
public class Inheritance {

	public static void main(String[] args)
	{
		Car s = new Car();
		s.Bike();
        s.Car();		
		

	}

}
