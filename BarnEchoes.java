import java.util.Scanner;

public class BarnEchoes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String first = sc.nextLine();
		String last = sc.nextLine();
		int x = findMax(first, last);
		int y = findMax(last, first);
		if (x>y)
			System.out.println(x);
		else
			System.out.println(y);
	}
	public static int findMax(String one, String two)
	{
		int maxLen = 0;
		int y = Math.min(one.length(), two.length());
		for (int i=1; i<=y; i++)
		{
			if (one.substring(0, i).equals(two.substring(two.length()-i)))
				maxLen = i;
		}
		return maxLen;
	}
}
