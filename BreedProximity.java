import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class BreedProximity {
	private static int[] cows;
	private static int k;
	private static Map<Integer, Integer> q;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		k = sc.nextInt();
		cows = new int[n];
		q = new HashMap<Integer, Integer>();
		for (int i=0; i<n; i++)
		{
			cows[i] = sc.nextInt();
		}
		int max=0;
		for (int i=0; i<k; i++)
		{
			if (q.get(cows[i])==null)
				q.put(cows[i], 0);
			if (q.get(cows[i])!=0)
				max = Math.max(max, cows[i]);
			q.put(cows[i], q.get(cows[i])+1);
		}
		for (int i=k; i<n; i++)
		{
			if (q.get(cows[i])==null)
				q.put(cows[i], 0);
			if (q.get(cows[i])!=0)
				max = Math.max(max, cows[i]);
			q.put(cows[i], q.get(cows[i])+1);
			q.put(cows[i-k], q.get(cows[i-k])-1);
		}
		System.out.println(max);
	}
}
