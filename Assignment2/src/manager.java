import java.util.Scanner;

public class manager extends employee {
	int salary;
	int totalSal;
	@Override
	void cash() {
		// TODO Auto-generated method stub
		System.out.println("enter the number of manager");
		Scanner num=new Scanner(System.in);
		salary=num.nextInt();
		totalSal=100000*salary;
		System.out.println("Total salary of manager's is : "+totalSal);
	}
	

	
	

}
