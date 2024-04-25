package com.manish.dto;

public class ConsumerDto {
private Integer id;
private String name;
private String gender;
private Double amount;
private String city;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public Double getAmount() {
	return amount;
}
public void setAmount(Double amount) {
	this.amount = amount;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "ConsumerDto [id=" + id + ", name=" + name + ", gender=" + gender + ", amount=" + amount + ", city=" + city
			+ "]";
}


}
