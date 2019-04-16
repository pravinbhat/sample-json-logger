package com.bhat.pravin.learn.logback.json;

import java.util.List;

import lombok.Data;
import lombok.NonNull;

@Data
public class Person {
	
	@NonNull private String name;
	@NonNull private Double salary;
	@NonNull private List<Contact> contacts; 

}
