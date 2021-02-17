package com.callor.applications.service;

public class ScoreServiceV4 {
	
	public void score(int intSum, float fAvg) {
		System.out.println("총점 : " + intSum);
		System.out.println("평균 : " + fAvg);
	}
	
	public void print(int intKor, int intEng, int intMath) {
		System.out.println("=======================================");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("---------------------------------------");
		System.out.print(intKor + "\t");
		System.out.print(intEng + "\t");
		System.out.print(intMath + "\t");
		
		int total = 0;
		float fAvg = 0;
		total = intKor + intEng + intMath;
		System.out.print(total + "\t");
		
		fAvg = (float) (total / 3.0);
		System.out.println(fAvg);
		
		System.out.println("=======================================");
		
	}

}
