import java.util.Scanner;

public class labour extends employee {
	int salaryL;
	int totalSalL;
	@Override
	void cash() {
		// TODO Auto-generated method stub
		System.out.println("enter the number of labour");
		Scanner num=new Scanner(System.in);
		salaryL=num.nextInt();
		totalSalL=50000*salaryL;
		System.out.println("Total salary of labour's is : "+totalSalL);

	}

	

}
