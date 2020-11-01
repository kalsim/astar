import java.io.InputStreamReader;
import java.util.Scanner;

public class MasterMind {
	static int[] guess;
	static int[] pos;
	static int[] neg;
	public static void main(String[] args) {
        Scanner sc = new Scanner(new InputStreamReader(System.in));
        int size = sc.nextInt();
        guess = new int[size];
        pos = new int[size];
        neg = new int[size];
        for (int i=0; i<size; i++)
        {
        		guess[i] = sc.nextInt();
        		pos[i] = sc.nextInt();
        		neg[i] = sc.nextInt();
        		
        }
        for (int j = 1000; j<10000; j++)
        {
        		if (test(j))
        		{
        			System.out.println(j);
        			return;
        		}
        }
	}
	public static boolean test(int x)
	{
		for (int i = 0; i<guess.length; i++)
		{
			if (feedbackpos(x, guess[i])!=pos[i] || feedbackneg(x, guess[i])!=neg[i])
				return false;
		}
		return true;
	}
	public static boolean feedbackpos(int x, int y)
	{
		
	}
	public static boolean feedbackneg(int x, int y)
	{
		for (int i=0; i<4; i++)
		{
			for (int j=0; j<4; j++)
			{
				String a = x+"";
				String b = y+"";
				if (i!=j || a.substring(i, i+1).equals(b.substring(j, j+1)))
					count++;
			}
		}
	}
}
