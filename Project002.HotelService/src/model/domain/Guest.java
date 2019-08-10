package model.domain;

import lombok.Data;

@Data
public class Guest {
	private String lastname;
	private int room;
	private int stay;
	private int person;
	
	public Guest(String lastname, int room, int stay, int person) {
		super();
		this.lastname = lastname;
		this.room = room;
		this.stay = stay;
		this.person = person;
	}
	
	
	

}
