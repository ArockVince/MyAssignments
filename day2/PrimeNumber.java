package week1.day2;

public class PrimeNumber
{
	
	public static void main(String[] args)
    {
		int num = 13;
		
		boolean isPrime = false;
		
	for(int i=2;i<num;i++)
	{
		if(num%i==0)
		{
			isPrime = true;
			break;
		}
		
	}
	
	if(isPrime == false)
	{
		System.out.println("its a prime number");
		
	}
	else
	{
		System.out.println("its not a prime number");
		
	}
    }
}
