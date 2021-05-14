package persistant;

public class client  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		persistance jv=new filePersistence();
		persistance jv1=new dbPersistence();
		System.out.println(jv);
		System.out.println(jv1);
	}

}
