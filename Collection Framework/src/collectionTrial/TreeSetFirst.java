package collectionTrial;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetFirst {

	public static void main(String[] args) {
	System.out.println("Hello worl");
	TreeSet t =new TreeSet();
	t.add("A");
	t.add("a");
	t.add("z");
	t.add("C");
	//t.add(10);//
	//t.add(null);//Null pointer exception
	System.out.println("TreeSet is alphabet: "+t);
	
	
	//StringBuffer cha object insert kaarayachay
	TreeSet t1 =new TreeSet();
	t1.add(new StringBuffer("Z"));
	t1.add(new StringBuffer("A"));
	t1.add(new StringBuffer("B"));
	System.out.println("TreeSet is buffer: "+t1);//class cast exception error is occured
	
	//Comparable Interface
	System.out.println("A".compareTo("Z"));//A before Z
	System.out.println("Z".compareTo("Z"));//equual
	System.out.println("Z".compareTo("B"));//Z after B
	//System.out.println("Z".compareTo(null));//Null pointerexception
	
	//Comparator Interface: customize sorting will be made
	//TreeSet t2=new TreeSet();//default sortinfg order
	TreeSet<Integer> t2=new TreeSet<Integer>(new MyComparator());//customized oreder: descending order
	t2.add(10);
	t2.add(30);
	t2.add(5);
	t2.add(9);
	t2.add(50);

	System.out.println("TreeSet is: "+t2);//class cast exception error is occured


	
	TreeSet st=new TreeSet(new strcomtr());
	st.add("Pooja");
	st.add("Sunil");
	st.add("Borse");
	st.add("Moni");

	System.out.println("staring treeset is: "+st);
	
	}

}




class MyComparator implements Comparator{

	@Override
	public int compare(Object Ob1, Object Ob2) {
		// TODO Auto-generated method stub
		Integer i1=(Integer)Ob1;
		Integer i2=(Integer)Ob2;
		if(i1<i2)//i1 comes after
			return +1;
		else if(i1>i2)
			return -1;
		else
			return 0;
	}
	
}



class strcomtr implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		
		return s2.compareTo(s1);
	}
	
}