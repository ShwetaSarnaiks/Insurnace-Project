package com.insuranceModel;

public class PolicyPremium {
	
	private int premiumamount;
	private String premiunmtype;
	public int getPremiumamount() {
		return premiumamount;
	}
	public void setPremiumamount(int premiumamount) {
		this.premiumamount = premiumamount;
	}
	public String getPremiunmtype() {
		return premiunmtype;
	}
	public void setPremiunmtype(String premiunmtype) {
		this.premiunmtype = premiunmtype;
	}
	@Override
	public String toString() {
		return "PolicyPremium [premiumamount=" + premiumamount + ", premiunmtype=" + premiunmtype + "]";
	}
	
	

}
