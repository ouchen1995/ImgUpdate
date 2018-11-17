package com.example.demo.Entities;

import java.util.Date;

public class State {
	
	Date date ;
	String Etat ;
	public State() {
	}
	
	public State(Date date, String etat) {
		super();
		this.date = date;
		Etat = etat;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getEtat() {
		return Etat;
	}
	public void setEtat(String etat) {
		Etat = etat;
	}
	
	
	
	

	

}
