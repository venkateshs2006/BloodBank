package com.hindusthan.bloodbank.controllers;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hindusthan.bloodbank.form.Contact;

@Controller
@RequestMapping("/contactform.html")
public class ContactController {
	@Autowired
	private ContactValidation contactValidation;

	public void setContactValidation(ContactValidation contactValidation) {
		this.contactValidation = contactValidation;
	}

	// Display the form on the get request
	@RequestMapping(method = RequestMethod.GET)
	public String showContact(Map model) {
	 Contact contact=new Contact();
		model.put("contact", contact);
		return "contactform";
	}

	// Process the form.
	@RequestMapping(method = RequestMethod.POST)
	public String processBloodRequest(@Valid Contact contact,
			BindingResult result, Map model) {
		// set custom Validation by user
		contactValidation.validate(contact, result);
		model.put("contact", contact);
		if (result.hasErrors()) {
			return "contactform";
		}
		return "contactsuccess";
	}
}
