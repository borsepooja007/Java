package q6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class ChatRoom {
	String user,roomname;
	int login;
	static TreeSet t=new TreeSet();
	static Map<Integer,String> m=new HashMap<Integer, String>();
	void menu() {
		System.out.println("1.Create Chatroom");
		System.out.println("2.Add user");
		System.out.println("3.user login");
		System.out.println("4.Sent message");

	}
	void CreateChat()
	{
		//TreeSet t=new TreeSet();
		System.out.println("create chatroom and enter the name");
		Scanner nm=new Scanner(System.in);
		roomname=nm.next();
		System.out.println(roomname+" chatroom is created");
		t.add("Pb");
		t.add("Dm");
		t.add("Sb");
	}
	void addUser()
	{
		System.out.println("Enter the user name");
		Scanner in=new Scanner(System.in);
		user=in.next();
		System.out.println(user+" user is added");
		t.add(user);
	}
	void userlogin() {
		System.out.println("Enter the user lopgin");
		Scanner lg=new Scanner(System.in);
		login=lg.nextInt();
		System.out.println(login+" user is added");
		m.put(login, user);
		System.out.println(m);
		System.out.println(m.get(8));
	}
	void delete()
	{
		m.remove(8);
		System.out.println(m);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChatRoom c=new ChatRoom();
		c.menu();
		c.CreateChat();
		c.addUser();
		System.out.println(t);
		c.userlogin();
	}

}
