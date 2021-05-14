package dessertShop;

import java.util.Scanner;

public class placeOrders {
	String role,item,order;
	int length;
	String str[]= {"candy","cookie","icecreame"};
	void menu() {
		System.out.println(".....Menu.....");
		length=str.length;
		System.out.println("array length"+length);
		for(int i=0;i<length;i++)
		{
			System.out.println(i+1+". "+str[i]+"\n");
		}
	}
	void role()
	{
		System.out.println("Please mention the role\nManager:M for cutomer:C");
		Scanner r=new Scanner(System.in);
		role=r.nextLine();
		if(role.equals("M")||role.equals("m"))
		{
			System.out.println("Enter desert item in menu");
			Scanner itm=new Scanner(System.in);
			item=itm.nextLine();
			System.out.println(item+" added in menu");
//			for(int j=length;j<=length;j++)
//			{
//				str[j]=item;
//			}
		}
		else
		{
			System.out.println("Place your order");
			Scanner or=new Scanner(System.in);
			order=or.nextLine();
		}
		
	}
	public static void main(String[] args) {
		placeOrders ord=new placeOrders();
		candy cnd=new candy();
		cookie ck=new cookie();
		icecreame ice=new icecreame();
		ord.menu();
		ord.role();
		if(ord.order.equals("candy"))
		{
			cnd.getcost();
		}
		else if(ord.order.equals("cookie"))
		{
			ck.getcost();
		}
		else {
			ice.getcost();
		}
		
	}

}
