
import java.util.scanner;

class Si
{

	public static void main(String[]args)
	{
	Scanner sc = new Scanner(System.in);
	int principal = sc.nextInt();
	float interest = sc.nextFloat();
	float time = sc.nextFloat();
	float SimpleInterest= principal*interest*time/100;
	System.out.println("Simple Interest is:"+SimpleInterest);
	
	}
}