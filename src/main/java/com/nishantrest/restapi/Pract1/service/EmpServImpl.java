package com.nishantrest.restapi.Pract1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.nishantrest.restapi.Pract1.model.EmpM;
import com.nishantrest.restapi.Pract1.repository.EmpRep;

import java.util.Optional;

@Service
public class EmpServImpl implements EmpService {
	
	@Autowired
	private EmpRep eRep;

	@Override
	public List<EmpM> getDataAllll() {
		return eRep.findAll();
	}

	@Override
	public EmpM getEmpById(Long id) {
		Optional<EmpM>empert=eRep.findById(id);
		if(empert.isPresent()) {
			return empert.get();
		}
		throw new RuntimeException("Id Not found..."+id);
	}

	@Override
	public EmpM addNewData(EmpM emptye) {
		return eRep.save(emptye);
	}

	@Override
	public EmpM updateData(EmpM emptU) {
		return eRep.save(emptU);
	}

	@Override
	public void dataDeleter(Long id) {
		eRep.deleteById(id);
		System.out.print("Data Deleted for id="+id);
		
	}

	
	

}
