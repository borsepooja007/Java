package collectionTrial;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Assignment3 {
	int dd;
	int mm;
	int yyyy;
	static Assignment3 a1=new Assignment3(30,01,1998);
	static Assignment3 a2=new Assignment3(30,02,1999);
	static Assignment3 a3=new Assignment3(30,01,1998);
	static Assignment3 a4=new Assignment3(30,04,1999);

	public Assignment3(int dd, int mm, int yyyy) {
		this.dd=dd;
		this.mm=mm;
		this.yyyy=yyyy;
	}
	
	public static void main(String[] args) {
		

		Map<Assignment3,String> h=new HashMap<Assignment3,String>();
		h.put(a1,"neha");
		h.put(a2,"shital");
		h.put(a3,"varsha");
		h.put(a4,"shivani");
		Set<Assignment3> keys=h.keySet();
		
		for(Assignment3 i:keys)
		{
			//System.out.println(i+ "-"+ h.get(i)+"\n");
			//System.out.println(h.keySet());
			if(a1.dd==i.dd && a1.mm==i.mm)//a1 sathi ahe fakt he
			{
				System.out.println("fail");
			}
			else
			{
				System.out.println("Pass");
			}
		}

	}		
	}
	
