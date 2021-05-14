package q5;

import java.util.ArrayList;
import java.util.Collection;

public class StringBuilder1 {
	static String k;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> name=new ArrayList<String>();
		ArrayList<String> first=new ArrayList<String>();
		StringBuilder stb=new StringBuilder();
		name.add("Pooja");
		name.add("Varsha");
		name.add("Vaishnavi");
		name.add("Shital");
		name.add("Nayana");
		consume charfirst=()->{
			for(int i=0;i<name.size();i++) {
				System.out.println(name.get(i).charAt(i-i));
//				k=name.get(i).charAt(i-i);
//				first.add(k);
				stb.append(name.get(i).charAt(i-i));

			}
			
		};
		charfirst.firstlettr();
		System.out.println("The string is : " +stb);
	}

}

interface consume{
	void firstlettr();
}