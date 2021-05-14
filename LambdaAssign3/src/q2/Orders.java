package q2;

import java.util.Scanner;

public class Orders {
	static int price;
	static Orderss ordStatus=()->{
		System.out.println("Enter the order price more than 10,000");
		Scanner p=new Scanner(System.in);
		price=p.nextInt();
		if(price>=10000)
		{
			System.out.println("Order is accepted and Completed");
		}
		else {
			System.out.println("order is not accepted");
		}
		return 0;
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ordStatus.ord();
	}

}

interface Orderss{
	int ord();
}