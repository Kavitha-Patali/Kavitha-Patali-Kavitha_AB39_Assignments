package assignments;

class Test    //parent class
{    
	 void printmyname() 
	{
		
		System.out.println("My name is Kavitha");
	}
	
}
	
public class Asgmnt31_singlelevel_inherit extends Test  //child class
{
    void printmyaddress()
	{
		System.out.println("Bangalore");
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Asgmnt31_singlelevel_inherit A1= new Asgmnt31_singlelevel_inherit();
		A1.printmyname();
		A1.printmyaddress();
    }
}
