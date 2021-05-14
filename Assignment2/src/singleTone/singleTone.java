package singleTone;

public class singleTone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testSingleTone a=testSingleTone.getInstance();
		testSingleTone b=testSingleTone.getInstance();
		System.out.println("object a: "+a);
		System.out.println("object b: "+b);
		//only one instance created for singleton class
	}

}
