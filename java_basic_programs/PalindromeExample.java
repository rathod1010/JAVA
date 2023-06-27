package java_basic_programs;

public class PalindromeExample {
	
	public static void main(String[] args)
	{
		int num =1231;
		int sum=0;
		int temp;
		temp=num;
		
		while(num>0)
		{
			sum=sum*10+num%10;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println(temp+" is a palindrome number");
		}
		
		else
		{
			System.out.println(temp+" is not a palindrome number");
		}
	}

}
