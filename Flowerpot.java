import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Flowerpot {
	private static int minw;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		minw = sc.nextInt();
		int[][] raindrops = new int[n][2];
		for (int i=0; i<n; i++)
		{
			for (int j=0; j<2; j++)
			{
				raindrops[i][j] = sc.nextInt();
			}
		}
		Arrays.sort(raindrops, new Comparator<int[]>() {
		    public int compare(int[] a, int[] b) {
		        return Integer.compare(a[0], b[0]);
		    }
		});
		int w = Integer.MAX_VALUE;
		for (int i=0; i<n; i++) 
		{
			for (int j=i; j<n; j++)
			{
				if (Math.abs(raindrops[j][1]-raindrops[i][1])>=minw)
				{
					w = Math.min(w, (Math.abs(raindrops[j][0]-raindrops[i][0])));
					break;
				}
			}
		}
		if (w>=Integer.MAX_VALUE)
			System.out.println(-1);
		else
			System.out.println(w);
	}
}
