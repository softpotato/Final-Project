package main;

import elements.*;
import java.util.ArrayList;

public class Room {
	private ArrayList<Option> questions;
	private ArrayList<Entity> entities;
	
	public Room() {
		questions = new ArrayList<Option>();
		entities = new ArrayList<Entity>();
	}
	
	public Room(ArrayList<Option> questions,ArrayList<Entity> entities) {
		this.questions = questions;
		this.entities = entities;
	}
	
	public ArrayList<Option> getQuestions() {
		return questions;
	}
	
	public ArrayList<Entity> getEntities() {
		return entities;
	}
	
	public void addQuestion(String text) {
		String[] temp = text.split(":");
		// Going to be split in 2, one is prompt and the rest are choices
		// Choices are going to be stored in this format, <choice string>-<choice result int>;
		String[] choiceText = temp[1].split(";");
		Choice[] choices = new Choice[choiceText.length];
		for (int index = 0;index < choices.length - 1;index++) {
			choices[index] = new Choice(choiceText[index]);
		}
		questions.add(new Option(temp[0],choices,Integer.parseInt(temp[2])));
	}
	
}
