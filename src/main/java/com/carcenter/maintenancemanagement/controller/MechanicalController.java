package com.carcenter.maintenancemanagement.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.carcenter.maintenancemanagement.dto.Rq.CreateMechanicalRq;
import com.carcenter.maintenancemanagement.service.IMechanicalService;

/**
* Class that represent the controller "MECANICO"
* @author JhonT
* @version 1.0
*/

@Controller
@RequestMapping("/V1/management")
public class MechanicalController {
	
	@Autowired
	private IMechanicalService iMechanicalService;
	
	@GetMapping("/")
	public String verIndex() {
		return "index";
	}
	
	@GetMapping("/signup")
	public String showSignUpForm(CreateMechanicalRq createMechanicalRq) {
		return "add-mechanical";
	}
	
	@PostMapping("/mechanical")
	public String createMechanical(@Valid CreateMechanicalRq createMechanicalRq, BindingResult result,	Model model){
		
		try {
			if (result.hasErrors()) {
				return "add-mechanical";
			}
			
			iMechanicalService.createMechanical(createMechanicalRq).toString();
			return "index";
		} catch (Exception e) {
			return "add-mechanical";
		}
	}
	
	
	@GetMapping("/show-mechanical-assign")
	public String showMechanicalAssignForm(Model model) {
		model.addAttribute("clients", iMechanicalService.getDefaults());
		return "show-mechanical-assign";
	}
	
	
}
