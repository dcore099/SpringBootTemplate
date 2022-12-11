package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.repository.StoredProcedureRepository;

public class BasicServiceImpl implements IbasicUserService
{
	
	
	@Autowired
	StoredProcedureRepository repo;
	
	public String getData(String param1, String param2) {
		return repo.callProcedure(param1, param2);
	}
	
}
