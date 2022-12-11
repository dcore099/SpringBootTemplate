package com.example.service;

import org.springframework.stereotype.Service;

@Service
public interface IbasicUserService {
	
	 /*
	 * Llama el procedimiento almacenado usando un repositorio JPA
	 * @param param1
	 * @param param2
	 * @return
	 */
	public String getData(String param1, String param2);

}
