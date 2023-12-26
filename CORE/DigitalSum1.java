import java.util.Scanner;
class DigitalSum1
{
	public static void main(String[]args)
	{
	Scanner s = new Scanner(System.in);
	System.out.println("enter the value");
	int num = s.nextInt();
	extract(sum);
	}	

	public static int extract (int sum)
	{
	for ( ; num > 0 ; num = num / 10)
		{
		int sum = 0 ;
		int rem = num % 10 ;
		sum += rem ; 
		}
	return sum ;
	} 
	
	
}