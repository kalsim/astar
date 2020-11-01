import java.util.Scanner;

public class RaceResults {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      int[] times = new int[sc.nextInt()];
	      for (int i=0; i<times.length; i++)
	      {
	    	  	times[i] = sc.nextInt()*(10000) + sc.nextInt()*(100) + sc.nextInt();
	      }
	      sort(times);
	      for (int i=0; i<times.length; i++)
	      {
	    	  	System.out.println(times[i]/10000 + " " + (times[i]%10000)/100 + " " + times[i]%100);
	      }
	}
	public static void sort(int[] lol)
	{
		for (int i=0; i<lol.length; i++) {
			int min=i;
			for (int j=i; j<lol.length; j++) {
				if (lol[j]<lol[min])
					min=j;
			}
			int temp = lol[i];
			lol[i] = lol[min];
			lol[min]=temp;
		}
	}
}