package com.tempo.api.model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name="USER_A")

public class User {

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", firstName=" + firstName + ", lastName=" + lastName + ", displayName="
				+ displayName + ", location=" + location + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(displayName, firstName, lastName, location, userID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(displayName, other.displayName) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName) && Objects.equals(location, other.location)
				&& Objects.equals(userID, other.userID);
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long userID;
	
	public User(Long userID, String firstName, String lastName, String displayName, String location) {
		super();
		this.userID = userID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.displayName = displayName;
		this.location = location;
	}

	public User(String firstName, String lastName, String displayName, String location) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.displayName = displayName;
		this.location = location;
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
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

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	private String firstName;
	
	private String lastName;

	private String displayName; 

	private String location;
}
