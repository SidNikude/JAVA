class Driver2
{
	public static void main(String[]args)
	{
	DreamCompany D1 = new DreamCompany();
	D1.salary = 70000;
	D1.role = "Software Development Engineer";
	D1.CompanyName = "IBM";

	System.out.println("The dream company is : " +D1.CompanyName);
	System.out.println("Salary is " +D1.salary);
	System.out.println("Role is " +D1.role);

	}
}

class DreamCompany
{
double salary;
String role;
String CompanyName;
}