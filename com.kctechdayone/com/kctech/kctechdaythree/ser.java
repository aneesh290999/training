package com.kctechdaythree;
import java.io.*;
public class ser implements java.io.Serializable
{
	int id;
	String name;

public ser(int id,String name)
{
	this.id= id;
	this.name=name;
}
public   class Serialization {

	public void main(String[] args) throws Exception
	{
		ser s = new ser(101,"Aneesh");
      FileOutputStream fout = new FileOutputStream("/Users/kctech_mr2/Documents/demo.txt");
      ObjectOutputStream out = new ObjectOutputStream(fout);

	 out.writeObject(s);
	 out.flush();
	 System.out.println("Success");


	}
}
}

