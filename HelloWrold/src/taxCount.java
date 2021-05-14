import java.util.Scanner;
public class taxCount {
	float Cash;
	float temp=0;
	void income()
	{
		System.out.println("Enter the income : ");
		Scanner cash=new Scanner(System.in);
		Cash=cash.nextInt();
		System.out.println("The employee income is "+Cash+" Lpa");
	}
	void measureTax()
	{
//		temp=(200*10)/100;
//		System.out.println(temp);
		if(Cash <= 180000)
			System.out.println("No Tax money required");
		else if(Cash>=180001 && Cash<=300000)
		{
			temp=(Cash*10)/100;
			System.out.println("Tax money required is "+temp);
		}
		else if(Cash>=300001 && Cash<=500000)
		{
			temp=(Cash*20)/100;
			System.out.println("Tax money required is "+temp);
		}
		else if(Cash>=500001 && Cash<=1000000)
		{
			temp=(Cash*30/100);
			System.out.println("Tax money required is "+temp );
		}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		taxCount tax=new taxCount();
		tax.income();
		tax.measureTax();
	}

}
