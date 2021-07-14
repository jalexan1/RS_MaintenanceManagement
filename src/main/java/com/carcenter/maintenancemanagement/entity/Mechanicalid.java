package com.carcenter.maintenancemanagement.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
**Class that represent the primary key of the table "MECANICO" of the data base
* @author JhonT
* @version 1.0
*/

@Embeddable
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@EqualsAndHashCode
public class Mechanicalid implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8360906980184989040L;
	
	/**
	 * Field that store the type Document
	 */	
	@NotNull(message="El tipo de documento es obligatorio")
	@Size(min=1, max=2, message="El tipo de documento tiene que tener entre 1 y 2 caracteres")
	@Column(name = "tipo_documento")
	private String typeDocument;
	
	/**
	 * Field that store the document
	 */
	@NotNull(message="El número de documento es obligatorio")
	@Column(name = "documento")
	private Long document;
}
