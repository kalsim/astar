import java.util.Scanner;

public class FrogsPath {
	private static int ways;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		path(s);
		System.out.println(ways);
	}
	public static void path(String s)
	{
		if (s.length()==1)
		{
			ways++;
			return;
		}
		if (s.length()>=3 && s.substring(2, 3).equals("-"))
		{
			path(s.substring(2));
		}
		if (s.substring(1, 2).equals("-"))
		{
			path(s.substring(1));
		}
	}
}
