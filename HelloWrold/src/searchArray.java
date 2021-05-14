
public class searchArray {
	int arr[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
	int user=19;
	int i,j,k;
	int temp;
	void search()
	{
		System.out.println(arr[0]);
		for(i=0;i<15;i++)
		{
			if(arr[i]==user)
			{
				System.out.println("the number "+user+" find out at "+i+"th position");
			}
		}
	}
	void bubbleSort()
	{
		for(i=0;i<15;i++)
		{
			for(j=0;j<15-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(k=0;k<15;k++)
		{
			System.out.println("\t"+arr[k]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		searchArray num= new searchArray();
		num.search();
		num.bubbleSort();
	}

}
