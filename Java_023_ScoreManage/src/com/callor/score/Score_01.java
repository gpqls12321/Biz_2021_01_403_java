package com.callor.score;

import com.callor.score.service.impl.MenuServiceImplV1;
import com.callor.score.service.impl.ScoreServiceImplV1;

public class Score_01 {

	public static void main(String[] args) {
		
		String fileName = "src/com/callor/score/score_service.txt";
		MenuServiceImplV1 ms = new MenuServiceImplV1();
		ScoreServiceImplV1 ss = new ScoreServiceImplV1();
		
		ms.selectMenu();
		ss.makeScore();
		ss.saveSocreToFile(fileName);
		ss.loadScoreFromFile();
	}
}
