import java.util.Scanner;

public class CowCounting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		String no = sc.nextInt() + "";
		int cows = 1;
		while (count>0)
		{
			String s = cows + "";
			if (s.indexOf(no) == -1)
			{
				count--;
			}
			cows++;
		}
		cows--;
		System.out.println(cows);
	}
}
