package Config_Factory;

public class ConnStringClass implements ConnString {
	private String dbDriverName;
	private String dbUid;
	private String dbPwd;
	private String dbUri;
	
	



	public String getDbDriverName() {
		return dbDriverName;
	}



	public void setDbDriverName(String dbDriverName) {
		this.dbDriverName = dbDriverName;
	}



	public String getDbUid() {
		return dbUid;
	}



	public void setDbUid(String dbUid) {
		this.dbUid = dbUid;
	}



	public String getDbPwd() {
		return dbPwd;
	}



	public void setDbPwd(String dbPwd) {
		this.dbPwd = dbPwd;
	}



	public String getDbUri() {
		return dbUri;
	}



	public void setDbUri(String dbUri) {
		this.dbUri = dbUri;
	}
	
	

}
