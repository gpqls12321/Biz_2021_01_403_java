package com.callor.applications.service;

import java.util.Scanner;

public class ScoreServiceV1 {
	
	// 클래스 영역(멤버 영역)에 선언된 변수들
	//인스턴스 변수 
	//ScoreServiceV1 ssV1; : 클래스를 객체로 선언하고 초기화( = new SSV1() :객체의 초기화 )를 하면 자동으로 사용할 준비가 되는 변수들 
	private int intKor = 0;
	private int intEng = 0;
	private int intMath = 0;
	private int intSum = 0;
	private float floatAvg = 0;
	private Scanner scan = new Scanner(System.in);
	
	//input() method가 호출되면 키보드를 통해 국어,영어,수학 점수를 입력받고 intKor, intEng, intMath에 저장
	public void input() {
		// int intNum = 0; :input() method의 지역변수
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
		floatAvg = intSum / 3.0F;		
		// floatAvg = (float) intSum / 3; 위코드와 같음
	}
	
	// intKor, intEng, intMath 인스턴스 변수
	public void print() {
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println(intKor + "\t" + intEng + "\t" + intMath + "\t" + intSum + "\t" + floatAvg);
		
		System.out.printf("평균 : %3.2f\n",floatAvg);
		
	}

}
