import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Allowance {
	private static int n;
	private static int c;
	private static int[][] coins;
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		c = sc.nextInt();
		coins = new int[n][2];
		for (int i=0; i<n; i++)
			for (int j=0; j<2; j++)
				coins[i][j] = sc.nextInt();
		
		Arrays.sort(coins, new Comparator<int[]>() {
		    public int compare(int[] a, int[] b) {
		        return Integer.compare(b[0], a[0]);
		    }
		});
		
		
	}
}
