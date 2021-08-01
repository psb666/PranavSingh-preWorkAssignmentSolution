import java.util.Scanner;

public class Fibonacci {
		public static void main(String[] args){
		int first = 0;
		int second = 1;
		Scanner x=new Scanner(System.in);

		System.out.println("How many numbers you want to print?");
		int n=x.nextInt();
		System.out.print(first + " " + second + " ");

		int next;

		for (int i=2;i<n;i++)
			{
				next = first + second;

				System.out.print(next + " ");

				first = second;
				second = next;
			}
		}
}