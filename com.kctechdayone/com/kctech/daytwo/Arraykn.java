package com.kctech.daytwo;

public class Arraykn {

	public static void main(String[] args) {
		int ar []=new int[5];
		ar[0]=1;
		ar[1]=2;
		ar[2]=3;
		ar[3]=4;
		ar[4]=5;
		
		String ar2[]= {"Dhoni","Virat","Raina"};
		
		for(int i=0 ; i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		
		for(String s: ar2)
		{
			System.out.println(s);
		}

	}

}
