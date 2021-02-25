package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ScoreVO;

public class Score_03 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ScoreVO scoreVO = new ScoreVO();

		ScoreVO sVO = new ScoreVO();
	 // sVO.strName = strName;
		
		while(true) {
		System.out.print("이름 >> ");
		String strName = scan.nextLine();
			
		System.out.print("국어 점수 >> ");
		String strKor = scan.nextLine();
		
		scoreVO.setIntKor(strKor);
		
		// intKor에 -1이 담겨 있으면 다시 입력을 하도록 해야 함
		if (scoreVO.getIntKor() < 0) {
			System.out.println("국어점수 유효성 검사 실패");
			continue;
		}

		while(true) {
		System.out.print("영어 점수 >> ");
		String strEng = scan.nextLine();
		scoreVO.setIntEng(strEng);
		if(scoreVO.getIntEng() < 0) {
			System.out.println("영어 유효성 검사 실패");
			continue;
		}
		break;}
		
		while(true) {
		System.out.print("수학 점수 >> ");
		String strMath = scan.nextLine();
		}
		

		
		
		
	
		
		}
		
	}

}
