package assignments;

import java.util.Scanner;

public class Asgmnt52_factorialofnumbers
{
  public static void main(String[] args)
  {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number ");
	int number=s.nextInt();
	int factorial=1;
	for(int i=1;i<=number;i++)
	 {
	   factorial=factorial*i;
	 }
	 System.out.println("Factorial of the number= "+factorial);  
		
   }

}
