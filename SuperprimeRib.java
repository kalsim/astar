import java.util.Scanner;
public class SuperprimeRib {
	public static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		f(0, 0);
	}
	public static void f(int x, int num)
	{
		if (x>=n)
		{
			System.out.println(num);
			return;
		}
		for (int i = 1; i<=9; i++)
		{
			if (isPrime(10*num + i))
				f(x+1, 10*num+i);
		}
	}
	public static boolean isPrime(int x)
	{
		if (x==1)
			return false;
		for (int i=2; i<=Math.sqrt(x); i++)
			if (x%i==0)
				return false;
		return true;
	}
}

