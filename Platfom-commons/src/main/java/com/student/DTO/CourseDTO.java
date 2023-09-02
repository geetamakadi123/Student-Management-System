package com.student.DTO;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseDTO {

	private Integer courseId;
	
	@NotNull(message = "courseName cannot be Null")
	private String courseName;
	
	@NotNull(message = "description cannot be Null")
	private String description;
	
	@NotNull(message = "description cannot be Null")
	private String courseType;
	
	@NotNull(message = "description cannot be Null")
	private String duration;
	
	@NotNull(message = "description cannot be Null")
	private String topics;
	
}
