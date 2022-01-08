package com.univ.controller;

import java.util.List;

import com.univ.model.Applicant;
import com.univ.repository.UpdateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/putExample")
public class ApplicantController{
	
	@Autowired
	public UpdateRepository updateRepository;
	
	@ResponseBody
	@RequestMapping("/getapplicant_status")
	public List<Applicant> getapplicant_status(){
		List<Applicant> Applicant = updateRepository.getapplicant_status();
		return Applicant;
	}
	
	@GetMapping("/getAllApplicant")
	public List<Applicant> getAllApplicant(){
		return updateRepository.findAll();
		
	}
	
	@RequestMapping(value="/updateApplicant",method=RequestMethod.PUT)
	public Applicant updateApplicant(@RequestBody Applicant applicant) {
		return updateRepository.save(applicant);
	}
	
	@GetMapping("/caughtException")
	public Applicant getCaughtException(@RequestParam(value="number") Integer Num) {
		return UpdateRepository.getCaughtException(Num);
	}
}