package com.callor.applications;

import java.util.Scanner;

public class Score_03 {

	public static void main(String[] args) {

		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];

		String[] strName = new String[3];
		strName[0] = "홍길동";
		strName[1] = "이몽룡";
		strName[2] = "성춘향";

		Scanner scan = new Scanner(System.in);

		for (int index = 0; index < intKor.length; index++) {

			System.out.println(strName[index] + "의 점수를 입력하세요");
			System.out.print("국어 >> ");
			intKor[index] = scan.nextInt();

			System.out.print("영어 >> ");
			intEng[index] = scan.nextInt();

			System.out.print("수학 >> ");
			intMath[index] = scan.nextInt();
		}

		System.out.println("====================================");
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("------------------------------------");

		for (int i = 0; i < strName.length; i++) {
			System.out.println(strName[i] + "\t" + intKor[i] + "\t" + intEng[i] + "\t" + intMath[i]);
		}
		
		System.out.println("====================================");
	}

}
