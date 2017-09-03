package com.andrej.demo.controller;

import java.util.Date;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.andrej.demo.dto.CarOwnerCarDto;
import com.andrej.demo.model.CarOwner;
import com.andrej.demo.service.CarOwnerService;


@RestController
@RequestMapping("/carOwner")
public class CarOwnerController {
		
	@Autowired
	private CarOwnerService carOwnerService;
	
	/*
	 * Early test purpose only
	 */
	@RequestMapping("/test")
	public CarOwner testCarOwner(){
		CarOwner co = new CarOwner();
		co.setBirthDay(new Date());
		co.setCarOwnerId(1);
		co.setFirstName("Mile");
		co.setLastName("Casma");
		return co;
	}
	
	@RequestMapping(value="/create",method = RequestMethod.POST)
	public CarOwner createCarOwner(@RequestBody CarOwner carOwner){
		return carOwnerService.saveCarOwner(carOwner);
	}
	@RequestMapping(value="/addCar",method = RequestMethod.POST)
	public CarOwner AddCarToCarOwnerCollection(@RequestBody CarOwnerCarDto carOwnerCarDto){
		return carOwnerService.addCarToCarOwnerColection(carOwnerCarDto);
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public CarOwner findById(@PathVariable("id") long id){
		return carOwnerService.findById(id);
	}
}
