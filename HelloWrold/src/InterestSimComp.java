import java.util.Scanner;

public class InterestSimComp {
	int p,r,t;
	void takeValue(){
		System.out.println("Enetr the Pricipal : ");
		Scanner ip= new Scanner(System.in);
		p=ip.nextInt();
		System.out.println("The Principal is: "+p);
		System.out.println("Enetr the Rate of interest : ");
		Scanner ir= new Scanner(System.in);
		r=ir.nextInt();
		System.out.println("The Rate of interest is: "+r);
		System.out.println("Enetr the Time Period : ");
		Scanner it= new Scanner(System.in);
		t=it.nextInt();
		System.out.println("The Time Period is: "+t);
		
		
	}
	void simpleInt() {
		int simple= (p*r*t)/100;
		System.out.println("the simple interest is :"+simple);
	}
	void compInt() {
		int a1=(1+(r/100));
		int a2= (int) Math.pow(a1, t);
		int comp=p*a2;
		System.out.println("the compound interest is :"+comp);

	}


	public static void main(String[] args) {
		
		InterestSimComp val=new InterestSimComp();
		val.takeValue();
		val.simpleInt();
		val.compInt();
	}

}
