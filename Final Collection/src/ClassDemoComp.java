import java.util.TreeSet;

public class ClassDemoComp 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		
		PersonFinal p1=new PersonFinal("Pooja",65);
		PersonFinal p2=new PersonFinal("varhsa",40);
		PersonFinal p3=new PersonFinal("vaishnavi",50);
		PersonFinal p4=new PersonFinal("shital",68);
		TreeSet t=new TreeSet();
		t.add(p1);
		t.add(p2);
		t.add(p3);
		t.add(p4);
		System.out.println("based on weight :"+t);
		
		
	}
	

}
