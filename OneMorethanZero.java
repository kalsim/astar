import java.util.Scanner;
import java.util.Stack;

public class OneMorethanZero {
	private static int[] imgonnafailthistest;
	private static int x;
	private static Stack<String> s;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		imgonnafailthistest = new int[n];
		s = new Stack<String>();
		lol(0, 0, 0);
		x = s.size();
		while (!s.isEmpty())
			System.out.println(s.pop());
		System.out.println(x);
	}
	public static void lol(int d, int oneCount, int zeroCount)
	{
		if (d == imgonnafailthistest.length)
		{
			if (oneCount>zeroCount)
			{
				String l = "";
				for (int z: imgonnafailthistest)
					l += z + "";
				s.push(l);
			}
			return;
		}
		imgonnafailthistest[d] = 1;
		lol(d+1, oneCount+1, zeroCount);
		imgonnafailthistest[d] = 0;
		lol(d+1, oneCount, zeroCount+1);
	}
}
