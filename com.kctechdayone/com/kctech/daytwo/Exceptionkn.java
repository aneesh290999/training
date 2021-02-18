package com.kctech.daytwo;

public class Exceptionkn {

	public static void main(String[] args) {
		int a=200;

		int b=5;

		int c=2;

		int d=0;

		try {

		c = a/b;

		}

		catch(Exception e)

		{

			System.out.println("something wrong here");

		} finally {

			System.out.println(c);

		}
	}
}
