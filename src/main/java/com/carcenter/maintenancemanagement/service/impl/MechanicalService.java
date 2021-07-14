package com.carcenter.maintenancemanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.carcenter.maintenancemanagement.dto.Rq.CreateMechanicalRq;
import com.carcenter.maintenancemanagement.dto.ifx.DefaultIfx;
import com.carcenter.maintenancemanagement.entity.MechanicalEntity;
import com.carcenter.maintenancemanagement.repository.IMechanicalRepository;
import com.carcenter.maintenancemanagement.repository.ServiceManteintenanceRepository;
import com.carcenter.maintenancemanagement.service.IMechanicalService;
import com.carcenter.maintenancemanagement.util.MechanicalMapper;


@Service
public class MechanicalService implements IMechanicalService{
	
	@Autowired
	IMechanicalRepository iMechanicalRepository;
	
	@Autowired
	MechanicalMapper mechanicalMapper;
	
	@Autowired
	ServiceManteintenanceRepository serviceManteintenanceRepository;
	
	@Override
	public Long createMechanical(CreateMechanicalRq createMechanicalRq) {
		Long res = createMapMechanical(createMechanicalRq);
		return res;
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Long createMapMechanical(CreateMechanicalRq createMechanicalRq) 
	{
		MechanicalEntity mechanicalEntity = mechanicalMapper.createMechanicalRQ(createMechanicalRq);
		return iMechanicalRepository.save(mechanicalEntity).getMechanicalid().getDocument();
	}
	
	@Override
	public  Iterable<MechanicalEntity> findByAll() {
		
		return iMechanicalRepository.findAll();
	}
	
	@Override
	public List<DefaultIfx> getDefaults() {
		for(DefaultIfx df: serviceManteintenanceRepository.findDefaults()) {
			System.out.println("Doc:"+df.getDocument());
		}
		return serviceManteintenanceRepository.findDefaults();
	}
	
}
