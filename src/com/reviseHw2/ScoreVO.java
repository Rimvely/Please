package com.reviseHw2;

public class ScoreVO {

	private String name;
	private int french;
	private int english;
	private int japanese;
	private int tot;
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getFrench(){
		return french;
	}
	
	public void setFrench(int french){
		this.french = french;
	}
	
	public int getEnglish(){
		return english;
	}
	
	public void setEnglish(int english){
		this.english = english;
	}
	
	public int getJapanese(){
		return japanese;
	}
	
	public void setJapanese(int japanese){
		this.japanese = japanese;
	}
	
	public int getTot(){
		return french+english+japanese;
	}
	
	@Override
	public String toString() {
		
		if(name == null)
			return null;
		
		String str = String.format("%4s %4d %6d %6d %8d %6.1f", name,
				french, english, japanese, getTot(), getTot() / 3.0);
		
		
		return str;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
