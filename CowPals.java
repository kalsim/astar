import java.util.ArrayList;
import java.util.Scanner;

public class CowPals {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int y = 0;
		boolean bool = true;
		while (bool)
		{
			int sum1 = sumDivisors(s);
			int sum2 = sumDivisors(sum1);
			if (s==sum2 && s!=sum1)
			{
				bool = false;
				y = sum1;
			}
			else
				s++;
		}
		System.out.println(s + " " + y);
	}
	public static int sumDivisors(int x)
	{
		int sum = 1;
		int i=2;
		while (i<x)
		{
			if (x%i==0)
				sum+=i;
			i++;
		}
		return sum;
	}
}
