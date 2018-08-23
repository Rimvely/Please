package com.class3;

class Title {

	protected String title;
	protected int r, h;
	protected double volume, sHeight, lSurfaceArea, bSurfaceArea,
			totalsurfaceArea;
	protected static final double PI = 3.14;

	public Title() {

	}

	public Title(String title) {
		this.title = title;
	}

}

class volumeofCc extends Title {

	public volumeofCc(int r, int h) {
		super("¿ø»Ô »ï°¢ÇüÀÇ ºÎÇÇ");
		this.r = r;
		this.h = h;
	}

	public void coneVolume() {
		volume = (1 / 3) * PI * r * r * h;
	}

	public void print() {
		System.out.println("volume of Circular Cone = " + volume);
	}
}

class sHeightofCc extends Title {

	public sHeightofCc(int r, int h) {
		super("¿ø»Ô »ï°¢ÇüÀÇ ºøº¯ÀÇ ±æÀÌ");
		this.r = r;
		this.h = h;
	}

	public void sHeightofCc() {
		sHeight = Math.sqrt((r * r + h * h));
	}
	
	public void print() {
		System.out.println("radius = " + r);
		System.out.println("height = " + h);
		System.out.println("Slant Height =" + sHeight);
	}
	

}

class lSurfaceAreaofCc extends Title {

	public lSurfaceAreaofCc(int r, int h) {
		super("¿ø»Ô »ï°¢ÇüÀÇ ¿¯³ÐÀÌ");
		this.r = r;
		this.h = h;
	}

	public void lSurfaceAreaofCc() {
		lSurfaceArea = PI * r * sHeight;
	}
}










public class Pt1 {
	
	public static void main(String[] args) {
		
		volumeofCc ob1 = new volumeofCc(3, 10);
		ob1.coneVolume();
		
		
		
		
		
		
		
		
		
		
	}
}
