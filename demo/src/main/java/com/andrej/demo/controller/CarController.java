package com.andrej.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.andrej.demo.model.Car;
import com.andrej.demo.service.CarService;

@RestController
@RequestMapping("car")
public class CarController {

	@Autowired
	private CarService carService;
	
	@RequestMapping(value="/create", method = RequestMethod.POST)
	public Car create(Car car){
		return carService.save(car);
		
	}
}
