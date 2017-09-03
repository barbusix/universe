package com.andrej.demo.dto;

import java.io.Serializable;
/*
 * DTO helper class 
 * holds two id's from carOwner and car
 */
public class CarOwnerCarDto implements Serializable	{
	private static final long serialVersionUID = 3240618988070583061L;
	private long carOwnerId;
	private long carId;
	
	public long getCarId() {
		return carId;
	}
	public void setCarId(long carId) {
		this.carId = carId;
	}
	public long getCarOwnerId() {
		return carOwnerId;
	}
	public void setCarOwnerId(long carOwnerId) {
		this.carOwnerId = carOwnerId;
	}
		
}
