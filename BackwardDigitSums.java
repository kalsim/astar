import java.util.Scanner;

public class BackwardDigitSums {
	public static int[][] urmom;
	public static int[] mark;
	public static int[] answer;
	public static int sum;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		sum = sc.nextInt();
		urmom = new int[10][10];
		for (int i=0; i<10; i++)
		{
			for (int j=0; j<10; j++)
			{
				if (i==0 || j==0)
					urmom[i][j] = 1;
				else
					urmom[i][j] = urmom[i-1][j]+urmom[i-1][j-1];
			}
		}
		mark = new int[n+1];
		answer = new int[n];
		int[] x = generatePermutations(0);
		for (int i=0; i<x.length; i++)
			System.out.print(x[i] + " "); 
	}
	public static int findSum(int[] lol)
	{
		int s = 0;
		for (int i=0; i<lol.length; i++)
		{
			s+= lol[i]*urmom[lol.length-1][i];
		}
		return s;
	}
	public static int[] generatePermutations(int pos)
	{
		if (pos>=answer.length)
		{
			if (findSum(answer)==sum)
				return answer;
		}
		else
		{
			for (int i=1; i<=answer.length; i++)
			{
				if (mark[i]==0)
				{
					answer[pos]=i;
					mark[i]++;
					generatePermutations(pos+1);
					mark[i]--;
				}
			}
		}
		return answer;
	}
}
