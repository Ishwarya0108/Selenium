package week1.day2;

public class Homeassignment_Isprime {

	public static void main(String[] args) {
		
		int num = 4;
		int count = 0;
		
		
		for(int i=1; i<=num; i++ )
		{
			if (num%i==0)
				count++;
		}
		
		{
			if (count==2)
			{
				System.out.println("The prime number is:"+num);
			}
			else
			{
			System.out.println("It is not a prime number:"+num);
			}
}}}
	
