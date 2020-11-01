import java.util.ArrayList;
import java.util.Scanner;
/**
 * 1 9 (add cur pos - 10) 11 19
 * L[i][j] = minimum staleness of eating everything in the range i to j ending at i
 * i = start, j = end 
 * must contain 10
 * 
 * R[i][j] same as L[i][j] but ending at j
 * 
 */
public class GrazingOnTheRun {
	public static int time;
	public static int staleness;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nothing = sc.nextInt();
		int pos = sc.nextInt();
		ArrayList<Integer> lol = new ArrayList<Integer>();
		for (int i=0; i<nothing; i++)
		{
			lol.add(sc.nextInt());
		}
		while (lol.size()!=0)
		{
			int min = Integer.MAX_VALUE;
			int temp = 0;
			for (int i=0; i<lol.size(); i++)
			{
				if (Math.abs(pos-lol.get(i))<min)
				{
					min = Math.abs(pos-lol.get(i));
					temp = i;
				}
			}
			time+=min;
			staleness+=time;
			pos = lol.get(temp);
			lol.remove(temp);
		}
		System.out.println(staleness);
		sc.close();
	}
}