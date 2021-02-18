package com.kctech.daytwo;

class varadd
{
	public int add(int...a)//varargs using here
	{
		int sum=0;
		for(int b:a)
		{
		sum=sum+b;

		}
		return sum;
	}
	
	
}
public class Varargskn {

	public static void main(String[] args) {
		
  varadd obj=new varadd();
  System.out.println(obj.add(4,20,15,7));
	}

}
