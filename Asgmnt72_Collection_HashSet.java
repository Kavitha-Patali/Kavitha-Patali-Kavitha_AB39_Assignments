package assignments;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class Asgmnt72_Collection_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet H=new HashSet();
		H.add(100);
		H.add(100);
		H.add(45);
		H.add(100);
		H.add(60);
		H.add("test");
		H.add(null);
		H.add(200);
		H.add(null);
		H.add("test1");
		System.out.println(H);

		HashSet H2=new HashSet();
		H2.add(100);
		H2.add(50);
		H2.add(150);
		H2.add(30);
		H2.add(20);
		//Collections.sort(H2);
		System.out.println(H2);
	}

}
