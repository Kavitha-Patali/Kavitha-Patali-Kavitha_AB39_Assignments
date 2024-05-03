package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Asgmnt45_Array_scannerclass {

	public static void main(String[] args) {
		// write a program in Array by getting the size of an array using Scanner class?
		
		
		Scanner s1 =new Scanner(System.in);
		System.out.print("Enter the size of an Array :");
		int size =s1.nextInt();
		System.out.print("Enter the "+size+" values for an Array :");
		int [] array  =new int[size];
		for(int i=0;i<size;i++)
		{
		
			array[i]=s1.nextInt();
		} 
	}
}
