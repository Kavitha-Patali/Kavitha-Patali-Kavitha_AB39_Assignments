package assignments;

import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeSet;

public class Asgmnt71_Collection_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet T=new TreeSet();
		T.add(100);
		T.add(100);
		T.add(45);
		T.add(100);
		T.add(60);
	//	T.add("test");
	//	T.add(null);
		T.add(200);
	//	T.add(null);
	//	T.add("test1");
		System.out.println(T);

		TreeSet T2=new TreeSet();
		T2.add(100);
		T2.add(50);
		T2.add(150);
		T2.add(30);
		T2.add(20);
		//Collections.sort(T2);
		System.out.println(T2);


	}

}
