package com.kctech.dayone;

import java.util.Scanner;

public class switcha {

	public static void main(String[] args) {
		int number =10;
		String name;
		Scanner input = new Scanner(System.in);
		name = input.nextLine();
		switch (name) {
		case "Aneesh":
			System.out.println("Hi," +name);
			break;
		case "Vignesh":
			System.out.println("Hi," +name);
			break;
		case "Bala":
			System.out.println("Hi," +name);
			break;
		case "Guru":
			System.out.println("Hi," +name);
			break;
			default:
				System.out.println("your name is not here");
		}
	}

}
