package collectionTrial;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class collectSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet h=new HashSet();
		LinkedHashSet lh=new LinkedHashSet();
		h.add(2);
		h.add(9);
		h.add(10);
		h.add(1);
		System.out.println("HashSet is Unordered: "+h);
		lh.add(2);
		lh.add(9);
		lh.add(10);
		lh.add(1);
		System.out.println("LinkedHashSet is Ordered: "+lh);
		
		
		TreeSet t =new TreeSet();
		t.add("A");
		t.add("a");
		t.add("z");
		t.add("C");
		//t.add(10);
		System.out.println("TreeSet is: "+t);
		
	}

}
