package Config_Factory;

public class Apps {

	public static void main(String[] args) {
		ConnStringClass connString;
		ConnStrinFactory connStringFactory=new ConnStrinFactory();
		
		 connString =connStringFactory.getConnString("hq");
		System.out.println(connString.getDbDriverName());
		System.out.println(connString.getDbUid());
		System.out.println(connString.getDbPwd());
		System.out.println(connString.getDbUri());
		
		connString =connStringFactory.getConnString("srb");
		System.out.println(connString.getDbDriverName());
		System.out.println(connString.getDbUid());
		System.out.println(connString.getDbPwd());
		System.out.println(connString.getDbUri());
		
		
		


	}

}
