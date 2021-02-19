package com.kctechdaythree;
import java .io.FileWriter;
import java.io.IOException;

public class filewritekn {

	public static void main(String[] args) {
   try
   {
	   FileWriter mywrite = new FileWriter("/Users/kctech_mr2/Desktop/FileFolder/file1.txt");
	   mywrite.write("hello all welcome to file handling");
	   mywrite.close();
	  System.out.println("Succesfully writen ");
   }catch(IOException e)
   {
	   System.out.println("An error occured");
	   e.printStackTrace();
   }

	}

}
