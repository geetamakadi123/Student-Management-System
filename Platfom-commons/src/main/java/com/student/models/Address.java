package com.student.models;


import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer addressId;
	
	@NotNull(message = "area cannot be null")
	@NotEmpty(message = "area cannot be empty")
	private String area;
	

	@NotNull(message = "city cannot be null")
	@NotEmpty(message = "city cannot be empty")
	private String city;
	
	@NotNull(message = "state cannot be null")
	@NotEmpty(message = "state cannot be empty")
	private String state;
	
	@NotNull(message = "district cannot be null")
	@NotEmpty(message = "district cannot be empty")
	private String district;
	
	@NotNull(message = "pincode cannot be null")
	@NotEmpty(message = "pincode cannot be empty")
	private String pincode;
	

	private Address addressType;
	
}

