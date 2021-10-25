package org.tendo.patientfeedback.models;

import java.io.Serializable;

public class Message implements Serializable {

	public Message() {
		
	}
	
	public Message(String code, String text) {
		this.code = code;
		this.message = text;
	}
private String code;
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}

private String message;
public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}
}

