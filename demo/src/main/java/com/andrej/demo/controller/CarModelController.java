package com.andrej.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.andrej.demo.model.CarModel;
import com.andrej.demo.service.CarModelService;

@RestController
@RequestMapping("/carModel")
public class CarModelController {

	@Autowired
	private CarModelService carModelService;

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public CarModel create(CarModel carModel) {
		return carModelService.save(carModel);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public CarModel findById(@PathVariable("id") long id) {
		return carModelService.findById(id);
	}
}
