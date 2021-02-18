package com.kctech.daytwo;
class Bike 
{
	  public void bikeSound() {
	    System.out.println("The Exhaust makes a sound");
	  }
	}

	class Bullet extends Bike {
		
		
	  public void bikeSound() {
	    System.out.println("The Bullet Makes More Sound");
	  }
	}

	class R15 extends Bike
	{
		public void bikeSound()
		{
			System.out.println("R15 Makes Lesser Sound");
		}
	}
	

public class Polyoverloadkn {

	public static void main(String[] args) {
		
    Bike mybike = new Bike();
    Bullet mybullet=new Bullet();
    R15 myr15 = new R15();
    mybike.bikeSound();
    mybullet.bikeSound();
    myr15.bikeSound();
	}

}
