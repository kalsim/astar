import java.util.Scanner;

public class PokerHands {
	private static int[] a;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		a = new int[sc.nextInt()+2];
		for (int i=1; i<a.length-1; i++)
		{
			a[i] = sc.nextInt();
		}
		int ans = 0;
		for (int i=1; i<a.length; i++)
		{
			ans+=Math.abs(a[i]-a[i-1]);
		}
		System.out.println(ans/2);
	}
}
