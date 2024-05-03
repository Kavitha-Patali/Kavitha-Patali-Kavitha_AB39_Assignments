package assignments;

import java.util.Scanner;

public class Asgmnt54_swap2no_withoutextraVar {

	public static void main(String[] args) {
		// Swap the 2 numbers without extra variable 
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of A");
		int A=s.nextInt();
		System.out.println("Enter the value of B");
		int B=s.nextInt();
		System.out.println("Before Swapping "+"A="+A+" "+"B="+B);
		
		A=A+B;
		B=A-B;
		A=A-B;
		
		System.out.println("After Swapping "+"A="+A+" "+"B="+B);
		

	}

}
