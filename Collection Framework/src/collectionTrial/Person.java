package collectionTrial;

import java.util.TreeSet;

public class Person implements Comparable {
		String name;
		int weight;
		Person(String name, int weight)
		{
			this.name=name;
			this.weight=weight;
		}
		 public String toString() {
			return name+"-"+weight;
			 
		 }
	

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		int w1=this.weight;
		Person p=(Person)o;
		int w2=p.weight;
		
		if(w1<w2)
			return -1;
		else if(w1>w2)
			return +1;
		else
			return 0;
	}

}

class CompDemo
{
	private void psvm(String[] args) 
	{
		Person p1=new Person("Pooja",65);
		Person p2=new Person("varhsa",40);
		Person p3=new Person("vaishnavi",50);
		Person p4=new Person("shital",68);
		TreeSet t=new TreeSet();
		t.add(p1);
		t.add(p2);
		t.add(p3);
		t.add(p4);
		System.out.println("based on weight :"+t);
	}

}
