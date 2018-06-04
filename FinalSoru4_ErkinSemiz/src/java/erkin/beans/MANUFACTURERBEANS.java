package erkin.beans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;


@Named(value = "MANUFACTURERBEANS")
@SessionScoped
public class MANUFACTURERBEANS implements Serializable {
	

	private int MANUFACTURER_ID;
	private String NAME;
	private String ADDRESSLINE1;
	private String ADDRESSLINE2;
	private String CITY;
	private String STATE;
	private String EMAIL;
	private String ZIP;
	private String PHONE;
	private String FAX;
	public int getMANUFACTURER_ID() {
		return MANUFACTURER_ID;
	}
	public void setMANUFACTURER_ID(int mANUFACTURER_ID) {
		MANUFACTURER_ID = mANUFACTURER_ID;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getADDRESSLINE1() {
		return ADDRESSLINE1;
	}
	public void setADDRESSLINE1(String aDDRESSLINE1) {
		ADDRESSLINE1 = aDDRESSLINE1;
	}
	public String getADDRESSLINE2() {
		return ADDRESSLINE2;
	}
	public void setADDRESSLINE2(String aDDRESSLINE2) {
		ADDRESSLINE2 = aDDRESSLINE2;
	}
	public String getCITY() {
		return CITY;
	}
	public void setCITY(String cITY) {
		CITY = cITY;
	}
	public String getSTATE() {
		return STATE;
	}
	public void setSTATE(String sTATE) {
		STATE = sTATE;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public String getZIP() {
		return ZIP;
	}
	public void setZIP(String zIP) {
		ZIP = zIP;
	}
	public String getPHONE() {
		return PHONE;
	}
	public void setPHONE(String pHONE) {
		PHONE = pHONE;
	}
	public String getFAX() {
		return FAX;
	}
	public void setFAX(String fAX) {
		FAX = fAX;
	}
	
	
}
