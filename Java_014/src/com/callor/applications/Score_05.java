package com.callor.applications;

// 내가 한 것 

import java.util.Random;

public class Score_05 {

	public static void main(String[] args) {

		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];
		int[] intSum = new int[3];
		float[] floatAvg = new float[3];

		String[] strName = new String[] { "홍길동", "이몽룡", "성춘향" };

		Random rnd = new Random();

		for (int index = 0; index < intKor.length; index++) {

			intKor[index] = rnd.nextInt(100) + 1;

			intEng[index] = rnd.nextInt(100) + 1;

			intMath[index] = rnd.nextInt(100) + 1;

			intSum[index] = intKor[index] + intEng[index] + intMath[index];

			floatAvg[index] = (float) intSum[index] / 3;
		}

		System.out.println("===================================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("---------------------------------------------------");

		for (int index = 0; index < intKor.length; index++) {

			System.out.print(strName[index] + "\t" + intKor[index] + "\t" + intEng[index] + "\t" + intMath[index] + "\t" + intSum[index] + "\t");
			System.out.printf("%3.2f\n",floatAvg[index]);
		}

		System.out.println("===================================================");
	}
}
