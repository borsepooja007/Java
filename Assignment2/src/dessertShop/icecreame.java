package dessertShop;

import java.util.Scanner;

public class icecreame extends DessertItems {

	int costIce;
	int countIce;
	int sumCandy=1;

	
		
		@Override
		void getcost() 
		{
			System.out.println("Enter the number of Icecream ");
			Scanner num=new Scanner(System.in);
			countIce=num.nextInt();
			costIce=(countIce*60);
			System.out.println("total cost in Rupees: "+ costIce);		
		}		

}
