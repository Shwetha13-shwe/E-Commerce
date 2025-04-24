package com.jsp.ecommerce.dto;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class UserDto {
   @Size(min=5,max=15,message="Name should be 5~15 Characters")
	private String name;
   @NotEmpty(message="email is Required")
   @Email(message="check email format")
	private String email;
   @Pattern(regexp = "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$", message = "Password should contain one uppercase, lowercase, number and special charecter")
	private String password;
   @Pattern(regexp = "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$", message = "Password should contain one uppercase, lowercase, number and special charecter")
	private String confirmPassword;
   @AssertTrue (message="Check terms and Conditions in order to proceed")
   private boolean terms;
}
