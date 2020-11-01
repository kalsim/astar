import java.util.Scanner;

public class Ruler {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		line(x);
		rule(x-1);
		line(x);
	}
	public static void line(int n)
	{
		for (int i=0; i<n; i++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	public static void rule(int n)
	{
		if (n == 1)
		{
			line(1);
		}
		else
		{
			rule(n-1);
			line(n);
			rule(n-1);
		}
	}
}
