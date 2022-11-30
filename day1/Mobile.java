package week1.day1;

public class Mobile {
	
	public void sendMsg()
	{
		boolean isFullCharged  = true;
		int mobileCost  = 20000 ;
	    System.out.println("This is my mobile, Fully Charged " + isFullCharged + ", Mobile Cost " + mobileCost );
			
	}
	public void makeCall()
	{
		String mobileModel  = "OPPO F7";
	    float mobileWeight  = 500.52f;
		System.out.println("This is my mobile, Mobile Model " + mobileModel + ",Mobile Weight " + mobileWeight );
	}
	
	 public static void main(String[] args)
	 {
		 Mobile objMobile = new Mobile();
		 objMobile.sendMsg();
		 objMobile.makeCall();
	}
	 
}
