package com.insuranceModel;

public class User {

		private int userId;
		private String firstnam;
		private String lastname;
		private String emailId;
		private String MobileNo;
		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
		public String getFirstnam() {
			return firstnam;
		}
		public void setFirstnam(String firstnam) {
			this.firstnam = firstnam;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		public String getMobileNo() {
			return MobileNo;
		}
		public void setMobileNo(String mobileNo) {
			MobileNo = mobileNo;
		}
		@Override
		public String toString() {
			return "User [userId=" + userId + ", firstnam=" + firstnam + ", lastname=" + lastname + ", emailId=" + emailId
					+ ", MobileNo=" + MobileNo + "]";
	}

}
