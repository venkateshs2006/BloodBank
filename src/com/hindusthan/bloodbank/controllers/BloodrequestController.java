package com.hindusthan.bloodbank.controllers;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hindusthan.bloodbank.form.BloodRequest;

@Controller
@RequestMapping("/bloodrequestform.html")
public class BloodrequestController {
	@Autowired
	private BloodrequestValidation bloodrequestValidation;

	public void setBloodrequestValidation(
			BloodrequestValidation bloodrequestValidation) {
		this.bloodrequestValidation = bloodrequestValidation;
	}

	// Display the form on the get request
	@RequestMapping(method = RequestMethod.GET)
	public String showBloodRequest(Map model) {
		BloodRequest bloodrequest = new BloodRequest();
		model.put("bloodrequest", bloodrequest);
		return "bloodrequestform";
	}

	// Process the form.
	@RequestMapping(method = RequestMethod.POST)
	public String processBloodRequest(@Valid BloodRequest bloodrequest,
			BindingResult result,Map model) {
		// set custom Validation by user
		bloodrequestValidation.validate(bloodrequest, result);
		model.put("bloodrequest", bloodrequest);
		if (result.hasErrors()) {
			return "bloodrequestform";
		}
		return "bloodrequestsuccess";
	}
}
