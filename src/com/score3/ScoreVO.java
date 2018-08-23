package com.score3;

public class ScoreVO {// Value Object -> DTO (Data Transfer Object)

	private String hak;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	/*
	 * public void set(String hak, String name, int kor, int eng, int mat){
	 * //초기화를할수잇는 생성자생성하기위해
	 * 
	 * this.hak = hak; this.name = name; this.kor = kor; this.eng = eng;
	 * this.mat = mat; } 한꺼번에 초기화할수있지만 그렇게안하고 개개인으로도 가능하다.
	 */

	// getter, setter

	public void setHak(String hak) {       //초기화 시키는게 set
		this.hak = hak;
	}

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

	public String getHak() {            //값을 가지고싶어 그러면 get
		return hak;
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
	
	public int getTot()	{
		return kor+eng+mat;
	}
	

	@Override   //override 하는이유
	public String toString() {

		if (hak == null || name == null)
			return null;

		String str = String.format("%5s %6s %4d %4d %4d %4d %4.1f", hak, name,
				kor, eng, mat, getTot(), getTot() / 3.0);

		return str;

	}

}

/*
 * //기본생성자를 만드는 이유는 public ScoreVO(String hak, String name, int kor, int eng,
 * int mat){ //초기화를할수잇는 생성자생성하기위해
 * 
 * this.hak = hak; this.name = name; this.kor = kor; this.eng = eng; this.mat =
 * mat; }
 */

