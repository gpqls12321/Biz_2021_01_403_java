package com.callor.score.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.callor.score.service.ScoreService;

public class ScoreServiceImplV1 implements ScoreService {

	private List<Integer> intList;
	public ScoreServiceImplV1() {
		intList = new ArrayList<Integer>();
	}
	
	@Override
	public void makeScore() {
		Random rnd = new Random();
		for(int i = 0; i < 100; i++) {
			Integer num = rnd.nextInt(100) + 1;
			intList.add(num);
		}
	}

	@Override
	public void saveScoreToFile() {
		
	}

	@Override
	public void loadScoreFromFile() {
		
	}

}
