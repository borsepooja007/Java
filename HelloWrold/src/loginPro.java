import java.util.Scanner;
public class loginPro {
	String userName="pb";
	String password="mo";
	String name, pwd;
	int count=3,i;
	int flag=3;
	void takeInfo() 
	{
		for(i=0;i<count;i++)
		{
			System.out.println("Enter the usename");
			Scanner u1 =new Scanner(System.in);
			name = u1.nextLine();
	//		System.out.println("the usename is "+name);
	
			System.out.println("Enter the password");
			Scanner u2=new Scanner(System.in);
			pwd = u2.nextLine();
	//		System.out.println("the password is "+pwd);
	
			
			if((name.equals(userName)) && (pwd.equals(password)) )
			{
				
				break;
				
			}
			else 
			{
				
				
				System.out.println("Only "+--flag+" chances left");
				continue;
			}  

		}
//		}
		if(flag==0)
			System.out.println("contact Admin \nYour account gets blocked");
		else
			System.out.println("WELCOME!!!!!!!!!!");


	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loginPro pb=new loginPro();
		pb.takeInfo();
		}

}
