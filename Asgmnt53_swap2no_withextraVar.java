package assignments;

import java.util.Scanner;

public class Asgmnt53_swap2no_withextraVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of A");
		int A=s.nextInt();
		System.out.println("Enter the value of B");
		int B=s.nextInt();
		System.out.println("Before Swapping "+"A="+A+" "+"B="+B);
		int C=A;
		A=B;
		B=C;
		System.out.println("After Swapping "+"A="+A+" "+"B="+B);
				
	}

}
