import java.util.Scanner;

public class threeSubResult {
	int sub1;
	int sub2,sub3;
	void subject() {
		System.out.println("Enter the marks of English");
		Scanner eng=new Scanner(System.in);
		sub1=eng.nextInt();
		System.out.println("Enter the marks of Math");
		Scanner mat=new Scanner(System.in);
		sub2=mat.nextInt();
		System.out.println("Enter the marks of Science");
		Scanner sci=new Scanner(System.in);
		sub3=sci.nextInt();
		System.out.println("The marks of English : "+sub1);
		System.out.println("The marks of Math : "+sub2);
		System.out.println("The marks of Science : "+sub3);
	}
	void compareMarks() {
		if(sub1>=60 && sub2>=60 && sub3>=60)
		{
			System.out.println("Student is paassss");
		}
		else if(sub1>=60 && sub2>=60 || sub1>=60 && sub3>=60 ||sub2>=60 && sub3>=60)
		{
			System.out.println("Student is Promoted");
		}
		else {
			System.out.println("Student is failed");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threeSubResult result=new threeSubResult();
		result.subject();
		result.compareMarks();

	}

}
