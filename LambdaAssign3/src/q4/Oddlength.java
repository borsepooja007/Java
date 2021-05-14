package q4;

import java.util.ArrayList;

public class Oddlength 
{
	static String s;
	static int len;
	public static void main(String[] args)
	{
		ArrayList<String> name=new ArrayList<String>();
		name.add("Pooja");
		name.add("Varsha");
		name.add("Vaishnavi");
		name.add("Shital");
		name.add("Nayana");
		odd dd=()->{
			for(int i=0;i<name.size();i++)
			{
				s=name.get(i);
				len=s.length();
				if(len%2!=0)
				{
					System.out.println("Removed : "+name.remove(i));
				}
//				else
//				{
//					name.remove(i);
//				}
				
			}
		System.out.println("Filtered array : "+name);
			
		};
//			
		dd.oddone();
	}

}

interface odd{
	void oddone();
}