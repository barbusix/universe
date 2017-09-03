package com.andrej.demo;

import java.util.Date;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.andrej.demo.model.Car;
import com.andrej.demo.model.CarModel;
import com.andrej.demo.model.CarOwner;
import com.andrej.demo.service.CarModelService;
import com.andrej.demo.service.CarOwnerService;
import com.andrej.demo.service.CarService;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class DemoApplicationTests {

	@Autowired
	private CarModelService carModelService;
	
	@Autowired
	private CarService carService;
	
	@Autowired
	private CarOwnerService carOwnerService;
	
	@Test
	public void contextLoads() {
	}

	@SuppressWarnings("deprecation")
	@Test
	public void insertEntitiesTest(){
		CarModel cm = new CarModel();
		cm.setCarModelId(1);
		cm.setFuelType("Bencina 95");
		cm.setHorsePower(155);
		cm.setManufacturer("Alfa Romeo");
		cm.setModelYear(1999);
		carModelService.save(cm);
		
		Car car = new Car();
		car.setCarId(1);
		car.setCarModel(cm);
		car.setColor("Yellow");
		car.setPrice(12345);
		car.setVin("ZAR000000112121000");
		carService.save(car);
		
		CarOwner co = new CarOwner();
		co.setBirthDay(new Date());
		co.setCarOwnerId(1);
		co.setFirstName("Manuel");
		co.setLastName("Fangio");
		co.getCarOwnedList().add(car);
		carOwnerService.saveCarOwner(co);
		Assert.assertNotNull(carOwnerService.findById(1L));
		System.out.println(carOwnerService.findById(1L).toString());
	}
}
