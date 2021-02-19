package com.kctechdaythree;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
public class Setkn {

	public static void main(String[] args) {
	
     Set<String> myset = new HashSet<>();
     myset.add("Bullet");
     myset.add("Bullet");  //duplicate not allowed
     myset.add("Bullet");  //duplicate not allowed
     myset.add("R15");
     myset.add("Jawa");
      
     for(String i : myset)
     {
    	 System.out.println(i);
     }
      
     System.out.println();
      
     Set<Integer> treeset = new TreeSet<>(); //TreeSet will comes output in order and duplicates not allowed
     treeset.add(50);
     treeset.add(20);
     treeset.add(50);
     treeset.add(15);
     treeset.add(7);
     
     for(int n : treeset)
     {
    	 System.out.println(n);
     }
     
  }

	
	
	
	
	
}
