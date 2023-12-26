class SimpleInterest
{
	public static void main(String[]args)
	{
	int principle = 10000 ;
	float rate = 12  ; //%
	int time = 2 ;  //Years
	float Si = principle * time * rate;
	System.out.println("The Simple Interest is " + Si);
	System.out.println("The principle is " + principle);
	System.out.println("The total amount is " + (principle + Si));
	

	}



}