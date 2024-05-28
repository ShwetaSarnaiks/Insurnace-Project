package com.insuranceModel;

public class Policices {
	private int policyNumber;
	private int policyId;
	private String policyName;
	private String policyStatus;
	public int getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public String getPolicyStatus() {
		return policyStatus;
	}
	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
	}
	@Override
	public String toString() {
		return "Policices [policyNumber=" + policyNumber + ", policyId=" + policyId + ", policyName=" + policyName
				+ ", policyStatus=" + policyStatus + "]";
	}
	
	
}