package org.campus02.io;

public class Adress {
private String firstane;
private String lastname;
private String mobilNumber;
private String email;

public Adress(String firstane, String lastname, String mobilNumber, String email) {
	super();
	this.firstane = firstane;
	this.lastname = lastname;
	this.mobilNumber = mobilNumber;
	this.email = email;
}

public String getFirstane() {
	return firstane;
}

public void setFirstane(String firstane) {
	this.firstane = firstane;
}

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

public String getMobilNumber() {
	return mobilNumber;
}

public void setMobilNumber(String mobilNumber) {
	this.mobilNumber = mobilNumber;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

@Override
public String toString() {
	return "Adress [firstane=" + firstane + ", lastname=" + lastname + ", mobilNumber=" + mobilNumber + ", email="
			+ email + "]";
}






}
