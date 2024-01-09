package com.health.yatra.insurance.yatra.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Table(name="subscribe")
public class Subscribe {
	@Id
	@GeneratedValue
	private int subscriberID;
	private String Accnumber;
	private String Name;
	private int Age;
	private String Date_of_Birth;
	private String Mobilenumber;
	private String emailID;
	public Subscribe() {
	
		// TODO Auto-generated constructor stub
	}
	 
	
}
