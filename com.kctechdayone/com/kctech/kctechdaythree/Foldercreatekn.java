package com.kctechdaythree;
import java.io.File;
public class Foldercreatekn {

	public static void main(String[] args) {
     File objfile = new File("/Users/kctech_mr2/Desktop/FileFolder");
     boolean present = objfile.exists();
     if(present==false)
     {
    	 objfile.mkdir();
    	 present = objfile.exists();
    	 System.out.println("Folder Present :" + present);
     }

	}

}
