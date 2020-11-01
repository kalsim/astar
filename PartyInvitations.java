import java.util.*;

public class PartyInvitations {
	private static int counter = 0;
	private static Queue<Integer> q = new LinkedList<Integer>();
	private static ArrayList<Set<Integer>> groups = new ArrayList<Set<Integer>>();
	private static Map<Integer, Set<Integer>> map = new HashMap<Integer, Set<Integer>>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int numsets = sc.nextInt();
		for (int i=0; i<numsets; i++)
		{
			int x = sc.nextInt();
			Set<Integer> cows = new HashSet<Integer>();
			while (x>0)
			{
				cows.add(sc.nextInt());
				x--;
			}
			groups.add(cows);
		}
		for(int i=1; i<=n; i++)
		{
			map.put(i, new HashSet<Integer>());
		}
		
		for(int i=1; i<=n; i++)
		{
			for (int j=0; j<groups.size(); j++)
			{
				if (groups.get(j).contains(i))
					map.get(i).add(j);
			}
		}
		q.add(1);
		while (!q.isEmpty()) {
			int temp = (int) q.remove();
			Set<Integer> s = map.get(temp);
			for (int a: s)
			{
				if (groups.get(a).contains(temp))
					groups.get(a).remove(temp);
				if (groups.get(a).size()==1)
				{
					for (int x: groups.get(a))
					{
						q.add(x);
						groups.get(a).remove(x);
					}
				}
			}
			counter++;
		}
		System.out.println(counter);
	}
/**
 * read in set
 * add it to corresponding #s in map
 * 
 * 
 * make an arraylist of sets to store all the groups
 * map cow number to a list of sets with all the cows in it
 * queue to see what needs to be removed
 * add 1 to queue to start
 * counter start at 1
 * start removing and adding to the queue
 * each addition to queue, +1 to counter
 */
}
