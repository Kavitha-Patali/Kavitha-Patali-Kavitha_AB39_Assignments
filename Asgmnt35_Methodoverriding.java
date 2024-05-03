package assignments;

class testing1
{
	void automationtest()
	{
		System.out.println("automation testing");
	}
}
public class Asgmnt35_Methodoverriding extends testing1 {
	
	void automationtest()
	{
		
		System.out.println("automation Engineer");
		super.automationtest();
		
	}

	public static void main(String[] args) {
		//Write a program for method overriding 

		Asgmnt35_Methodoverriding m1=new Asgmnt35_Methodoverriding();
		m1.automationtest();
		
	}

}
