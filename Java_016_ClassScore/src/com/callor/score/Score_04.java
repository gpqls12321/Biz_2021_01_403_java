package com.callor.score;

import com.callor.score.service.ScoreServiceV2;
import com.callor.score.service.model.ScoreVO;

public class Score_04 {
	
	public static void main(String[] args) {
		
		ScoreServiceV2 ssV2 = new ScoreServiceV2();
		
		ScoreVO 홍길동성적 = new ScoreVO();
		
		홍길동성적.intKor = 90;
		홍길동성적.intEng = 80;
		홍길동성적.intMath = 70;
		
		int sum = ssV2.scoreSum(홍길동성적);
		System.out.println("총점 : " + sum);
	}

}
