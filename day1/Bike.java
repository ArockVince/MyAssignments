package week1.day1;

public class Bike 
{
	public void applyBreak()
	{
		System.out.println("Bike Applied break");
    }
	public void soundHorn()
	{
		System.out.println("Bike sound horn");
    }
	
	public static void main(String[] args) {
	
		Car objcar =new Car();
		objcar.applyBreak();
		objcar.soundHorn();
		
		Bike objbike = new Bike();
		objbike.applyBreak();
		objbike.soundHorn();
		
		
	}
}
