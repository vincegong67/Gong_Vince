import java.util.Scanner;
public class Lab_11part4
{
	public static void main(String[]args)
	{
		int[][]nums = new int [4][4];
		Scanner kb = new Scanner(System.in);
		int num = 1;
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums[i].length;j++)
			{
				nums[i][j] = 1 + (int)(Math.random() * 100);
				System.out.print(nums[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("Please enter a number: ");
		int divisor = kb.nextInt();
		
		int count = 0;
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums[i].length;j++)
			{
			if(nums[i][j]%divisor == 0)
				count++;
			else
				count=count;
			}
		}
		
		System.out.println("There are " + count + " numbers divisible by " + divisor + " in the Array.");
	}
}