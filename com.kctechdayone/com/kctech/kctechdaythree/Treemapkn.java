package com.kctechdaythree;
import java.util.*;

public class Treemapkn {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		 
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		
		tm.put(104,"Aneesh,Male");
		tm.put(102,"Bala,Male");
		tm.put(103,"Guru,Male");
		tm.put(105,"Deepak,Male"); // Duplicate not allowed
		tm.put(105,"Deepak");   //last value will be taken  
		
		
		Set myset = tm.entrySet();
		
		
		Iterator t = myset.iterator();
		 
		while(t.hasNext())
		{
		
		Map.Entry obj = (Map.Entry) t.next();
		 System.out.println(obj.getKey() + ":"  + obj.getValue());
		 
		}
 
	}
		
	}


