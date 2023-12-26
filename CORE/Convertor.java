import java.util.Scanner;
class Convertor
{
	public static void main(String[]args)
	{
	Scanner s = new Scanner(System.in);
	System.out.println("Please select the type to be converted");
	System.out.println("(1) Length");
	System.out.println("(2) Weight");
	System.out.println("(3) Time");
	System.out.println("(4) Volume");
	int type = s.nextInt();


	Switch (type);
	{
	case1:
	System.out.println("Enter the meter value");
	int meter = s.nextInt();
	System.out.println("The centimeter value of meter is" + meter/1000);

	caseDefault:
	System.out.println("Wrong input");
	
	}
	
	}
}