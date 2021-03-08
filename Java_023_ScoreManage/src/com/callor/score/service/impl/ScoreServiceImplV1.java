package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.callor.score.service.ScoreService;
import com.callor.score.values.Values;
import com.callor.score.vo.ScoreVO;

public class ScoreServiceImplV1 implements ScoreService {

	private List<Integer> intList;
	private List<ScoreVO> scoreList;
	private List<String> strLines;
	private String fileName;
	
	public ScoreServiceImplV1() {
		this("src/com/callor/score/score_service.txt");
	}
	
	public ScoreServiceImplV1(String fileName) {
		intList = new ArrayList<Integer>();
		scoreList = new ArrayList<ScoreVO>();
		strLines = new ArrayList<String>();
		this.fileName = fileName;
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
		this.saveSocreToFile("src/com/callor/score/score_service.txt");
	}
	
	public void saveSocreToFile(String fileName) {
		
		FileWriter fw = null;
		PrintWriter pw = null;
		
		try {
		
			fw = new FileWriter(fileName);
			pw = new PrintWriter(fw);
			
			int count = 0;
			for(Integer n : intList) {
				
				pw.print(n + ":");
				if(++count % 5 == 0) {
					pw.println();
				}
			}
			pw.close();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void loadScoreFromFile() {
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			while(true) {
				String str = buffer.readLine();
				
				if(str == null) {
					break;
				}
				strLines.add(str);
			}
			buffer.close();
			fileReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for(String str : strLines) {
			String[] scores = str.split(":");
			ScoreVO scoreVO = new ScoreVO();
			scoreVO.setKor(Integer.valueOf(scores[0]));
			scoreVO.setEng(Integer.valueOf(scores[1]));
			scoreVO.setMath(Integer.valueOf(scores[2]));
			scoreVO.setHistory(Integer.valueOf(scores[3]));
			scoreVO.setMusic(Integer.valueOf(scores[4]));
			scoreList.add(scoreVO);
		}
		for(ScoreVO vo : scoreList) {
			int sum = vo.getKor();
			sum += vo.getEng();
			sum += vo.getMath();
			sum += vo.getHistory();
			sum += vo.getMusic();
			
			float avg = (float)sum / 5;
			
			vo.setTotal(sum);
			vo.setAvg(avg);
		}
		
		System.out.println(Values.dLine);
		System.out.println("순번\t국어\t영어\t수학\t국사\t음악\t총점\t평균");
		System.out.println(Values.sLine);
		
		int numCount = 0;
		for(ScoreVO vo : scoreList) {
			numCount++;
			System.out.print(numCount + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getHistory() + "\t");
			System.out.print(vo.getMusic() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.printf("%3.2f\n", vo.getAvg());
		}
		System.out.println(Values.dLine);
	}

}
