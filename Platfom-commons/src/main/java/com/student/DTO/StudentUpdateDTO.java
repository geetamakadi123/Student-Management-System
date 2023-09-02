package com.student.DTO;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentUpdateDTO {
	
	private Integer studentId;
	private LocalDate dob;
	
	@Email(message = "Please enter a valid email")
	private String newEmail;
	
	private String mobileNumber;
	
	
}
