package com.carcenter.maintenancemanagement.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* Class that represent the table "SERVICIOS" of the data base
* @author JhonT
* @version 1.0
*/

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="SERVICIOS")
public class ServicesEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1132007245849351648L;

	@Id
	@SequenceGenerator(sequenceName = "SEQ_ID_SERVICIO", allocationSize = 1, name = "SEQ_ID_SERVICIO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ID_SERVICIO")
	@Column(name="codigo")
	private Integer code;
	
	@Basic(optional=false)
	@NotNull
	@Size(max=100, message="El nombre del servicio tiene que tener entre 1 y 100 caracteres")
	@Column(name = "nombre_servicio")
	private String serviceName;
	
	@NotNull(message="El precio es obligatorio")
	@Column(name = "precio")
	private Double price;
	
}
