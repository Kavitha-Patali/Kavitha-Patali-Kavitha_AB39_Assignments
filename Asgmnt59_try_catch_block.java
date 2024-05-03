package assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Asgmnt59_try_catch_block {

	public static void main(String[] args) {
		//Write s program  for an exception with 5 catches and 1 finally block


		Scanner s1 =new Scanner(System.in);
	
		
		
		
try {
	System.out.print("Enter the size of an Array :");
	int size =s1.nextInt();
	System.out.print("Enter the "+size+" values for an Array :");
	int [] array  =new int[size];
	for(int i=0;i<size;i++)
	{
	
		array[i]=s1.nextInt();
		
	} 
	
	
	}
 catch(ArrayIndexOutOfBoundsException a1)
{
	 System.out.println("ArrayIndexOutOfBoundsException handled");
}
catch(NullPointerException a2)
{
	 System.out.println("NullPointerException handled");
}
catch(ArithmeticException a3)
{
	 System.out.println("ArithmeticException handled");
}
catch(InputMismatchException a4)
{
	 System.out.println("InputMismatchException handled");
}
catch(RuntimeException a5)
{
	 System.out.println("RuntimeException handled");
}
finally
{
	System.out.println("you can procced");
}
	
	
	}


	}


