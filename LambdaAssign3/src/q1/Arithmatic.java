package q1;

import java.util.Scanner;

public class Arithmatic {
	static Arithm AddNumber=(int a ,int b) -> {
		System.out.println("Enter the first number");
		Scanner p=new Scanner(System.in);
		a=p.nextInt();
		System.out.println("Enter the second number");
		Scanner q=new Scanner(System.in);
		b=q.nextInt();
		System.out.println("Addition is: ");
		return a+b;
	};
	
	static Arithm SubNumber=(int a ,int b) -> {
		System.out.println("Enter the first number");
		Scanner p=new Scanner(System.in);
		a=p.nextInt();
		System.out.println("Enter the second number");
		Scanner q=new Scanner(System.in);
		b=q.nextInt();
		System.out.println("Substraction is: ");
		return a-b;
	};

	static Arithm MulNumber=(int a ,int b) -> {
		System.out.println("Enter the first number");
		Scanner p=new Scanner(System.in);
		a=p.nextInt();
		System.out.println("Enter the second number");
		Scanner q=new Scanner(System.in);
		b=q.nextInt();
		System.out.println("Multiplication is: ");
		return a*b;
	};
	
	static Arithm DivNumber=(int a ,int b) -> {
		System.out.println("Enter the first number");
		Scanner p=new Scanner(System.in);
		a=p.nextInt();
		System.out.println("Enter the second number");
		Scanner q=new Scanner(System.in);
		b=q.nextInt();
		if(b==0) {
			System.out.println("Enter valid Number");

		}
		System.out.println("Division is: ");
		return a/b;
			
		
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Addition");
	System.out.println(	AddNumber.Arith(9, 10));
	
	System.out.println("substraction");
	System.out.println(SubNumber.Arith(2,3));
	
	
	System.out.println("Multiplication");
	System.out.println(MulNumber.Arith(2,3));
	
	System.out.println("Division");
	System.out.println(	DivNumber.Arith(0,0));
	
	}

}

//Functional interface only contain one performance
interface Arithm {
	int Arith(int a,int b);
}

//interface sub{
//	int subNum(int a,int b);
//}
//interface mul{
//	int mulNum(int a,int b);
//}
//interface div{
//	int divNum(int a,int b);
//}