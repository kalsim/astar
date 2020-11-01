import java.util.Scanner;

public class Moocast {
	private static int[][] cows;
	private static int[] parent;
	private static int[] size;
	private static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		cows = new int[n][2];
		for (int i=0; i<n; i++)
			for (int j=0; j<2; j++)
				cows[i][j] = sc.nextInt();
		parent = new int[n];
		size = new int[n];
		for (int i=0; i<n; i++)
		{
			parent[i]=i;
			size[i]=1;
		}
		while (true)
		{
			
		}
	}
}
