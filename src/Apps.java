import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Config_Factory.ConnStringClass;
import Config_Factory.ConnStringFactory;
import DataAccessor.Tranx;
import Model.TranxModel;

public class Apps {

	public static void main(String[] args) {
		ConnStringClass connString;
		ConnStringFactory connStringFactory = new ConnStringFactory();

		connString = connStringFactory.getConnString("hq");
		System.out.println(connString.getDbDriverName());
		System.out.println(connString.getDbUid());
		System.out.println(connString.getDbPwd());
		System.out.println(connString.getDbUri());

		connString = connStringFactory.getConnString("srb");
		System.out.println(connString.getDbDriverName());
		System.out.println(connString.getDbUid());
		System.out.println(connString.getDbPwd());
		System.out.println(connString.getDbUri());
		System.out.println("-----------------------------------");

		List<TranxModel> tranxs = new ArrayList<TranxModel>();

		Tranx tranx = new Tranx();
		tranx.getAllTranx("vsb", 0);
		tranxs = tranx.getTranxs();

		if (tranxs.size() > 0) {
			Iterator<TranxModel> it = tranxs.iterator();
			while (it.hasNext()) {
				TranxModel obj = it.next();
				System.out.println(obj.getTranxID()+ "   " +obj.getTtId()+ "   " +obj.getDescription()+ "   " +obj.getDateDone());
				
			}

		} else {
			System.out.println("List No Element");
		}
		


	}

}
