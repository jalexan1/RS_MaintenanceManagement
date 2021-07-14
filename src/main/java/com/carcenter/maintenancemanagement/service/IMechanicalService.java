package com.carcenter.maintenancemanagement.service;

import java.util.List;

import com.carcenter.maintenancemanagement.dto.Rq.CreateMechanicalRq;
import com.carcenter.maintenancemanagement.dto.ifx.DefaultIfx;
import com.carcenter.maintenancemanagement.entity.MechanicalEntity;


public interface IMechanicalService {

	Long createMechanical(CreateMechanicalRq createMechanicalRq);// throws Exception;
	
	public  Iterable<MechanicalEntity> findByAll();
	
	public List<DefaultIfx> getDefaults();
}
