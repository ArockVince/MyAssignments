package week1.day2;

public class Fibonacciseries {
	public static void main(String[] args)
	{
		int n =8;
		int firstnum=0,secondnum =1, sum;
		
		for(int i=0;i<n;i++)
		{
			if(i==0)
			{
				System.out.println(firstnum);	
			}
			else
			{
			sum=firstnum+secondnum;
			firstnum=secondnum;
			secondnum=sum;
			System.out.println(sum);
			}
	    }
	}

}
