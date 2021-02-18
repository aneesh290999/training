package com.kctech.daytwo;
class Banking
  {  
   int getRateOfInterest()
  {
	  return 0;
	}  
}  
  
class SBIMAIN extends Banking
   {  
    int getRateOfInterest()
  {
	return 8;
	}  
}  
  
class ICICIMAIN extends Banking
   {  
      int getRateOfInterest()
  {
	return 7;
  }  
}  
class AXISMAIN extends Banking
   {  
     int getRateOfInterest()
  {
	return 9;
	}  
}  
public class Polyoverridingkn {

	public static void main(String[] args) {
		SBIMAIN s=new SBIMAIN();  
		ICICIMAIN i=new ICICIMAIN();  
		AXISMAIN a=new AXISMAIN();  
		System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
		System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
		System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());  


	}

}
