package com.callor.start.logic;

/*
 * 화폐 매수 계산
 * 
 * 4789800
 * 오만원 
 * 만원		 = 오만원 / 5
 * 오천원	 = 만원 / 2
 * 천원		 = 오천원 / 5
 * 오백원	 = 천원 / 2
 * 백원		 = 오백원 / 5
 * 
 */
public class Logic_05 {
	
	public static void main(String[] args) {
		
		//정수를 정수로 나누는 연산을 했을 경우
		// 결과도 정수(몫)으로 나타나는 연산 규칙을
		// 활용한 결과
		
		//5만원권계산
		int pay = 4_789_800;
		int paper = 50_000;
		int count = pay / paper;
		
		System.out.println( paper + "원권 : " + count );
		
		//1만원권 계산
		pay -= paper * count;  //5만원권 제외 금액
		paper = paper / 5;
		count = pay / paper;
		System.out.println(paper + "원권 : " + count);
		
		// 5천원권 계산
		pay -= paper * count; //1만원권 제외 금액
		paper /= 2;
		count = pay / paper;
		System.out.println(paper + "원권 : " + count);
		
		// 천원권 계산
		pay -= paper * count; // 5천원권 제외 금액
		paper /= 5;
		count = pay / paper;
		System.out.println(paper + "원권 : " + count);
		
		// 오백원 계산
		pay -= paper * count; 
		paper /= 2;
		count = pay / paper;
		System.out.println(paper + "원권 : " + count);
		
		// 백원
		pay -= paper * count; 
		paper /= 5;
		count = pay / paper;
		System.out.println(paper + "원권 : " + count);
		
	}

}
