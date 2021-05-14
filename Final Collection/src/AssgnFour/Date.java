package AssgnFour;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Date {

	public static void main(String[] args) 
	{
	
	  	Map<String,String> dob=new HashMap<>();
		dob.put("30/07/1998", "Pooja");
		dob.put("25/05/1998", "varsha");
		dob.put("14/11/1997", "vaish");
		dob.put("30/08/1998", "shital");
	//	System.out.println(dob.get("30/07/1998"));
		Set<String> keys=dob.keySet();
		String id="30/27/1998";
		if(dob.containsKey(id))
		{
			return;		
			
		}
		else {
			System.out.println("hello");
		}
		for(String i:keys)
		{
			System.out.println(i+ "-"+ dob.get(i)+"\n");
			System.out.println(dob.keySet());
		}
		
		Map<Date, Integer> m=new HashMap<Date, Integer>();	
		DateFormat datef=new SimpleDateFormat("dd-MM-yyyy");
//		m.put(new java.sql.Date(datef.parse("30-07-1998").getTime()) , 67);
//	    m.put(new java.sql.Date(datef.parse("31-05-2011").getTime()),67);

	}

}
