package assignments;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Asgmnt73_Collection_LinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet LH=new LinkedHashSet();
		LH.add(100);
		LH.add(100);
		LH.add(45);
		LH.add(100);
		LH.add(60);
		LH.add("test");
		LH.add(null);
		LH.add(200);
		LH.add(null);
		LH.add("test1");
		System.out.println(LH);

		LinkedHashSet LH2=new LinkedHashSet();
		LH2.add(100);
		LH2.add(50);
		LH2.add(150);
		LH2.add(30);
		LH2.add(20);
		//Collections.sort(LH2);
		System.out.println(LH2);
	}

}
