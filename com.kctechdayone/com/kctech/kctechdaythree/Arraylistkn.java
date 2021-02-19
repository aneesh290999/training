package com.kctechdaythree;
import java .util.ArrayList;
public class Arraylistkn {

	public static void main(String[] args) {

ArrayList<String> mystring = new ArrayList<String>();
  mystring.add("Bullet");
  mystring.add("Jawa");
  mystring.add("R15");
  mystring.set(1,"Honda");       //set the value Honda in array 1
  mystring.remove(0);            //remove 0 the array here
   for(String n : mystring)
   {
	   System.out.println(n);
   }
	}

}
