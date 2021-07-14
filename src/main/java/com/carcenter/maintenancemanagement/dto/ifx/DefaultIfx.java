/**
 * 
 */
package com.carcenter.maintenancemanagement.dto.ifx;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class that represent the object default of response 
 * 
 * @author JhonT - 
 * @version %I%.%G%
 */
@ApiModel(value = "Default", description = "Inofrmacion default")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DefaultIfx implements Serializable{

	private static final long serialVersionUID = 5055833050746842514L;

	@ApiModelProperty(notes = "Número de documento", example = "14837510")
	@JsonProperty("documento")
	@NotNull
	private String document;
	
	@ApiModelProperty(notes = "Nombre del mecánico", example = "Jhon Alexander Tuquerres Jimenez")
	@JsonProperty("nombre")
	@NotNull
	@Size(max = 120)
	private String name;

	@ApiModelProperty(notes = "Horas estimadas por ", example = "2")
	@JsonProperty("horas_estimadas")
	@NotNull
	private String hoursStimate;
	
}
