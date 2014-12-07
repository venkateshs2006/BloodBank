package com.hindusthan.bloodbank.controllers;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.hindusthan.bloodbank.form.HospitalRequest;


@Controller
@RequestMapping("/hospitalrequestform.html")
public class HospitalrequestController {
	@Autowired
	private HospitalrequestValidation hospitalrequestValidation; 

	
	public void setHospitalrequestValidation(
			HospitalrequestValidation hospitalrequestValidation) {
		this.hospitalrequestValidation = hospitalrequestValidation;
	}

	// Display the form on the get request
	@RequestMapping(method = RequestMethod.GET)
	public String showHospitalRequest(Map model) {
		HospitalRequest hospitalrequest = new HospitalRequest();
		model.put("hospitalrequest", hospitalrequest);
		return "hospitalrequestform";
	}

	// Process the form.
	@RequestMapping(method = RequestMethod.POST)
	public String processHospitalRequest(@Valid HospitalRequest hospitalrequest,
			BindingResult result,Map model) {
		// set custom Validation by user
		hospitalrequestValidation.validate(hospitalrequest, result);
		System.out.println(hospitalrequest.getHospitalName());
		model.put("hospitalrequest", hospitalrequest);
		if (result.hasErrors()) {
			return "hospitalrequestform";
		}
		return "hospitalrequestsuccess";
	}
}
