package com.emc.entities;

public class Participant extends EMBase {

//	public long id;
//	public String name;
	private String email;
	private boolean checkedIn;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isCheckedIn() {
		return checkedIn;
	}

	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
}
