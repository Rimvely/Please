package com.naver;

public class NaverVO {

	private String name;
	private String pw1;
	private String pw2;
	private String gender;
	private int birth; //공간이 생기면 오류나게?
	private String e_mail;
	private String tel;
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getPw1(){
		return pw1;
	}
	
	public void setPw1(String pw1){
		this.pw1 = pw1;
	}
	
	public String getPw2(){
		return pw1;
	}
	
	public void setPw2(String pw2){
		this.pw1 = pw2;
	}
	
	public String getGender(){
		return gender;
	}
	
	public void setGender(String gender){
		this.gender = gender;
	}
	
	public int getBirth(){
		return birth;
	}
	
	public void setBirth(int birth){
		this.birth = birth;
	}
	
	public String getE_mail(){
		return e_mail;
	}
	
	public void setE_mail(String e_mail){
		this.e_mail = e_mail;
	}
	
	public String getTel(){
		return tel;
	}
	
	public void setTel(String tel){
		this.tel = tel;
	}
	
	@Override
	public String toString() {
		
		String str;
		
		str = String.format("%4s %4s %4d %8s %8s", pw1, gender, birth, e_mail, tel);
		
		return str;
	}
	
	
	
	
	
	
	
	
	
	
}
