package com.kctech.dayone;

import java.util.Scanner;

public class Ifa {

	public static void main(String[] args) {
		int pen=10;
		int inkpen=20;
		int cost;
		
		   {
			 System.out.println("enter the amount :");
			}
	Scanner input = new Scanner(System.in);
		cost= input.nextInt();
		
		if(cost>inkpen)
		{
			System.out.println("you can by the ink pen");
		}
	
		else if(cost>pen)
		{
		 System.out.println("you can by the pen");
		}
		else
		{
			System.out.println("you can't by it");
		
		}
		
		
			
		
			

	}

}
