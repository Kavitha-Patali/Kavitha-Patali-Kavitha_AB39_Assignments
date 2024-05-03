package assignments;

class testc2
{
	testc2(int a, String b)
	{
		System.out.println("test2 constrctor");
	}
}

class testc1 extends testc2 
{
	testc1(String a)
	{
		super(1,"test2");
		System.out.println("test1 constrctor");
	}
}
public class Asgmnt34_callparentconstructorusing_supercallingstmt extends testc1 {
	
	
	Asgmnt34_callparentconstructorusing_supercallingstmt()
	
	{
		super("test");
		System.out.println("main constrctor1");
	}
	

	public static void main(String[] args) {
		// Write a program to call the parent class constructor using super calling statement
new Asgmnt34_callparentconstructorusing_supercallingstmt();
	}

}
