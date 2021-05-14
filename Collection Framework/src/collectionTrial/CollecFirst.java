package collectionTrial;

import java.util.ArrayList;
import java.util.Collections;

public class CollecFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar=new ArrayList();
		ar.add("P");
		ar.add("O");
		ar.add("O");
		ar.add("J");
		ar.add("A");

		System.out.println(ar);
		Collections.reverse(ar);
		System.out.println(ar);
	}

}
