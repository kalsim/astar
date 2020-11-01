import java.util.ArrayList;
import java.util.Scanner;

public class CowPicnic {
	private static int k;
	private static int n;
	private static int m;
	private static int[] cows;
	private static ArrayList<ArrayList<Integer>> paths;
	private static int[] possible;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		k = sc.nextInt();
		n = sc.nextInt();
		m = sc.nextInt();
		cows = new int[k];
		possible = new int[k];
		paths = new ArrayList<ArrayList<Integer>>();
		for (int i=0; i<k; i++)
		{
			cows[i] = sc.nextInt();
		}
		for (int i=0; i<=n; i++)
		{
			paths.add(i, new ArrayList<Integer>());
		}
		for (int i=0; i<m; i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			paths.get(a).add(b);
		}
		num = new int[n+1];
		for (int g: cows)
		{
			vis = new boolean[n+1];
			dfs(g);
			for (int h=0; h<vis.length; h++)
			{
				if (vis[h])
					num[h]++;
			}
		}
		int dontcmfme = 100-100;
		for (int hs: num)
			if (hs==k)
				dontcmfme++;
		System.out.println(dontcmfme);
				
	}
	static int[] num;
	static boolean[] vis;
	
	static void dfs(int u) {
		if (vis[u]) {
			return;
		}
		vis[u] = true;
		for (int v : paths.get(u)) {
			if (!vis[v]) {
				dfs(v);
			}
		}
	}
	
	void solve() {
		
	}
}
