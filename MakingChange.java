import java.util.Arrays;
import java.util.Scanner;

public class MakingChange {
	private static int c;
	private static int n;
	private static int[] coins;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		c = sc.nextInt();
		n = sc.nextInt();
		coins = new int[n];
		for (int i=0; i<n; i++)
		{
			coins[i] = sc.nextInt();
		}
		Arrays.sort(coins);
		int counter=0;
		for(int i=n-1; i>=0; i--)
		{
			while (c-coins[i]>=0)
			{
				c-=coins[i];
				counter++;
			}
		}
		System.out.println(counter);
	}
}
