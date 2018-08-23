package com.seriz;

import java.io.Serializable;

public class MyData implements Serializable {  //MyData가 직렬화를 하지않으면 에러가걸린다
	
	private String name;
	private transient int score;  //
	
	public MyData(String name, int score){
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return name + " : " + score;
	}
	
	
	
	
	
	
}
