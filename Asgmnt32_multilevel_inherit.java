package assignments;


class Test2  //grant parent class
{
	
	void myname()
	{
		System.out.println("Kavitha");
	}
	
}
class Test1 extends Test2    // parent class
{
	
	void myadd() {
		System.out.println("Bangalore");
	}
	
}


public class Asgmnt32_multilevel_inherit extends Test1   //child class
{

	void mycourse() {
		System.out.println("Automationclass_39 batch");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Asgmnt32_multilevel_inherit A1= new Asgmnt32_multilevel_inherit();
		A1.myname();
		A1.myadd();
		A1.mycourse();
	}

}
