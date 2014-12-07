package com.hindusthan.bloodbank.controllers;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import com.hindusthan.bloodbank.form.BloodRequest;


@Component("bloodrequestValidator")
public class BloodrequestValidation {
	public boolean supports(Class<?> klass) {
		return BloodRequest.class.isAssignableFrom(klass);
	}

	public void validate(Object target, Errors errors) {
		BloodRequest bloodrequest = (BloodRequest) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "requesterName",
				"NotEmpty.bloodrequest.requesterName",
				"User Name must not be Empty.");
		String userName = bloodrequest.getRequesterName();
		if ((userName.length()) > 50) {
			errors.rejectValue("requesterName",
					"lengthOfUser.bloodrequest.requesterName",
					"User Name must not more than 50 characters.");
		}
		
	}
}
