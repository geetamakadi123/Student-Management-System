package com.student.DTO;

import java.time.LocalDate;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {
	
	private Integer studentId;
	
	@NotNull(message = "name cannot be null")
	private String name;
	
	@NotNull(message = "parentName cannot be null")
	private String parentName;
	
	@Email(message = "Please enter valid emailId")
	private String email;
	
	private String mobileNumber;
	
	private LocalDate dob;
	
	@NotNull(message = "gender cannot be Null")
	private String gender;
	
	
	//private List<Address> address = new ArrayList<>();
	
}
