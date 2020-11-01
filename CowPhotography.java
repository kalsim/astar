import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CowPhotography {
	private static Map<Integer, Integer> m1 = new HashMap<Integer, Integer>();
	private static Map<Integer, Integer> m2 = new HashMap<Integer, Integer>();
	private static Map<Integer, Integer> m3 = new HashMap<Integer, Integer>();
	private static Map<Integer, Integer> m4 = new HashMap<Integer, Integer>();
	private static Map<Integer, Integer> m5 = new HashMap<Integer, Integer>();
	private static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 0; i<n; i++)
			m1.put(sc.nextInt(), i);
		for (int i = 0; i<n; i++)
			m2.put(sc.nextInt(), i);
		for (int i = 0; i<n; i++)
			m3.put(sc.nextInt(), i);
		for (int i = 0; i<n; i++)
			m4.put(sc.nextInt(), i);
		for (int i = 0; i<n; i++)
			m5.put(sc.nextInt(), i);
		ArrayList<Integer> lol = new ArrayList<Integer>();
		Set<Integer> temp = m1.keySet();
		for (int x: temp)
		{
			lol.add(x);
		}
		Collections.sort(lol, new Comparator<Integer>() {
		      public int compare(Integer i, Integer j)
		  	{
		  		int counter = 0;
		  		if (m1.get(i)<m1.get(j))
		  			counter++;
		  		if (m2.get(i)<m2.get(j))
		  			counter++;
		  		if (m3.get(i)<m3.get(j))
		  			counter++;
		  		if (m4.get(i)<m4.get(j))
		  			counter++;
		  		if (m5.get(i)<m5.get(j))
		  			counter++;
		  		if (counter>=3)
		  			return -1;
		  		return 1;
		  	}
		    });
		for (Integer urmom : lol)
			System.out.println(urmom);
	}
}
