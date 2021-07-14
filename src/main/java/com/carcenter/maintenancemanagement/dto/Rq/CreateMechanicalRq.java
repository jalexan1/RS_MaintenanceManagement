package com.carcenter.maintenancemanagement.dto.Rq;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

//import com.carcenter.maintenancemanagement.dto.MechanicalDTO;
import com.fasterxml.jackson.annotation.JsonInclude;
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

@ApiModel(value = "CreateMechanicalRq", description = "Información administracion del mecánico")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateMechanicalRq {
	
	@ApiModelProperty(notes = "tipo de documento del mecanico", required = true, example = "CC")
	@NotEmpty(message="El tipo de documento es obligatorio")
	@Size(max=2, message="El tipo de documento tiene que tener entre 1 y 2 caracteres")
	@Pattern(regexp = "[a-zA-Z]+", message="El tipo de documento solo puede tener letras")
	@JsonProperty("TypeDocument")
	private String typeDocument;
	
	@ApiModelProperty(notes = "Documento del mecanico", required = true, example = "1144048206")
	@NotNull(message="El número de documento es obligatorio")
	@JsonProperty("Document")
	private Long document;
	
	@ApiModelProperty(notes = "Primer nombre del mecánico", required = true, example = "Juan")
	@NotEmpty(message="El primer nombre es obligatorio")
	@Size(max=30, message="El primer nombre tiene que tener entre 1 y 30 caracteres")
	@Pattern(regexp = "[a-zA-Z]+", message="El primer nombre solo puede tener letras")
	@JsonProperty("FirstName")
	private String firstName;
	
	@ApiModelProperty(notes = "Segundo nombre del mecánico", required = false, example = "Carlos")
	@Size(max = 30, message="El segundo nombre puede tener hasta 30 caracteres")
	@JsonProperty("SecondName")
	private String secondName;
	
	@ApiModelProperty(notes = "Primer apellido del mecánico", required = true, example = "Valdez")
	@NotEmpty(message="El primer apellido es obligatorio")
	@Size(max=30, message="El primer apellido tiene que tener entre 1 y 30 caracteres")
	@JsonProperty("FirstSurname")
	private String firstSurname;
	
	@ApiModelProperty(notes = "Segundo apellido del mecánico", required = false, example = "Duque")
	@Size(max = 30, message="El segundo apellido puede tener hasta 30 caracteres")
	@JsonProperty("SecondSurname")
	private String secondSurname;
	
	@ApiModelProperty(notes = "Número de celular", required = true, example = "3193037038")
	@NotEmpty(message="El número de celular es obligatorio")
	@Size(max = 10, message="El número de celular puede tener hasta 10 caracteres")
	@JsonProperty("Mobile")
	private String mobile;
	
	@ApiModelProperty(notes = "Dirección del mecánico", required = true, example = "Cra 49a #76 - 15")
	@NotEmpty(message="La dirección es obligatorio")
	@Size(max = 200, message="La dirección puede tener hasta 200 caracteres")
	@JsonProperty("Direction")
	private String direction;
	
	@ApiModelProperty(notes = "Correo electrónico del mecánico", required = true, example = "jalexan1@hotmail.com")
	@NotEmpty(message="El correo electrónico es obligatorio")
	@Size(max = 100, message="El correo electrónico puede tener hasta 100 caracteres")
	@Email(message="El correo electrónico no es valido, ejemplo correo valido: jalexan1@hotmail.com")
	@JsonProperty("EmailElectronic")
	private String emailElectronic;
	
	@ApiModelProperty(notes = "Estado del registro almacenado en base de datos Activo(A) o Inactivo(I)", required = true, example = "A")
	@NotEmpty(message="El estado del mecánico obligatorio")
	@Size(max = 1, message="El estado del mecánico puede tener hasta 1 caracter")
	@JsonProperty("State")
	private String state;
}
