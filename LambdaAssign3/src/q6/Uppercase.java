package q6;

 
import java.util.ArrayList;
import java.util.function.UnaryOperator;



public class Uppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("helli");
		ArrayList l=new ArrayList();
		l.add("pooja");
		l.add("Varsha");
		l.add("Vaishnavi");
		l.add("Shital");
		l.add("Nayana");
		
		
		System.out.println(l);
	
		l.replaceAll(x-> ((String) x).toUpperCase());
		System.out.println(l);

}
}
interface upper{
	void up(String s);
}
