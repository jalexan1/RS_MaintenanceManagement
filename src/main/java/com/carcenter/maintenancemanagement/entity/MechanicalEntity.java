package com.carcenter.maintenancemanagement.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* Class that represent the table "MECANICO" of the data base
* @author JhonT
* @version 1.0
*/

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="MECANICO")
public class MechanicalEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1132007245849351647L;
	
	/**
	 * Object that store the composite primary key
	 */
	@EmbeddedId
	private Mechanicalid mechanicalid;
	
	@Basic(optional=false)
	@NotNull
	@Size(min=1, max=30, message="El primer nombre tiene que tener entre 1 y 30 caracteres")
	@Column(name = "primer_nombre")
	private String firstName;
	
	@Basic(optional=true)
	@Size(max=30)
	@Column(name = "segundo_nombre")
	private String secondName;
	
	@Basic(optional=false)
	@NotNull
	@Size(min=1, max=30)
	@Column(name="primer_apellido")
	private String firstSurname;
	
	@Basic(optional=true)
	@Size(max=30)
	@Column(name="segundo_apellido")
	private String secondSurname;
	
	@Basic(optional=false)
	@NotNull
	@Size(max=10)
	@Column(name="celular")
	private String mobile;
	
	@Basic(optional=false)
	@NotNull
	@Size(max=200)
	@Column(name="direccion")
	private String direction;
	
	@Basic(optional=false)
	@NotNull
	@Size(max=100)
	@Column(name="email")
	private String emailElectronic;
	
	@Basic(optional=false)
	@NotNull
	@Size(min=1, max=1)
	@Column(name="estado")
	private String State;
}
