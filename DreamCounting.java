import java.util.Scanner;

public class DreamCounting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int[] nums = new int[y - x + 1];
		for (int i=0; i<nums.length; i++)
		{
			nums[i] = x;
			x++;
		}
		int[] numCount = new int[10];
		for (int i=0; i<nums.length; i++)
		{
			digitCount(nums[i], numCount);
		}
		for (int i=0; i<numCount.length; i++)
		{
			System.out.print(numCount[i] + " ");
		}
	}
	public static void digitCount(int num, int[] x)
	{
		if (num == 0)
		{
			x[0]++;
		}
		else
		{
			while (num!=0)
			{
				x[num%10]++;
				num = num/10;
			}
		}
	}
}
