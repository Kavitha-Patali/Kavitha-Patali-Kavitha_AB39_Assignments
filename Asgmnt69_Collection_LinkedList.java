package assignments;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

public class Asgmnt69_Collection_LinkedList {

	public static void main(String[] args) {
		
		LinkedList L=new LinkedList();
		L.add(100);
		L.add(100);
		L.add(45);
		L.add(100);
		L.add(60);
		L.add("test");
		L.add(null);
		L.add(200);
		L.add(null);
		L.add("test1");
		System.out.println(L);

		LinkedList L2=new LinkedList();
		L2.add(100);
		L2.add(50);
		L2.add(150);
		L2.add(30);
		L2.add(20);
		Collections.sort(L2);
		System.out.println(L2);

	}

}
