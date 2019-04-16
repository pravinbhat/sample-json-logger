package com.bhat.pravin.learn.logback.json;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;

import net.logstash.logback.argument.StructuredArguments;

public class App {

	private static Logger LOG = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) throws JsonProcessingException {
		LOG.info("STARTING THE APPLICATION");
		List<Contact> contacts = new ArrayList<>();

		Contact c1 = new Phone(704, 8580781);
		contacts.add(c1);

		c1 = new Phone(704, 8580782);
		contacts.add(c1);

		Person p = new Person("Pravin Bhat", 42.0, contacts);
		LOG.info("Boot FINISHED");
		LOG.info("Person is ", StructuredArguments.fields(p));

		Map values = new HashMap();
		values.put("address", "9798 Ravenscroft LN NW, Concrd, NC 28017");
		values.put("salary", 1245.65);
		values.put("isMale", true);
		values.put("Kids", Arrays.asList("Arpit", "Kripa"));
		LOG.info("Map is ", StructuredArguments.entries(values));
		LOG.info("APPLICATION FINISHED");
	}

}
