package com.kctechdaythree;
import java.io.File;
import java.io.IOException;


public class Filecreatekn {

	public static void main(String[] args) {
		File objfile= new File("/Users/kctech_mr2/Desktop/FileFolder/File1.txt");
		boolean present = objfile.exists();
		  if(present==false)
			  try
		     {
		    	 boolean created = objfile.createNewFile();
		    	 System.out.println("File Created :" + created);
		     }catch(IOException e)
		  {
		    		 System.out.println("already exits");
		  e.printStackTrace();
		  }
		  

	}

}
