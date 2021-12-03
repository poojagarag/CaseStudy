package com.example.hotel;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/*import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString*/


@Document(collection="Customer")
public class Customer {
	

	@Id
	private BigInteger id;
	
	@Field
	private String name ;
	@Field
	private String address;
	@Field
	private double phone;
	
	
	public Customer(BigInteger id,String name,String address,double phone) {  //Getter and Setter can be eliminated ,Instead lombok can be used
		this.id=id;
		this.name=name;
		this.address=address;
		this.phone=phone;
		
	}
	
	public BigInteger getId() {
		return id;
	}


	public void setId(BigInteger id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public double getPhone() {
		return phone;
	}


	public void setPhone(double phone) {
		this.phone = phone;
	}

	

}



