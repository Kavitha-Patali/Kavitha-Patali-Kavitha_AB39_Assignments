package assignments;

class kavitha{
	
	void myname1()
	{
		System.out.println("my name is kavitha");
	}
	
}

public class Asgmnt58_upcast_To_objectclass {

	void nameobject()
	{
		
	}
	
	public static void main(String[] args) 
	{
		// create a class with ur name and upcast to object class?
	
		kavitha k=new kavitha();
	    Object obj=	k;
	    System.out.println(obj.getClass());
	    }

	}
