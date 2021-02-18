package com.kctech.daytwo;

public class Stringbuild {

	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder("hi");
		sb.append("hello");
		{
		System.out.println(sb);
		}
		
		sb.insert(1,"java");
		{
		System.out.println(sb);
	}
		
	sb.reverse();
	{
	System.out.println(sb);
	}
}
}
