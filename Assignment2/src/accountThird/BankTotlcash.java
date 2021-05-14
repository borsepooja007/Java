package accountThird;

public class BankTotlcash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrentAcc a= new CurrentAcc();
		SavingAcc b=new SavingAcc();
		a.AccType();
		b.AccType();
		int totalcash=a.curAmnt+b.saveAmnt;
		System.out.println("total cash is : "+totalcash);
	}

}
