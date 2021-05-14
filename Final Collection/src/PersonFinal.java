import java.util.TreeSet;

public class PersonFinal implements Comparable {
		String name;
		int weight;
		PersonFinal(String name, int weight)
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
		PersonFinal p=(PersonFinal)o;
		int w2=p.weight;
		
		if(w1<w2)
			return -1;
		else if(w1>w2)
			return +1;
		else
			return 0;
	}

}


