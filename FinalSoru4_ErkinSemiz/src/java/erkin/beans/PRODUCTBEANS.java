package erkin.beans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;


@Named(value = "PRODUCTBEANS")
@SessionScoped
public class PRODUCTBEANS implements Serializable {
	
	private int PRODUCT_ID;
	private int MANUFACTURER_ID;
	private int PRODUCT_CODE;
	private int PURCHASE_COST;
	private int QUANTITY_ON_HAND;
	private int MARKUP;
	private String AVAILABLE;
	private String DESCRIPTION;
	public int getPRODUCT_ID() {
		return PRODUCT_ID;
	}
	public void setPRODUCT_ID(int pRODUCT_ID) {
		PRODUCT_ID = pRODUCT_ID;
	}
	public int getMANUFACTURER_ID() {
		return MANUFACTURER_ID;
	}
	public void setMANUFACTURER_ID(int mANUFACTURER_ID) {
		MANUFACTURER_ID = mANUFACTURER_ID;
	}
	public int getPRODUCT_CODE() {
		return PRODUCT_CODE;
	}
	public void setPRODUCT_CODE(int pRODUCT_CODE) {
		PRODUCT_CODE = pRODUCT_CODE;
	}
	public int getPURCHASE_COST() {
		return PURCHASE_COST;
	}
	public void setPURCHASE_COST(int pURCHASE_COST) {
		PURCHASE_COST = pURCHASE_COST;
	}
	public int getQUANTITY_ON_HAND() {
		return QUANTITY_ON_HAND;
	}
	public void setQUANTITY_ON_HAND(int qUANTITY_ON_HAND) {
		QUANTITY_ON_HAND = qUANTITY_ON_HAND;
	}
	public int getMARKUP() {
		return MARKUP;
	}
	public void setMARKUP(int mARKUP) {
		MARKUP = mARKUP;
	}
	public String isAVAILABLE() {
		return AVAILABLE;
	}
	public void setAVAILABLE(String aVAILABLE) {
		AVAILABLE = aVAILABLE;
	}
	public String getDESCRIPTION() {
		return DESCRIPTION;
	}
	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
	}

}
