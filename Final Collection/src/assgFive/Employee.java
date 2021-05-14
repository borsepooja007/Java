package assgFive;

import java.util.HashMap;
import java.util.Map;

public class Employee {

	public static void main(String[] args) {
		student s=new student(1);
		student s2=new student(2);
		Map<student,String> h=new HashMap<student,String>();
		h.put(s, "awesome");
		h.put(s2, "success");
		System.out.println(h.size());///duplicate id asle tr ekach dar gheto ani jr different asle tr individual consider krto
		
		System.out.println(h.get(s));
	}

}

class student{
	int id;
	
	public student(int id) {
		// TODO Auto-generated constructor stub
		this.id=id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		student other = (student) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}