package java_basic_programs;

public class FactorialExample {
	
	public static void main(String[] args)
	{
		int fact=1;
		int number = 3;
		
		for(int i=1;i<=number;i++)
		{
			fact*=i;
			
		}
		
		System.out.println("Factorial of "+number+" is "+fact);
	}
	

}
