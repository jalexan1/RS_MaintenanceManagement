package com.carcenter.maintenancemanagement.util;

import org.springframework.stereotype.Component;

import com.carcenter.maintenancemanagement.dto.Rq.CreateMechanicalRq;
import com.carcenter.maintenancemanagement.entity.MechanicalEntity;
import com.carcenter.maintenancemanagement.entity.Mechanicalid;

@Component
public class MechanicalMapper {

	public MechanicalEntity createMechanicalRQ(CreateMechanicalRq createMechanicalRq) {
		
		MechanicalEntity mechanicalEntity = new MechanicalEntity();
		Mechanicalid mechanicalid = new Mechanicalid(); 
		
		mechanicalid.setTypeDocument(createMechanicalRq.getTypeDocument());
		mechanicalid.setDocument(createMechanicalRq.getDocument());
		
		mechanicalEntity.setMechanicalid(mechanicalid);
		mechanicalEntity.setFirstName(createMechanicalRq.getFirstName());
		mechanicalEntity.setSecondName(createMechanicalRq.getSecondName());
		mechanicalEntity.setFirstSurname(createMechanicalRq.getFirstSurname());
		mechanicalEntity.setSecondSurname(createMechanicalRq.getSecondSurname());
		mechanicalEntity.setMobile(createMechanicalRq.getMobile());
		mechanicalEntity.setDirection(createMechanicalRq.getDirection());
		mechanicalEntity.setEmailElectronic(createMechanicalRq.getEmailElectronic());
		mechanicalEntity.setState(createMechanicalRq.getState());
		
		return mechanicalEntity;
	}

}
