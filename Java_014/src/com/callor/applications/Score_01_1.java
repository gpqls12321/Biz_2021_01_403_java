package com.callor.applications;
// 내가 한 것


/*
 * 학생 세명의 국어, 영어, 수학 점수를 키보드로 입력받아
 * (학생 세명의 과목점수를 저장할 배열을 선언)
 * console에 리스트 출력하기
 * 
 * 1. 학생 세명의 3과목 점수를 저장할 배열
 * 2. 배열이 나오면 일단 for() 반복문이 한번쯤은 나타난다.
 * 3. 학생 3명의 3과목의 점수를 어떻게 입력 받을 것인가?
 * 4. 학생 3명의 과목 점수를 어떻게 출력할 것인가?
 */

import java.util.Scanner;

public class Score_01_1 {

	public static void main(String[] args) {

		/*
		 * 변수는 1개의 변수에 1개의 값만 저장할 수 있다. 
		 * ==> 3명 학생의 과목점수를 저장해야 하기 때문에 각 과목을 배열로 선언
		 * ==> 몇개의 배열이 필요한지 명시(알려주기)
		 *  	= new int[갯수]
		 */
		
		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];
		
		
		Scanner scan = new Scanner(System.in);

		//3명 학생의 과목 성적 입력받기
		// 1. 국어 과목의 3명 점수 입력받기
		// 2. 학생별로 국어, 영어, 수학 점수 각각 입력받기
		for (int index = 0; index < intKor.length ; index++){
			
			int num = index + 1;
			System.out.println(num + "번 학생 성적을 입력하세요");
			System.out.print("국어점수 >> ");
			intKor[index] = scan.nextInt();

			System.out.print("영어점수 >> ");
			intEng[index] = scan.nextInt();

			System.out.print("수학점수 >> ");
			intMath[index] = scan.nextInt();
		}

		System.out.println("============================");
		System.out.println("국어\t영어\t수학");
		System.out.println("----------------------------");

		for (int i = 0; i < 3; i++) {
			System.out.println(intKor[i] + "\t" + intEng[i] + "\t" + intMath[i]);
		}
		System.out.println("============================");

	}
}
