package com.student.DTO;

import java.time.LocalDate;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class StudentAddressDTO {

	private Integer studentId;
	private LocalDate dob;
	//private Address address;
}
