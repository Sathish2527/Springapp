package com.health.yatra.insurance.yatra.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="address")
public class Address {
	@GeneratedValue
	@Id
	private int AddressID;
	private String addressline1;
	private String addressline2;
	private String country;
	private String state;
	private String pincode;
	

}
