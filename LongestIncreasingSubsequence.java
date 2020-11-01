import java.util.Scanner;

public class LongestIncreasingSubsequence {
	private static int[] a;
	private static int[] lis;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		a = new int[n];
		lis = new int[n];
		int max = 0;
		for (int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		
		lis[0]=1;
		for (int i=1; i<n; i++)
		{
			for (int j=i-1; j>0; j--)
			{
				if (a[j]<a[i])
					lis[i]=Math.max(lis[i],  lis[j]+1);
			}
		}
		for (int i=0; i<n; i++)
		{
			if (lis[i]>lis[max])
				max = i;
		}
		System.out.println(lis[max]+1);
	}
}
