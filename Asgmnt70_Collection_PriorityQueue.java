package assignments;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Asgmnt70_Collection_PriorityQueue {

	public static void main(String[] args) {
	
		PriorityQueue P=new PriorityQueue();
		P.add(100);
		P.add(100);
		P.add(45);
		P.add(100);
		P.add(60);
	//	P.add("test");
	//	P.add(null);
		P.add(200);
	//	P.add(null);
	//	P.add("test1");
		System.out.println(P);

		PriorityQueue P2=new PriorityQueue();
		P2.add(100);
		P2.add(50);
		P2.add(150);
		P2.add(30);
		P2.add(20);
		//Collections.sort(P2);
		System.out.println(P2);

		
	}

}
