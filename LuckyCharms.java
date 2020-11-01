import java.util.Scanner;

public class LuckyCharms {
	public static void main(String[] args) {
	      Scanner scan = new Scanner(System.in);
	      int len = scan.nextInt();
	      int charms = scan.nextInt();
	      int nail = scan.nextInt();
	      for (int i=0; i<charms; i++)
	      {
	    	  	int l = scan.nextInt();
	    	  	int pos = scan.nextInt();
	    	  	if (pos<=nail)
	    	  	{
	    	  		System.out.println(nail-(pos-l));
	    	  	}
	    	  	else
	    	  		System.out.println((pos+l)-nail);
	      }
	}
}
