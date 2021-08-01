import java.util.Scanner;

public class PrimeNum
{
	public static void main(String[] args)
	{

	Scanner s=new Scanner(System.in);
	
	System.out.println("Enter your number:");
	int x=s.nextInt();
	int temp=0;
	for(int i=2;i<=x-1;i++)
	{
		if (x%i==0)
			{
				temp=temp+1;
			}
	}
	if (temp==0)
	{
		System.out.println("Number is a Prime number");
	}
	else
	{
		System.out.println("Number is not a Prime number");
		}
	}
} 