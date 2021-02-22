package com.kctechdaythree;

import java.util.HashSet;
import java.util.Set;

public class Comparekn {
	  String Name;
	  int id;
	  

	public Comparekn(String string, int i) {
		this.Name = string;
		this.id = i;
		
		
	}


	public static void main(String[] args) {
		 Comparekn emp1 = new Comparekn("Aneesh",101);
		 Comparekn emp2 = new Comparekn("Bala",101);
		  
		 Set employees = new HashSet();
		 employees.add(emp1);
		 employees.add(emp2);
		 System.out.println(employees);

	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + id;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		
		Comparekn other = (Comparekn) obj;
		
		if (id!= other.id)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Name=" + Name + ", id=" + id;
	}

}
