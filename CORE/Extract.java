import java.util.Scanner;
class Extract
{
	public static void main(String[]args)
	{
	Scanner s = new Scanner(System.in);
	System.out.println("enter the value");
	int num = s.nextInt();
	do
	{
	int rem = num % 10 ;
	System.out.println(rem);
	num = num / 10 ;
	}
	
	while(num > 0);
	


	}
}