package com.carcenter.maintenancemanagement.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* Class that represent the table "MANTENIMIENTO" of the data base
* @author JhonT
* @version 1.0
*/

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="MANTENIMIENTO")
public class MaintenanceEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1132007245849351647L;
	
	/**
	 * Object that store the composite primary key
	 */
	@Id
	@SequenceGenerator(sequenceName = "SEQ_ID_MTO", allocationSize = 1, name = "SEQ_ID_MTO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ID_MTO")
	@Column(name="codigo")
	private Integer code;
	
	@Column(name = "estado")
	private Integer state;
	
	@Basic(optional=false)
	@NotNull
	@Size(max=6, message="El codigo debe tener hasta 6 caracteres")
	@Column(name = "cod_placa")
	private String plaqueCode;
	
	@Column(name = "fecha", nullable = false)
	private LocalDate registerDate;
	
	@ManyToOne
    @JoinColumns({
        @JoinColumn(
            name = "mec_tipo_documento",
            referencedColumnName = "tipo_documento"),
        @JoinColumn(
            name = "mec_documento",
            referencedColumnName = "documento")
    })
    private MechanicalEntity mechanicalEntity;
	
}
