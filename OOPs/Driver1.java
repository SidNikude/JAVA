class Driver1
{
	public static void main(String[]args)
	{
	Watch W1 = new Watch();
	W1.price = 150 ;
	W1.company = "Radoe";
	W1.color = "Brown";
	
	Watch W2 = new Watch();
	W2.price = 100;
	W2.company ="Fasrack";
	W2.color = "Cheeta Black";
	
	System.out.println("Properties of Watch 1 are :");
	System.out.println(W1.price);
	System.out.println(W1.company);
	System.out.println(W1.color);
	
	System.out.println("Properties of Watch 2 are :");
	System.out.println(W2.price);
	System.out.println(W2.company);
	System.out.println(W2.color);

	
	}
}


class Watch
{
double price;
String company;
String color;



}