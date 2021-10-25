package org.tendo.patientfeedback.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tendo.patientfeedback.service.PatientFeedbackService;

import org.tendo.patientfeedback.models.PFRequest;
import org.tendo.patientfeedback.models.Response;

//import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/v1/patientfeedback")
public class PatientFeedbackController {
	
	@Autowired
    PatientFeedbackService patientFeedbackService;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE,path="/add")
    public ResponseEntity<Response> addPatientFeedback(@Valid @RequestBody PFRequest patientFeedbackReq) {
        Response patientFeedbackRes = patientFeedbackService.createPatientFeedback(patientFeedbackReq);
        return new ResponseEntity<>(patientFeedbackRes, HttpStatus.CREATED);
    }
}
