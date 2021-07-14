/**
 * 
 */
package com.carcenter.maintenancemanagement.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.carcenter.maintenancemanagement.dto.ifx.DefaultIfx;

/**
 * 
 * 
 * @author JhonT 
 *
 */
@Repository
@Transactional
public class ServiceManteintenanceRepository {

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Method that search the default list
	 * 
	 * @author JhonT
	 * @return List<DefaultIfx>
	 */
	public List<DefaultIfx> findDefaults() {

		// @formatter:off
		Query query = entityManager.createNativeQuery("Select me.documento, me.primer_nombre, sum(sm.tiempo_estimado)\r\n"
				+ "from MECANICO me, MANTENIMIENTO ma, SERVICIOS_X_MANTENIMIENTOS sm \r\n"
				+ "WHERE me.documento = ma.mec_documento\r\n"
				+ "AND sm.cod_mantenimiento = ma.codigo\r\n"
				+ "Group by me.documento,  me.primer_nombre\r\n"
				+ "ORDER BY 3 asc");
		// @formatter:on
		
		List<DefaultIfx> defaultIfxs = new ArrayList<>();
		
		List<Object[]> row = query.getResultList();
		
		for (Object[] objects : row) {

			defaultIfxs
			.add(new DefaultIfx(
								(String) objects[0].toString(),
								(String) objects[1].toString(),
								(String) objects[2].toString()
								));
		}
		
		return defaultIfxs;
	}

}
