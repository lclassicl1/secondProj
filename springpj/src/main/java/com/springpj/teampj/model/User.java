package com.springpj.teampj.model;

public class User {

	private int no;
	private String id;
	private String password;
	private String name;
	private int zipcode;
	private String address;
	private String detailaddress;
	private String pricynum;
	private String email;
	private String phonenum;
	private String gender;
	private String grade;
	private String regdate;
	
	public User() {}
	public User(int no, String id, String password, String name, int zipcode, String address, String detailaddress,
			String pricynum, String email, String phonenum, String gender, String grade, String regdate) {
		this.no = no;
		this.id = id;
		this.password = password;
		this.name = name;
		this.zipcode = zipcode;
		this.address = address;
		this.detailaddress = detailaddress;
		this.pricynum = pricynum;
		this.email = email;
		this.phonenum = phonenum;
		this.gender = gender;
		this.grade = grade;
		this.regdate = regdate;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDetailaddress() {
		return detailaddress;
	}
	public void setDetailaddress(String detailaddress) {
		this.detailaddress = detailaddress;
	}
	public String getPricynum() {
		return pricynum;
	}
	public void setPricynum(String pricynum) {
		this.pricynum = pricynum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
	
	@Override
	public String toString() {
		return "User [no=" + no + ", id=" + id + ", password=" + password + ", name=" + name + ", zipcode=" + zipcode
				+ ", address=" + address + ", detailaddress=" + detailaddress + ", pricynum=" + pricynum + ", email="
				+ email + ", phonenum=" + phonenum + ", gender=" + gender + ", grade=" + grade + ", regdate=" + regdate
				+ "]";
	}
}
