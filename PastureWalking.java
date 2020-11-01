import java.util.Scanner;

public class PastureWalking {
	private static int n;
	private static int q;
	private static int[][] adj;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		q = sc.nextInt();
		adj = new int[n+1][n+1];
		for (int i=1; i<n; i++)
		{
			int o = sc.nextInt();
			int p = sc.nextInt();
			int l = sc.nextInt();
			adj[o][p] = l;
			adj[p][o] = l;
		}
		
	}
}
