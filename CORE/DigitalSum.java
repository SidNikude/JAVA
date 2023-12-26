import java.util.Scanner;
class DigitalSum
{
	public static void main(String[]args)
	{
	Scanner s = new Scanner(System.in);
	System.out.println("enter the value");
	int num = s.nextInt();
	int sum = 0;
	while(num > 0)
	{
	int rem = num % 10;
	sum += rem;
	num = num / 10;
	}
	System.out.println("The Digital Sum is " + sum);
	
	}
}