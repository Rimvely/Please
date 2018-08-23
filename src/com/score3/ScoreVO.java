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
	 * //�ʱ�ȭ���Ҽ��մ� �����ڻ����ϱ�����
	 * 
	 * this.hak = hak; this.name = name; this.kor = kor; this.eng = eng;
	 * this.mat = mat; } �Ѳ����� �ʱ�ȭ�Ҽ������� �׷��Ծ��ϰ� ���������ε� �����ϴ�.
	 */

	// getter, setter

	public void setHak(String hak) {       //�ʱ�ȭ ��Ű�°� set
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

	public String getHak() {            //���� ������;� �׷��� get
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
	

	@Override   //override �ϴ�����
	public String toString() {

		if (hak == null || name == null)
			return null;

		String str = String.format("%5s %6s %4d %4d %4d %4d %4.1f", hak, name,
				kor, eng, mat, getTot(), getTot() / 3.0);

		return str;

	}

}

/*
 * //�⺻�����ڸ� ����� ������ public ScoreVO(String hak, String name, int kor, int eng,
 * int mat){ //�ʱ�ȭ���Ҽ��մ� �����ڻ����ϱ�����
 * 
 * this.hak = hak; this.name = name; this.kor = kor; this.eng = eng; this.mat =
 * mat; }
 */

