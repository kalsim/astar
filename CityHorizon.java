import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CityHorizon {
	private static Integer[][] buildings;
	private static TreeMap<Integer, Integer> lol;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		buildings = new Integer[2*n][3];
		for (int i = 0; i<2*n; i++)
		{
			int x = sc.nextInt();
			int y = sc.nextInt();
			int h = sc.nextInt();
			buildings[i][0] = x;
			buildings[i][1] = h;
			buildings[i][2] = 0;
			i++;
			buildings[i][0] = y;
			buildings[i][1] = h;
			buildings[i][2] = 1;
		}
		lol = new TreeMap<Integer, Integer>();
		Arrays.sort(buildings, new Comparator<Integer[]>() {
			public int compare(Integer[] x1, Integer[] x2) {
				Integer one = x1[0];
				Integer two = x2[0];
				return one.compareTo(two);
			}
		});
		long sum = 0;
		for (int i = 0; i<buildings.length; i++)
		{
			Integer position = buildings[i][0];
			Integer height = buildings[i][1];
			if (i!=0 && lol.size()>0)
				sum += (long) lol.lastKey() * ((long)buildings[i][0]-buildings[i-1][0]);
			
			if (buildings[i][2] == 0)
			{
				if (lol.containsKey(buildings[i][1]))
					lol.put(buildings[i][1], lol.get(buildings[i][1])+1);
				else
					lol.put(buildings[i][1], 1);
			}

			else
			{
				Integer x = lol.get(height);
				if (x==1) lol.remove(height);
				else lol.put(height, x-1);
			}
		}
		System.out.println(sum);
	}
}
