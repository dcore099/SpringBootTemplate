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
		String salida="Sin datos del procedimiento almacenado..";
		
		StoredProcedureQuery query = this.em.createNamedStoredProcedureQuery("SR.PROCEDURE_NAME");
		
		//	Registramos los parametros de entrada y salida
		query.registerStoredProcedureParameter("entrada_1_proc", String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter("entrada_2_proc", String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter("valor_salida_proc", String.class, ParameterMode.OUT);
		
		//	Inicializamos los parametros para llamar el procedimiento almacenado
		query.setParameter("entrada_1_proc", param1);
		query.setParameter("entrada_2_proc", param2);
		
		//	Llamamos el procedimiento almacenado y tomamos la salida
		salida = ((String) query.getOutputParameterValue("Result_Param")).toString();
		logger.info("valor de salida: "+salida);
		
		return salida;
	}
	*/
}
