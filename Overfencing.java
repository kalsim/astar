import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Overfencing {

	static String[][] maze;
	static int[][] dis;
	static boolean[][] vis;
	static int[] di = new int[] {0, -1, 0, 1};
	static int[] dj = new int[] {1, 0, -1, 0};

	public static void readFile() {
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		maze = new String[2*h + 1][2*w + 1];
		vis = new boolean[2*h + 1][2*w + 1];
		dis = new int[2*h + 1][2*w + 1];
		for (int i = 0; i < dis.length; i++) {
			for (int j = 0; j < dis[0].length; j++) {
				dis[i][j] = Integer.MAX_VALUE;
			}
		}
		for (int i = 0; i < 2*h + 1; i++) {
			String ln = sc.nextLine();
			for (int j = 0; j < ln.length(); j++) {
				if (ln.charAt(j) == ' ') {
					maze[i][j] = " ";
				} else {
					maze[i][j] = ln.charAt(j) + "";
				}
			}
			for (int j = ln.length(); j < 2*w + 1; j++) {
				maze[i][j] = " ";
			}
		}
	}

	static boolean bad(int i, int j) {
		return i < 0 || j < 0 || i >= maze.length || j >= maze[0].length || !maze[i][j].equals(" ");
	}

	static void bfs(int si, int sj) {
		Queue<int[]> q = new ArrayDeque<>();
		for (int i = 0; i < vis.length; i++) {
			for (int j = 0; j < vis[0].length; j++) {
				vis[i][j] = false;
			}
		}
		vis[si][sj] = true;
		dis[si][sj] = 0;
		q.add(new int[] {si, sj});
		while (!q.isEmpty()) {
			int[] cur = q.remove();
			for (int d = 0; d < 4; d++) {
				int ni = cur[0] + di[d];
				int nj = cur[1] + dj[d];
				if (bad(ni, nj)) {
					continue;
				}
				if (vis[ni][nj]) {
					continue;
				}
				q.add(new int[] {ni, nj});
				vis[ni][nj] = true;
				dis[ni][nj] = Math.min(dis[cur[0]][cur[1]] + 1, dis[ni][nj]);
			}
		}
	}

	public static void solve() {
		int[] exit1 = null;
		int[] exit2 = null;
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[0].length; j++) {
				if (maze[i][j].equals(" ")) {
					if (i == 0 || j == 0 || i == maze.length - 1 || j == maze[0].length - 1) {
						if (exit1 == null) {
							exit1 = new int[] {i, j};
						} 