package com.hindusthan.bloodbank.controllers;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import com.hindusthan.bloodbank.form.Contact;


@Component("contactValidator")
public class ContactValidation {
	public boolean supports(Class<?> klass) {
		return Contact.class.isAssignableFrom(klass);
	}

	public void validate(Object target, Errors errors) {
		Contact contact = (Contact) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName",
				"NotEmpty.contact.userName",
				"User Name must not be Empty.");
		String userName = contact.getUserName();
		if ((userName.length()) > 50) {
			errors.rejectValue("userName",
					"lengthOfUser.contact.userName",
					"User Name must not more than 50 characters.");
		}
		
	}
}
