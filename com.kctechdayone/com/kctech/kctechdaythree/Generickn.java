package com.kctechdaythree;

import java.util.ArrayList;

public class Generickn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> gen= new ArrayList<String>();
        gen.add("Aneesh");
        gen.add("Bala");
        gen.add("Guru");
        Generickn mygen = new Generickn();
        mygen.add(gen);
	}
 private void add(ArrayList<String> gen)
 {
   for(String s : gen)
   {
	   System.out.println(s);
   }
}
}