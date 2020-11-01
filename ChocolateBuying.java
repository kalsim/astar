import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ChocolateBuying {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long b = sc.nextLong();
		int[][] chocolate = new int[n][2];
		for(int i=0; i<n; i++)
		{
			chocolate[i][0] = sc.nextInt();
			chocolate[i][1] = sc.nextInt();
		}
		Arrays.sort(chocolate, new Comparator<int[]>() {
		    public int compare(int[] a, int[] b) {
		        return a[0]-b[0];
		    }
		});
		long ans = 0;
		for (int i=0; i<n; i++)
		{
			long temp = Math.min(chocolate[i][1], b/chocolate[i][0]);
			b-=chocolate[i][0]*temp;
			ans+=temp;
		}
		System.out.println(ans);
	}
}
