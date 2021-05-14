
public class organisation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		manager or=new manager();
		or.cash();
		labour lab=new labour();
		lab.cash();
		int totalSalary=or.totalSal+lab.totalSalL;
		System.out.println("Total salary off employee of organisation is : "+totalSalary);
	}
}
