package com.scorehw3;

public class ScoreVO {

	private String name;
	private String gender;
	private String zip_Code;
	private String address;
	private int age;
	private int height;
	private int weight;

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

	public String getZip_code() {
		return zip_Code;
	}

	public void setZip_Code(String zip_Code) {
		this.zip_Code = zip_Code;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {

		String str;

		str = String.format("%8s %4d %6s %6d %6d %12s %8s", name, age, gender,
				height, weight, address, zip_Code);

		return str;
	}

}
