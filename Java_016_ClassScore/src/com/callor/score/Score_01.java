package com.callor.score;

import java.util.Random;

public class Score_01 {
	
	public static void main(String[] args) {
		
		String[] strName = new String[] {"홍길동","이몽룡","성춘향","장녹수","임꺽정"};
		String[] strAddr = {"서울시","익산시","남원시","한양시","함흥시"};
		
		// int arrLen = strName.length;
		// int[] intKor = new int[arrLen.length];
		// int[] intEng = new int[arrLen.length];
		// int[] intMath = new int[arrLen.length];
		// int[] intSum = new int[arrLen.length];
		// float[] floatAvg = new float[arrLen.length];
		
		int[] intKor = new int[strName.length];
		int[] intEng = new int[strName.length];
		int[] intMath = new int[strName.length];
		int[] intSum = new int[strName.length];
		float[] floatAvg = new float[strName.length];
		
		Random rnd = new Random();
		
		for(int i = 0 ; i < strName.length ; i++) { // 점수 생성
			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;
		}

		for(int i = 0 ; i < strName.length ; i++) { // 총점
			intSum[i] = intKor[i];
			intSum[i] += intEng[i];
			intSum[i] += intMath[i];
		}
		
		for(int i = 0 ; i < strName.length ; i++) {
			floatAvg[i] = (float)intSum[i] / 3;
		}
		
		System.out.println("=========================================================");
		System.out.println("이름\t주소\t국어\t영어\t수학\t총점\t평균");
		System.out.println("---------------------------------------------------------");
		for(int i = 0 ; i < strName.length ; i++) {
			System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%3.2f\n" ,strName[i],strAddr[i],intKor[i],intEng[i],intMath[i],intSum[i],floatAvg[i]);
		}
		System.out.println("=========================================================");
	}

}
