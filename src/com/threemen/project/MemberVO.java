package com.threemen.project;

import java.io.Serializable;
import java.util.List;

public class MemberVO implements Serializable {


	private String name;
	private String address;
	private String id;
	private String pw;
	private String tel;

	List<bookVO> bookList;

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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return String.format("%11s %20s %42s %24s", name, tel, address,
				bookList);

	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

}
