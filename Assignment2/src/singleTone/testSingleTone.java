package singleTone;

public class testSingleTone {
	private testSingleTone() {
		
	}
	static testSingleTone obj=new testSingleTone();
	
	
	public static testSingleTone getInstance()
	{
		return obj;
	}
}
