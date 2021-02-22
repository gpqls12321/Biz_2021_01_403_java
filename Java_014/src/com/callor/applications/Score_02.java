package com.callor.applications;

import java.util.Scanner;

public class Score_02 {

	public static void main(String[] args) {
		
		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];
		String[] strName = new String[3];
		
		
		Scanner scan = new Scanner(System.in);
		
		for (int index = 0; index < strName.length ; index++){
			
			System.out.println("학생 이름을 입력하세요");
			System.out.print("이름 >> ");
			strName[index] = scan.nextLine();
			
			System.out.println("과목 점수를 입력하세요");
			System.out.print("국어점수 >> ");
			String strSubj = scan.nextLine();             // 문자열형으로 입력 받고
			intKor[index] = Integer.valueOf(strSubj);	  // 문자열형 숫자를 정수로 변경하여 저장

			System.out.print("영어점수 >> ");
			strSubj = scan.nextLine();
			intEng[index] = Integer.valueOf(strSubj);

			System.out.print("수학점수 >> ");
			strSubj = scan.nextLine();
			intMath[index] = Integer.valueOf(strSubj);
		}

		System.out.println("============================");
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("----------------------------");

		for (int i = 0; i < 3; i++) {
			System.out.println(strName[i] + "\t" + intKor[i] + "\t" + intEng[i] + "\t" + intMath[i]);
		}
		System.out.println("============================");

	}
}
