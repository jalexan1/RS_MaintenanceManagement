package com.carcenter.maintenancemanagement.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.carcenter.maintenancemanagement.entity.MechanicalEntity;
import com.carcenter.maintenancemanagement.entity.Mechanicalid;

/**
 * Interface IMechanicalRepository
 *
 * Interface de repositorio para la entidad Mechanical.
 * 
 * @author JhonT
 * @version %I%, %G%
 * 
 * */

@Repository
public interface IMechanicalRepository extends CrudRepository<MechanicalEntity, Mechanicalid>{

}
