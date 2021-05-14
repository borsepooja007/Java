package collectionTrial;
import java.util.TreeSet;

public class PersonSort implements Comparable {
		String name;
		int weight;
		PersonSort(String name, int weight)
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
		PersonSort p=(PersonSort)o;
		int w2=p.weight;
		
		if(w1<w2)
			return -1;
		else if(w1>w2)
			return +1;
		else
			return 0;
	}

}

class CompDemoD
{
	private void psvm(String[] args) 
	{
		PersonSort p1=new PersonSort("Pooja",65);
		PersonSort p2=new PersonSort("varhsa",40);
		PersonSort p3=new PersonSort("vaishnavi",50);
		PersonSort p4=new PersonSort("shital",68);
		TreeSet t=new TreeSet();
		t.add(p1);
		t.add(p2);
		t.add(p3);
		t.add(p4);
		System.out.println("based on weight :"+t);
	}

}

