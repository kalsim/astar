import java.util.Scanner;

public class PowerFailure {
	private static int poles;
	private static int connections;
	private static double minimum;
	private static int[] distance;
	private static int[][] nodes;
	private static int[][] adj;
	private static boolean[] visited;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		poles = sc.nextInt();
		connections = sc.nextInt();
		minimum = sc.nextDouble();
		nodes = new int[poles+1][2];
		for (int i=1; i<=poles; i++)
		{
			nodes[i][1] = sc.nextInt();
			nodes[i][2] = sc.nextInt();
			
		}
		for (int i=0; i<nodes.length; i++)
		{
			for (int j=0; j<nodes[0].length; j++)
			{
				
			}
		}
	}
}
