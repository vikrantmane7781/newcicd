package com.nishantrest.restapi.Pract1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nishantrest.restapi.Pract1.model.EmpM;

public interface EmpRep extends JpaRepository<EmpM,Long> {

}
