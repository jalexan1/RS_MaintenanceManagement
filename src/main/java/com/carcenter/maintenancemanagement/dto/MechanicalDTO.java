package com.carcenter.maintenancemanagement.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* Class that represent the request for this class "MECANICO"
* @author JhonT
* @version 1.0
*/


@ApiModel(value = "MechanicalDTO", description = "Información en formato IFX de un Mecánico")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class MechanicalDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * Field that store the type Document
	 */	
	@ApiModelProperty(notes = "tipo de documento del mecanico", required = true, example = "CC")
	@JsonProperty("TypeDocument")
	private String typeDocument;
	
	/**
	 * Field that store the document
	 */
	@ApiModelProperty(notes = "Documento del mecanico", required = true, example = "1144048206")
	@JsonProperty("Document")
	private Long document;
	
	
	@ApiModelProperty(notes = "Primer nombre del mecánico", required = true, example = "Juan")
	@JsonProperty("FirstName")
	private String firstName;
	
	@ApiModelProperty(notes = "Segundo nombre del mecánico", required = false, example = "Carlos")
	@JsonProperty("SecondName")
	private String secondName;
	
	@ApiModelProperty(notes = "Primer apellido del mecánico", required = true, example = "Valdez")
	@JsonProperty("FirstSurname")
	private String firstSurname;
	
	@ApiModelProperty(notes = "Segundo apellido del mecánico", required = false, example = "Duque")
	@JsonProperty("SecondSurname")
	private String secondSurname;
	
	@ApiModelProperty(notes = "Número de celular", required = true, example = "3193037038")
	@JsonProperty("Mobile")
	private String mobile;
	
	@ApiModelProperty(notes = "Dirección del mecánico", required = true, example = "Cra 49a #76 - 15")
	@JsonProperty("Direction")
	private String direction;
	
	@ApiModelProperty(notes = "Correo electrónico del mecánico", required = true, example = "jalexan1@hotmail.com")
	@JsonProperty("EmailElectronic")
	private String emailElectronic;
	
	@ApiModelProperty(notes = "Estado del registro almacenado en base de datos Activo(A) o Inactivo(I)", required = true, example = "A")
	@JsonProperty("State")
	private String state;
}
