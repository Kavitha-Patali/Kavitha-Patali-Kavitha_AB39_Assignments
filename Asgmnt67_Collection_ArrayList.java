package assignments;

import java.util.ArrayList;
import java.util.Collections;

public class Asgmnt67_Collection_ArrayList {

	public static void main(String[] args) {
		
		ArrayList A=new ArrayList();
		A.add(100);
		A.add(100);
		A.add(45);
		A.add(100);
		A.add(60);
		A.add("test");
		A.add(null);
		A.add(200);
		A.add(null);
		A.add("test1");
		System.out.println(A);

		ArrayList A2=new ArrayList();
		A2.add(100);
		A2.add(50);
		A2.add(150);
		A2.add(30);
		A2.add(20);
		Collections.sort(A2);
		System.out.println(A2);

	}

}
