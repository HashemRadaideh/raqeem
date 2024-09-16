package com.raqeem;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class App {
	public static void main(String[] args) {
		try {
			// Create an ObjectMapper instance
			ObjectMapper objectMapper = new ObjectMapper();

			// Create a Person object
			Person person = new Person("John Doe", 30);

			// Write the Person object to a JSON file
			File jsonFile = new File("person.json");
			objectMapper.writeValue(jsonFile, person);
			System.out.println("Person object written to file: person.json");

			// Read the Person object from the JSON file
			Person deserializedPerson = objectMapper.readValue(jsonFile, Person.class);
			System.out.println("Person object read from file: " + deserializedPerson);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
