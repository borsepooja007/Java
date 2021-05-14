package dessertShop;

import java.util.Scanner;

public class candy extends DessertItems{
	int costCandy;
	int countCandy;
	int sumCandy=1;
	@Override
	void getcost() {
		System.out.println("Enter the number of candies");
		Scanner num=new Scanner(System.in);
		countCandy=num.nextInt();
		costCandy=(countCandy*60);
		System.out.println("total cost in Rupees: "+ costCandy +"\nin dollars : "+(costCandy/60));		
	}

}
