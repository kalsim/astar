import java.util.Scanner;

public class ReorderingCows {
	private static int[] A;
	private static int[] B;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		A = new int[l];
		B = new int[l];
		//LEARN HOW TO REVERSE INDEX
		for (int i=0; i<l; i++)
		{
			A[i]=sc.nextInt();
		}
		for (int i=0; i<l; i++)
		{
			B[i]=sc.nextInt();
		}
		int best = -1;
		int count = 0;
		for (int i=0; i<l; i++)
		{
			if (A[i]!=B[i])
			{
				best = Math.max(best, cycle(i));
				count++;
			}
		}
		System.out.println(count + " " + best);
	}
	public static int cycle(int i)
	{
		int counter = 0;
		int cow = A[i];
		A[i] = 0;
		while (cow!=0)
		{
			int temp = -1;
			for (int x=0; x<B.length; x++)
			{
				if (B[x]==cow)
					temp = x;
			}
			if (temp==-1)
				cow = 0;
			else
			{
				int t = A[temp];
				A[temp] = cow;
				cow = t;
				counter++;
			}
		}
		return counter;
	}
}
