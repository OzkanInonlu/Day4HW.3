package Entities;

import java.time.LocalDate;

public class Player {
	
	private int playerId;
	private String firstName;
	private String lastName;
	private String nationalityId;
	private LocalDate dateOfbirth;
	
	public Player(int playerId, String firstName, String lastName, String nationalityId, LocalDate dateOfbirth) {
		this.playerId = playerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.dateOfbirth = dateOfbirth;
	}
	
	public int getId() {
		return playerId;
	}
	public void setId(int playerId) {
		this.playerId = playerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	public LocalDate getDateOfbirth() {
		return dateOfbirth;
	}
	public void setDateOfbirth(LocalDate dateOfbirth) {
		this.dateOfbirth = dateOfbirth;
	}

}
