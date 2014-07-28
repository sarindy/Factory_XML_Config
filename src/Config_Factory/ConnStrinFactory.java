package Config_Factory;

import java.io.IOException;
import java.io.InputStream;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

public class ConnStrinFactory {

	public ConnStringClass getConnString(String whichConn){
		SAXBuilder builder = new SAXBuilder();
		InputStream is = this.getClass().getResourceAsStream("/Con-Config.xml");

		Document doc;

		try {
			doc = builder.build(is);
			Element root = doc.getRootElement();
			ConnStringClass connStringClass=new ConnStringClass();
			if (whichConn.equalsIgnoreCase("hq")){
				connStringClass.setDbDriverName(root.getChild("DatabaseHQ").getChildTextTrim("dbDriverName"));
				connStringClass.setDbUid(root.getChild("DatabaseHQ").getChildTextTrim("dbUser"));
				connStringClass.setDbPwd(root.getChild("DatabaseHQ").getChildTextTrim("dbPassword"));
				connStringClass.setDbUri(root.getChild("DatabaseHQ").getChildTextTrim("dbURI"));
				return connStringClass;
				
			}else if ((whichConn.equalsIgnoreCase("srb"))){
				connStringClass.setDbDriverName(root.getChild("DatabaseSRB").getChildTextTrim("dbDriverName"));
				connStringClass.setDbUid(root.getChild("DatabaseSRB").getChildTextTrim("dbUser"));
				connStringClass.setDbPwd(root.getChild("DatabaseSRB").getChildTextTrim("dbPassword"));
				connStringClass.setDbUri(root.getChild("DatabaseSRB").getChildTextTrim("dbURI"));
				return connStringClass;
			}else if ((whichConn.equalsIgnoreCase("svb"))){
				connStringClass.setDbDriverName(root.getChild("DatabaseSVB").getChildTextTrim("dbDriverName"));
				connStringClass.setDbUid(root.getChild("DatabaseSVB").getChildTextTrim("dbUser"));
				connStringClass.setDbPwd(root.getChild("DatabaseSVB").getChildTextTrim("dbPassword"));
				connStringClass.setDbUri(root.getChild("DatabaseSVB").getChildTextTrim("dbURI"));
				return connStringClass;
			}else if ((whichConn.equalsIgnoreCase("bbb"))){
				connStringClass.setDbDriverName(root.getChild("DatabaseBBB").getChildTextTrim("dbDriverName"));
				connStringClass.setDbUid(root.getChild("DatabaseBBB").getChildTextTrim("dbUser"));
				connStringClass.setDbPwd(root.getChild("DatabaseBBB").getChildTextTrim("dbPassword"));
				connStringClass.setDbUri(root.getChild("DatabaseBBB").getChildTextTrim("dbURI"));
				return connStringClass;
			}else if ((whichConn.equalsIgnoreCase("opb"))){
				connStringClass.setDbDriverName(root.getChild("DatabaseOPB").getChildTextTrim("dbDriverName"));
				connStringClass.setDbUid(root.getChild("DatabaseOPB").getChildTextTrim("dbUser"));
				connStringClass.setDbPwd(root.getChild("DatabaseOPB").getChildTextTrim("dbPassword"));
				connStringClass.setDbUri(root.getChild("DatabaseOPB").getChildTextTrim("dbURI"));
				return connStringClass;
			}else if ((whichConn.equalsIgnoreCase("vsb"))){
				connStringClass.setDbDriverName(root.getChild("DatabaseVSB").getChildTextTrim("dbDriverName"));
				connStringClass.setDbUid(root.getChild("DatabaseVSB").getChildTextTrim("dbUser"));
				connStringClass.setDbPwd(root.getChild("DatabaseVSB").getChildTextTrim("dbPassword"));
				connStringClass.setDbUri(root.getChild("DatabaseVSB").getChildTextTrim("dbURI"));
				return connStringClass;
			}
			
			

		} catch (IOException e) {
			e.printStackTrace();
			return null;
			
		} catch (JDOMException JDom) {
			return null;
		}
		return null;
	}

}
