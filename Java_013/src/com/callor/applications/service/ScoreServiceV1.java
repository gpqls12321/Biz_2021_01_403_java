package com.callor.applications.service;

import java.util.Scanner;

public class ScoreServiceV1 {
	
	private int intKor = 0;
	private int intEng = 0;
	private int intMath = 0;
	private int intSum = 0;
	private float floatAvg = 0;
	
	private Scanner scan = new Scanner(System.in);
	
	public void input() {
		
		System.out.print("국어 점수 입력 >> ");
		intKor = scan.nextInt();
		System.out.print("영어 점수 입력 >> ");
		intEng = scan.nextInt();
		System.out.print("수학 점수 입력 >> ");
		intMath = scan.nextInt();
	}
	
	public void sum() {
		intSum = intKor+intEng+intMath;
	}
	
	public void avg() {
		floatAvg = (intKor+intEng+intMath) / 3.0F;		
	}
	
	public void print() {
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println(intKor + "\t" + intEng + "\t" + intMath + "\t" + intSum + "\t" + floatAvg);
		
	}

}
