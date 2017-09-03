package com.andrej.demo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrej.demo.dto.CarOwnerCarDto;
import com.andrej.demo.model.Car;
import com.andrej.demo.model.CarOwner;
import com.andrej.demo.repository.CarOwnerRepository;
import com.andrej.demo.repository.CarRepository;

@Service
@Transactional
public class CarOwnerService {
	@Autowired
	private CarOwnerRepository carOwnerRepository;
	
	@Autowired
	private CarRepository carRepository;
		
	public CarOwner saveCarOwner(CarOwner carOwner){
		return carOwnerRepository.save(carOwner);
	}
	
	public CarOwner findById(Long carOwnerId){
		return carOwnerRepository.findOne(carOwnerId);
	}

	public CarOwner addCarToCarOwnerColection(CarOwnerCarDto carOwnerCarDto) {
		CarOwner co = carOwnerRepository.findOne(carOwnerCarDto.getCarOwnerId());
		Car car = carRepository.findOne(carOwnerCarDto.getCarId());
		co.getCarOwnedList().add(car);
		return carOwnerRepository.save(co);
	}
	
	
}
