package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ScoreVO;
import com.callor.oop.service.ScoreServiceV1;

public class Score_02 {
	
	public static void main(String[] args) {
		
		ScoreServiceV1 ssV1 = new ScoreServiceV1();
		ScoreVO scoreVO = new ScoreVO();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 >> ");
		String strName = scan.nextLine();
		
		// scoreVO.intKor = ssV1.inputScore("국어");
		// scoreVO.setIntKor(strKor);
		// scoreVO.intEng = ssV1.inputScore("영어");
		scoreVO.intMath = ssV1.inputScore("수학");
		
		
	}

}
