package java_basic_programs;

public class PrimeExample {
	
	public static void main(String[] args)
	{
		boolean flag =false;
		int num = 3;
	
		if(num==0||num==1)
		{
			System.out.println(num+" is not a prime number");
		}
		
		else
		{
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					System.out.println(num+" is not a prime number");
					flag=true;
					break;
				}
			}
		}
		
		if(flag==false)
		{
			System.out.println(num+" is prime number");
		}
	
	}

}
