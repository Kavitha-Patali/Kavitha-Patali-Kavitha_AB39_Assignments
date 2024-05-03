package assignments;

class sensitve_info
{
	private String un="abcd@gmail.com";
	public void setun(String un)
	{
		this.un=un;
	}
	public String getun()
	{
		return un;
		
	}
	
}

public class Asgmnt64_Encapsulation {

	public static void main(String[] args) {
		// Write a program to demonstrate encapsulation
		
		sensitve_info s1=new sensitve_info();
		s1.setun("xyz@gmail.com");
		System.out.println(s1.getun());
	}

}
