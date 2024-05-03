package assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class Asgmnt68_Collection_Vector {

	public static void main(String[] args) {
		
		Vector V=new Vector();
		V.add(100);
		V.add(100);
		V.add(45);
		V.add(100);
		V.add(60);
		V.add("test");
		V.add(null);
		V.add(200);
		V.add(null);
		V.add("test1");
		System.out.println(V);

		Vector V2=new Vector();
		V2.add(100);
		V2.add(50);
		V2.add(150);
		V2.add(30);
		V2.add(20);
		Collections.sort(V2);
		System.out.println(V2);

	}

}
