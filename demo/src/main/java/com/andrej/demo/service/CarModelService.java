package com.andrej.demo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrej.demo.model.CarModel;
import com.andrej.demo.repository.CarModelRepository;

@Service
@Transactional
public class CarModelService {
	@Autowired
	private CarModelRepository carModelRepository;
	
	public CarModel save(CarModel carModel){
		return carModelRepository.save(carModel);
	}

	public CarModel findById(long id) {
		return carModelRepository.findOne(id);
	}
	
}
