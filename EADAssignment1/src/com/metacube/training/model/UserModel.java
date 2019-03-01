package com.metacube.training.model;

/**
 * UserModel used to create entity of user
 * @author admin
 *
 */
public class UserModel extends BaseEntity {

	private String name;
	private String mobileNo;
	private String emailAddress;

	public UserModel() {
		super();
	}

	public UserModel(int id, String name, String mobileNo, String emailAddress) {
		super(id);
		this.name = name;
		this.mobileNo = mobileNo;
		this.emailAddress = emailAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

}
