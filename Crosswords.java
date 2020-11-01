import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Crosswords {
	
	static char[][] crossword;
	
	static boolean horzPossible(int i, int j) {
	if (j!= 0)
		return false;
	if (j+2>=crossword[i].length)
		return false;
	if (Character.toString(crossword[i][j+1]).equals("#") || Character.toString(crossword[i][j+2]).equals("#"))
		return false;
	if (Character.toString(crossword[i][j]).equals("#"))
		return false;
	return true;
	}
	static boolean vertPossible(int i, int j) {
		if (i!= 0)
			return false;
		if (i+2>=crossword[j].length)
			return false;
		if (Character.toString(crossword[i+1][j]).equals("#") || Character.toString(crossword[i+2][j]).equals("#"))
			return false;
		if (Character.toString(crossword[i][j]).equals("#"))
			return false;
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		crossword = new char[r][c];
		sc.nextLine();
		for (int i = 0; i<r; i++)
		{
			crossword[i] = sc.nextLine().toCharArray();
		}
		ArrayList<int[]> starts = new ArrayList<>();
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (horzPossible(i, j) || vertPossible(i, j)) {
					starts.add(new int[] {i + 1, j + 1});
				}
			}
		}	
		System.out.println(starts.size());
		for (int x=0; x<starts.size(); x++)
		{
			System.out.println(starts.get(x)[0]+" "+starts.get(x)[1]);
		}
	}
}
