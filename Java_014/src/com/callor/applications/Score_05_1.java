package com.callor.applications;

import java.util.Random;

public class Score_05_1 {

	public static void main(String[] args) {

		String[] strName = new String[] { "홍길동", "이몽룡", "성춘향", "장록수", "임꺽정" };

		int[] intKor = new int[strName.length];
		int[] intEng = new int[strName.length];
		int[] intMath = new int[strName.length];

		int[] intSum = new int[strName.length];
		float[] floatAvg = new float[strName.length];

		Random rnd = new Random();
		for (int i = 0; i < strName.length; i++) {
			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;
		}

		for (int i = 0; i < strName.length; i++) {
			intSum[i] = intKor[i];
			intSum[i] += intEng[i];
			intSum[i] += intMath[i];
		}

		for (int i = 0; i < strName.length; i++) {
			floatAvg[i] = (float) intSum[i] / 3;
		}

		// 성적 리스트 제목 출력
		System.out.println("===================================================");
		System.out.println("빛나리학급 성적 일란표");
		System.out.println("===================================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("---------------------------------------------------");

		// 성적 리스트 출력
		for (int i = 0; i < strName.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%3.2f\n", strName[i], intKor[i], intEng[i], intMath[i], intSum[i],
					floatAvg[i]);
		}
	}
}
