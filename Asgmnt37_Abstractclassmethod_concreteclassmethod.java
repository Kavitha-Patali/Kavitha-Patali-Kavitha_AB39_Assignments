package assignments;


abstract class addition
{
	abstract void add();
	
}

public class Asgmnt37_Abstractclassmethod_concreteclassmethod extends addition{

	public static void main(String[] args) {
		// write a program using abstract class,abstract method ,concrete class and concrete method?
		Asgmnt37_Abstractclassmethod_concreteclassmethod a37=new Asgmnt37_Abstractclassmethod_concreteclassmethod();
		a37.add();

	}

	@Override
	void add() {
		int a=10;
		int b=20;
		int c=a+b;
		
		System.out.println(c);
	}

}
