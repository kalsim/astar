import java.util.Scanner;

public class BullsAndCows {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/**
		 * f[n] = # of ways with n in a row
		 * f[n] = f[n-1] + f[n-k-1]
		 * f[1] = 2
		 * f[2] = 3
		 * f[k] = k+1
		 */
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] x = new int[n];
		for (int i=0; i<=k; i++)
			x[i]= 2+i;
		for (int j=k+1; j<n; j++)
		{
			x[j] = (x[j-1] + x[j-k-1])%5000011;
		}
		System.out.println(x[n-1]);
	}
}
