import java.util.Arrays;
import java.util.Scanner;

public class RiverHopscotch {
	private static int[] rocks;
	private static int L;
	private static int N;
	private static int M;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		L = sc.nextInt();
		N = sc.nextInt();
		M = sc.nextInt();
		rocks = new int[N+2];
		for (int i=0; i<N; i++)
		{
			rocks[i+1]=sc.nextInt();
		}
		rocks[rocks.length-1] = L;
		Arrays.sort(rocks);
		
		int[] rock = Arrays.copyOf(rocks, rocks.length);
		int counter=1;
		
		while (possible(counter, rock))
		{
			counter++;
			rock = Arrays.copyOf(rocks, rocks.length);
		}
		System.out.println(counter-1);
	}
	public static boolean possible(int mindist, int[] rock)
	{
		int count = M;
		for (int i=0; i<rock.length-1; i++)
		{
			if (rock[i]+mindist>rock[i+1])
			{
				rock[i+1]=rock[i];
				count--;
				if (count<0)
					return false;
			}
		}
		return count>=0;
	}
}
