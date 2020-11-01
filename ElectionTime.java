import java.util.Arrays;
import java.util.Scanner;

public class ElectionTime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cows = sc.nextInt();
		int f = sc.nextInt();
		int[] first = new int[cows];
		int[] second = new int[cows];
		for (int i =0; i< cows; i++)
		{
			first[i] = sc.nextInt();
			second[i] = sc.nextInt();
		}
		int[] copy1 = copy(first);
		int[] secondelec = new int[f];
		int index=0;
		Arrays.sort(copy1);
		int l = copy1[copy1.length - f];
		for (int i=0; i<cows; i++)
		{
			if (first[i]>=l)
			{
				secondelec[index] = second[i];
				index ++;
			}
		}
		Arrays.sort(secondelec);
		int last = secondelec[secondelec.length-1];
		int lol = 0;
		for (int i = 0; i<cows; i++)
		{
			if (second[i] == last)
				lol = i;
		}
		System.out.println(lol+1);
	}
	public static int[] copy(int[] a)
	{
		int[] x = new int[a.length];
		for (int i=0; i<a.length; i++)
			x[i] = a[i];
		return x;
	}
}
