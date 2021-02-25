package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ScoreVO;

public class Score_01 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
		System.out.print("이름 >> ");
		String strName = scan.nextLine();
			
		System.out.print("국어 점수 >> ");
		String strKor = scan.nextLine();

		
		System.out.print("영어 점수 >> ");
		String strEng = scan.nextLine();
		
		System.out.print("수학 점수 >> ");
		String strMath = scan.nextLine();
		
		ScoreVO sVO = new ScoreVO();
		sVO.strName = strName;
		
		
		try {
			// sVO.intKor = Integer.valueOf(strKor);
			// scoreVO.setIntKor(strKor);
			sVO.intEng = Integer.valueOf(strEng);
			sVO.intMath = Integer.valueOf(strMath);
		} catch (Exception e) {
			System.out.println("숫자로만 입력");
			continue;
		}
		
		}
		
	}

}
