package com.score2;

public class ScoreMain {

	public static void main(String[] args) {

		Score ob = new ScoreImpl();
//		Score ob = new Score();
//		      ob = ScoreImpl();
		
		ob.set();
		ob.input();
		ob.print();
	}

}
