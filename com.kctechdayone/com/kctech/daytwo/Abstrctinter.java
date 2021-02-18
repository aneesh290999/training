package com.kctech.daytwo;
interface Bank1{
	 int getRateofInterest();
}
class HDFC implements Bank1
{
	public int getRateofInterest() 
	{
		return 8;
		};
}
class ICICI implements Bank1
{
	public int getRateofInterest()
	{
		return 9;
		}
	
}
public class Abstrctinter {

	public static void main(String[] args) {
		Bank1 b;
		b = new ICICI();
		System.out.println("Rate of Interest is : "+b.getRateofInterest()+"%");

	}

}
