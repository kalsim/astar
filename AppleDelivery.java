import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class AppleDelivery {
	private static int[] cost;
	private static int e;
	private static int v;
	private static int pb;
	private static int pa1;
	private static int pa2;
	private static ArrayList<ArrayList<Point>> p;
    public static void main (String[] args) throws IOException
    {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(f.readLine());
        
        e = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());
        pb = Integer.parseInt(st.nextToken());
        pa1 = Integer.parseInt(st.nextToken());
        pa2 = Integer.parseInt(st.nextToken());
        p = new ArrayList<ArrayList<Point>>();
        
        for (int i=0; i<=v; i++)
            p.add(new ArrayList<Point>());
        
        for (int i=0; i<e; i++)
        {
            StringTokenizer str = new StringTokenizer(f.readLine());
            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());
            int c = Integer.parseInt(str.nextToken());
            p.get(a).add(new Point(b,c));
            p.get(b).add(new Point(a,c));
        }
        
        int lol = dijkstra(pb, pa2) + dijkstra(pa2, pa1);
        int lool = dijkstra(pb, pa1) + dijkstra(pa1, pa2);
        
        System.out.println(Math.min(lol, lool));
    }
    public static int dijkstra(int start, int end)
    {
        cost = new int[v+1];
        boolean[] set = new boolean[v+1];
        for (int i=1; i<=v; i++)
            cost[i] = Integer.MAX_VALUE;
        
        cost[start] = 0;
        
        PriorityQueue<Point> queue = new PriorityQueue<Point>(11, new Comparator<Point>() {
            public int compare(Point o1, Point o2) {
                return o1.y-o2.y;
            }
        });
        queue.add(new Point(start,0));
        while(!queue.isEmpty())
        {
            Point po = queue.remove();
            if (set[po.x]) continue;

            set[po.x] = true;
            int l = p.get(po.x).size();
            for (int i=0; i<l; i++)
            {
                Point point = p.get(po.x).get(i);
                if (!set[point.x] && cost[point.x]>cost[po.x]+ point.y)
                {
                    cost[point.x] = cost[po.x]+ point.y;
                    queue.add(new Point(point.x, cost[po.x]+ point.y));
                }
            }
        }
        return cost[end];
    }
}