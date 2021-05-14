package q7;

import java.util.HashMap;
import java.util.Map;

public class Parked_car_owner_details extends Parked_carOwnerLIst {
	static Parked_car_owner_details p1=new Parked_car_owner_details("varsha","Audi","1998","963258741","khote nagar");
	static Parked_car_owner_details p2=new Parked_car_owner_details("Neel","Hundai","1997","123654789","Tilak Nagar");
	static Map<Integer,Parked_car_owner_details> h=new HashMap<Integer,Parked_car_owner_details>();
	
	public Parked_car_owner_details(String string, String string2, String string3, String string4, String string5) {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		h.put(701, p1);
		h.put(702, p2);
		System.out.println(h);
		System.out.println(h.get(702));
		System.out.println(h.remove(702));
	}

}
