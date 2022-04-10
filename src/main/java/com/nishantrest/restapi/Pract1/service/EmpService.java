package com.nishantrest.restapi.Pract1.service;

import java.util.List;


import com.nishantrest.restapi.Pract1.model.EmpM;

public interface EmpService {

	List<EmpM>getDataAllll();
	
	EmpM getEmpById(Long id);
	
	EmpM addNewData(EmpM emptye);
	
	EmpM updateData(EmpM emptU);
	
	void dataDeleter(Long id);
}
