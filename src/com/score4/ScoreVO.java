package com.score4;

import java.text.Format;

public class ScoreVO { // Value Object

	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;

	public void setName(String name) {
		this.name = name;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMat(int mat) {
		this.mat = mat;

	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMat() {
		return mat;
	}

	public int getTot() {
		tot = kor + eng + mat;
		return tot;
	}

	@Override
	public String toString() {

		String str;

		double avg = getTot() / 3.0;
		
		str = String.format("%6s %4d %4d %4d %4d %5.1f", name, kor, eng, mat,
				getTot(), avg);

		return str;
	}

}
