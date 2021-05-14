
public class amstrongRange {
	int i;
	int num,temp,sum=0;
	int test;
	void amstrongFind()
	{
		for(i=100;i<=999;i++)
		{
			test=i;
			//System.out.println("test is "+test);
			for(int j=0;j<3;j++)
			{
			temp=test%10;
			num= (int) Math.pow(temp,3);
			sum=sum+num;
			test=test/10;
			}
			//System.out.println("Sum is: "+sum);
			if(sum==i) 
			{
//				System.out.println("The "+i+" is an amstrong number");
				System.out.println(sum);
			}
//			else 
//			{
//				System.out.println("The \"+i+\" is not an amstrong number");
//			}
			sum=0;
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		amstrongRange range= new amstrongRange();
		range.amstrongFind();

	}

}
