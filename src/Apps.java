import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Connection_Factory.Connection_Factory;



public class Apps {

	public static void main(String[] args) {
		/*ConnStringClass connString;
		ConnStringFactory connStringFactory=new ConnStringFactory();
		
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
		*/
		
		Connection connection;
		Connection_Factory connectionFactory=new Connection_Factory();
		connection=connectionFactory.getConnection("hq");
		
		try {
			ResultSet rs= connection.createStatement().executeQuery("select * from users");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		


	}

}
