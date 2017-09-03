package com.andrej.demo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrej.demo.model.Car;
import com.andrej.demo.repository.CarRepository;

@Service
@Transactional
public class CarService {
	
	@Autowired 
	private CarRepository carRepository;
	
	public Car save(Car car){
		return carRepository.save(car);
	}
}
