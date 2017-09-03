package com.andrej.demo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "CAR_OWNER")
public class CarOwner implements Serializable{
	private static final long serialVersionUID = -2949510566535427612L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="CAR_OWNER_ID")
	private long carOwnerId;
	
	@Column(name ="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name ="BIRTHDAY")
	private Date birthDay;
	
	@OneToMany(mappedBy="carOwner")
	private List<Car> carOwnedList; 
	
	public CarOwner() {
		carOwnedList = new ArrayList<>();
	}

	public long getCarOwnerId() {
		return carOwnerId;
	}

	public void setCarOwnerId(long carOwnerId) {
		this.carOwnerId = carOwnerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public List<Car> getCarOwnedList() {
		return carOwnedList;
	}

	public void setCarOwnedList(List<Car> carOwnedList) {
		this.carOwnedList = carOwnedList;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "CarOwner [carOwnerId=" + carOwnerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", birthDay=" + birthDay + ", carOwnedList=" + carOwnedList + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birthDay == null) ? 0 : birthDay.hashCode());
		result = prime * result + (int) (carOwnerId ^ (carOwnerId >>> 32));
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarOwner other = (CarOwner) obj;
		if (birthDay == null) {
			if (other.birthDay != null)
				return false;
		} else if (!birthDay.equals(other.birthDay))
			return false;
		if (carOwnerId != other.carOwnerId)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

}

