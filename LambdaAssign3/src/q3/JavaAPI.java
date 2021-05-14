package q3;

public class JavaAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		consumer cd=()->{
			System.out.println("i am consumer");
		};
		cd.consumr();
	}

}

interface consumer{
	void consumr();
}

interface supplier{
	void suppl();
}

interface predicate{
	void predi();
}