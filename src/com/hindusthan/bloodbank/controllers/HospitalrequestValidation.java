package com.hindusthan.bloodbank.controllers;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;


import com.hindusthan.bloodbank.form.HospitalRequest;

@Component("hospitalrequestValidator")
public class HospitalrequestValidation {
	public boolean supports(Class<?> klass) {
		return HospitalRequest.class.isAssignableFrom(klass);
	}

	public void validate(Object target, Errors errors) {
		HospitalRequest hospitalrequest = (HospitalRequest) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "hospitalName",
				"NotEmpty.hospitalrequest.hospitalName",
				"User Name must not be Empty.");
		String userName = hospitalrequest.getHospitalName();
		if ((userName.length()) > 50) {
			errors.rejectValue("hospitalName",
					"lengthOfUser.hospitalrequest.requesterName",
					"User Name must not more than 50 characters.");
		}
		
	}
}
