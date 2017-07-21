package task1;
import java.util.Scanner;

public class ones {
	public static void main(String[] args)
	{
		int rows;
		Scanner ip = new Scanner(System.in);
				System.out.println(" number of rows");
			rows=ip.nextInt();		
		System.out.println("Here is the pattern");
	for(int i = 1; i<= rows;i++)
	{
	for(int j = 1; j<=rows; j++)
	{
		if(i<=j)
	System.out.print('1');
	}
	System.out.println();
	}
	}
}
