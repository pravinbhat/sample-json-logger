package com.bhat.pravin.learn.logback.json;

import lombok.Data;
import lombok.NonNull;

@Data
public class Phone extends Contact {

	public Phone(Integer areaCode, Integer localNumber) {
		super(ContactType.PHONE);
		this.areaCode = areaCode;
		this.localNumber = localNumber;
	}
	
	@NonNull private Integer areaCode;
	@NonNull private Integer localNumber;
	@NonNull private String phoneNumber;
	
	public String getPhoneNumber() {
		return areaCode + "-" + localNumber;
	}

}
