package com.example.demo.Entities;

import org.json.JSONArray;

public class Word {
	
	private String name;
	private int index;
	private int line;
	private JSONArray position;
		
	public Word() {
		super();
	}
	
	public Word(String name, int index, int line, JSONArray position) {
		super();
		this.name = name;
		this.index = index;
		this.line = line;
		this.position = position;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public int getLine() {
		return line;
	}
	public void setLine(int line) {
		this.line = line;
	}
	public JSONArray getPosition() {
		return position;
	}
	public void setPosition(JSONArray position) {
		this.position = position;
	}
	
	

}
