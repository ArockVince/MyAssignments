package week1.day2;

public class Palindrome {

	  
	public static void main(String[] args) {
		  
        int num =34343;
		
		String number = String.valueOf(num);
		
		String tempNumber = "";
		
		for (int i = number.length()-1; i>=0; i--)
		{
	      tempNumber = tempNumber + number.charAt(i);
	      
		
	   }
		
		int numReverse = Integer.parseInt(tempNumber);	
		
		if(num == numReverse )
		{
		
		System.out.println("Palindrome");
		}
		else
		{
	    System.out.println("Not Palindrome");
		}

	}
}