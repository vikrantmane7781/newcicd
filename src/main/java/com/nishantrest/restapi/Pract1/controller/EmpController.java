package com.nishantrest.restapi.Pract1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nishantrest.restapi.Pract1.model.EmpM;
import com.nishantrest.restapi.Pract1.service.EmpService;

@RestController
public class EmpController {
	
	@Autowired
	private EmpService eServe;
	
	@GetMapping("/em")
	public List<EmpM>getData(){
		return eServe.getDataAllll();
	}
	
	@GetMapping("/em/{id}")
	public EmpM getById(@PathVariable long id) {
		return eServe.getEmpById(id);
	}
	
	@PostMapping("/em")
	public EmpM addNewData(@RequestBody EmpM ter) {
		return eServe.addNewData(ter);
	}
	
	@PutMapping("/em/{id}")
	public EmpM updateData(@PathVariable long id,@RequestBody EmpM jik) {
		jik.setId(id);
		return eServe.updateData(jik);
	}
	
	@DeleteMapping("/em")
	public void dataDelete(@RequestParam long id) {
		 eServe.dataDeleter(id);
	}
}
