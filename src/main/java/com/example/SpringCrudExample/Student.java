package com.example.SpringCrudExample;

public class Student {
	private Long id;
	private String name;
	private String mobileNo;
	private Long fees;

	public Student() {}
	
	public Student(Long id, String name, String mobileNo, Long fees) {
		this.id = id;
		this.name = name;
		this.mobileNo = mobileNo;
		this.fees = fees;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public Long getFees() {
		return fees;
	}
	public void setFees(Long fees) {
		this.fees = fees;
	}
}
