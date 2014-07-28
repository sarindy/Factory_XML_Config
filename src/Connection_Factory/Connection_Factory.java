package Connection_Factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import Config_Factory.ConnStringClass;
import Config_Factory.ConnStringFactory;

public class Connection_Factory {
	public Connection getConnection(String whichConn) {
		ConnStringFactory connStringFactory = new ConnStringFactory();
		ConnStringClass connStringClass = connStringFactory
				.getConnString(whichConn);

		try {
			Class.forName(connStringClass.getDbDriverName());
			try {
				Connection conn = DriverManager.getConnection(
						connStringClass.getDbUri(), connStringClass.getDbUid(),
						connStringClass.getDbPwd());
				return conn;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}
}
