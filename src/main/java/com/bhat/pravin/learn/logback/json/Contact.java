package com.bhat.pravin.learn.logback.json;

import lombok.Data;
import lombok.NonNull;

@Data
public class Contact {
	@NonNull private ContactType contactType;
}
