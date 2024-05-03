package assignments;



public class Asgmnt65_thiscallingStatement {

	
	
	Asgmnt65_thiscallingStatement()
	{
		this("test");
		System.out.println("Constrctor 1");
	}
	Asgmnt65_thiscallingStatement(String s)
	{
		this(10);
		System.out.println("Constrctor 2");
	}
	Asgmnt65_thiscallingStatement(int a)
	{
		
		System.out.println("Constrctor 3");
	}
	public static void main(String[] args) {
		// Write a program to demonstrate this calling statement

		Asgmnt65_thiscallingStatement a65=new Asgmnt65_thiscallingStatement();
	}

}
