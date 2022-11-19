package com.example.repository;
/*
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
*/

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class StoredProcedureRepository {
	final static Logger logger = Logger.getLogger(StoredProcedureRepository.class);
	/*
	@Autowired
	private EntityManager em;
	
/**
 * Calls one stored procedure from this repository
 * @param param1
 * @param param2
 * @return
 */
	/*
	public String callProcedure(String param1, String param2) {
		String out="No data from store procedure..";
		
		StoredProcedureQuery query = this.em.createNamedStoredProcedureQuery("SR.PROCEDURE_NAME");
		
		//	Declare IN/OUT parameters from our store procedure
		query.registerStoredProcedureParameter("entrada_1_proc", String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter("entrada_2_proc", String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter("valor_salida_proc", String.class, ParameterMode.OUT);
		
		//	Initialize the values for our declared parameters
		query.setParameter("entrada_1_proc", param1);
		query.setParameter("entrada_2_proc", param2);
		
		//	Call the stored procedure and get the output
		out = ((String) query.getOutputParameterValue("Result_Param")).toString();
		logger.info("output: "+out);
		
		return out;
	}
	*/
}
