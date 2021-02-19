package com.kctechdaythree;
import java.util.*;

public class Hashmapkn {


	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		 
		HashMap hm = new HashMap();
		
		hm.put(108, "Aneesh,Male");
		hm.put(102,"Bala,Male");
		hm.put(103,"Guru,Male");
		hm.put(104,"Deepak,Male"); // Duplicate not allowed
		hm.put(104,"Deepak");
		
		
		Set myset = hm.entrySet();
		
		
		Iterator i = myset.iterator();
		 
		while(i.hasNext())
		{
		
		Map.Entry obj = (Map.Entry) i.next();
		 System.out.println(obj.getKey() + ":" + obj.getValue());
		 		 
		}
     
	}

}
