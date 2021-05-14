import java.util.Scanner;
public class hello {
 int num,count;
 int a,b,c,i;
 int temp,sum=0,number;
void getNum() {
	System.out.println("Enter the given number: ");
	Scanner in= new Scanner(System.in);
	num=in.nextInt();
	temp=num;
	number=num;
	System.out.println("the number is "+ num);
	while(num>0)
	{
		num=num/10;
		count++;
	}
	System.out.println("count is :"+count);
	
}
void amStrong() {
	for(i=0;i<count;i++) {
	int a=temp%10;
	//System.out.println("a"+a);
	int b= (int) Math.pow(a, count);
	//System.out.println("b :"+b);
	sum=sum+b;
	//System.out.println("sum"+sum);
	temp=temp/10;
	//System.out.println("num"+sum);
	}
	System.out.println("The sum is :"+sum);
	if(number==sum)
	{
		System.out.println("Number is amstrong");
	}
	else {
		System.out.println("The number is not amstrong");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello world");
hello number=new hello();
number.getNum();
number.amStrong();

	}

}
