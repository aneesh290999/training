package com.kctech.daytwo;

public class Stringbuf {

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer("Hello ");
		sb1.append("Aneesh");
		System.out.println(sb1);
		
			sb1.deleteCharAt(2);
			{
			System.out.println(sb1);
		}
		
			sb1.insert(1, "Java");
			{
			System.out.println(sb1);
		}
	}

}
