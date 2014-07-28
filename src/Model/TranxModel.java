package Model;

import java.util.Date;

public class TranxModel {
	private long tranxID;
	private int ttId;
	private String description;
	private Date dateDone;
	public long getTranxID() {
		return tranxID;
	}
	public void setTranxID(long tranxID) {
		this.tranxID = tranxID;
	}
	public int getTtId() {
		return ttId;
	}
	public void setTtId(int ttId) {
		this.ttId = ttId;
	}
	public TranxModel(long tranxID, int ttId, String description, Date dateDone) {
				this.tranxID = tranxID;
		this.ttId = ttId;
		this.description = description;
		this.dateDone = dateDone;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDateDone() {
		return dateDone;
	}
	public void setDateDone(Date dateDone) {
		this.dateDone = dateDone;
	}
	
	

}
