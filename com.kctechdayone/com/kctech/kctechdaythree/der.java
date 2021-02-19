package com.kctechdaythree;
import java.io.*;
public class der implements Serializable
{
	int id;
	String name;

public der(int id,String name)
{
	this.id= id;
	this.name=name;
}
public  class Deserializationkn {

	public void main(String[] args) throws Exception
	{
    ObjectInputStream in = new ObjectInputStream
    		(new FileInputStream("/Users/kctech_mr2/Documents/demo.txt"));
    der d=(der)in.readObject();
    System.out.println(d.id+ " "+d.name);
    in.close();
	}

}
}
