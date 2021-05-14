package dessertShop;

import java.util.Scanner;

public class cookie extends DessertItems
{
	int costCookie;
	int countcookie;
	int sumCandy=1;

	
		
		@Override
		void getcost() 
		{
			System.out.println("Enter the number of packets of cookie ");
			Scanner num=new Scanner(System.in);
			countcookie=num.nextInt();
			costCookie=(countcookie*70);
			System.out.println("total cost in Rupees: "+ costCookie +"\nin Euros : "+(costCookie/70));		
		}		
	

}
