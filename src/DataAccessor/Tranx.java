package DataAccessor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Connection_Factory.ConnectionUtilities;
import Connection_Factory.Connection_Factory;
import Model.TranxModel;

public class Tranx {
	private List<TranxModel> tranxs;

	public List<TranxModel> getTranxs() {
		return tranxs;
	}

	public void setTranxs(List<TranxModel> tranxs) {
		this.tranxs = tranxs;
	}

	public void getAllTranx(String whichConn, int tranxId) {

		Connection connection;
		ResultSet rs;
		PreparedStatement ps;
		String sql = "SELECT TRANX_ID,TT_ID,DESCRIPTION,DATE_DONE FROM TRANX WHERE TRANX_ID>=?";

		Connection_Factory connectionFactory = new Connection_Factory();
		connection = connectionFactory.getConnection(whichConn);
		List<TranxModel> tranxsList = new ArrayList<TranxModel>();

		try {
			ps = connection.prepareStatement(sql);
			ps.setInt(1, tranxId);
			rs = ps.executeQuery();
			if (rs != null) {
				while (rs.next()) {

					tranxsList.add(new TranxModel(rs.getLong("tranx_id"), rs
							.getInt("tt_id"), rs.getString("description"), rs
							.getDate("date_done")));

				}
			}
			this.setTranxs(tranxsList);
			ConnectionUtilities.closeResultSet(rs);
			ConnectionUtilities.closePrepareStatement(ps);
			ConnectionUtilities.closeConnection(connection);
			

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
