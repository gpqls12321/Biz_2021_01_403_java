package com.callor.score.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;
import com.callor.score.values.Values;

public class ScoreServiceImplV1 implements ScoreService {

	private String fileName;
	private List<ScoreVO> scoreList;
	private Scanner scan;
	private int korSum = 0; // 전체 국어 총점
	private int engSum = 0;
	private int mathSum = 0;
	private int musicSum = 0;
	private float korAvg = 0; // 전체 국어 평균
	private float engAvg = 0;
	private float mathAvg = 0;
	private float musicAvg = 0;

	public ScoreServiceImplV1() {
		fileName = "src/com/callor/score/data/score.txt";
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}

	public void inputScore() {

			for (int i = 0; i < 20; i++) {
				ScoreVO scoreVO = new ScoreVO();
				String strNum = String.format("%05d", i + 1);
				scoreVO.setNum(strNum);
				
				System.out.print(strNum + " 학생 국어 점수 입력 >> ");
				int intKor = scan.nextInt();
				scoreVO.setKor(intKor);
				korSum += intKor;
				korAvg = (float) korSum / 20;

				System.out.print(strNum + " 학생 영어 점수 입력 >> ");
				int intEng = scan.nextInt();
				scoreVO.setEng(intEng);
				engSum += intEng;
				engAvg = (float) engSum / 20;

				System.out.print(strNum + " 학생 수학 점수 입력 >> ");
				int intMath = scan.nextInt();
				scoreVO.setMath(intMath);
				mathSum += intMath;
				mathAvg = (float) mathSum / 20;

				System.out.print(strNum + " 학생 음악 점수 입력 >> ");
				int intMusic = scan.nextInt();
				scoreVO.setMusic(intMusic);
				musicSum += intMusic;
				musicAvg = (float) musicSum / 20;

				System.out.println(Values.sLine(30));

				scoreList.add(scoreVO);
		}
		
	}
	
	public void saveFile() {
		
		FileWriter fileWriter = null;
		PrintWriter printer = null;
		
		try {
			fileWriter = new FileWriter(fileName);
			printer = new PrintWriter(fileWriter);
			
			for(ScoreVO vo : scoreList) {
				printer.print(vo.getNum() + ":");
				printer.print(vo.getKor() + ":");
				printer.print(vo.getEng() + ":");
				printer.print(vo.getMath() + ":");
				printer.print(vo.getMusic() + ":");
			}
			printer.close();
			fileWriter.close();
			System.out.println("파일 저장 성공");
		} catch (IOException e) {
			System.out.println("파일 생성 중 문제 발생");
		}
		
	}

	public void totalAndAvg() {
		for (ScoreVO vo : scoreList) {
			int sum = vo.getKor();
			sum += vo.getEng();
			sum += vo.getMath();
			sum += vo.getMusic();

			float avg = (float) sum / 4;

			vo.setTotal(sum);
			vo.setAvg(avg);
		}
	}

	public void printScore() {

		System.out.println(Values.dLine(55));
		System.out.println("성적일람표");
		System.out.println(Values.sLine(55));
		System.out.println("학번\t국어\t영어\t수학\t음악\t총점\t평균");
		System.out.println(Values.sLine(55));

		for (ScoreVO vo : scoreList) {
			System.out.print(vo.getNum() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getMusic() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.printf("%3.2f\n", vo.getAvg());
		}
		
		System.out.println(Values.sLine(55));
		System.out.println("총점 :  " + korSum + "\t" + engSum + "\t" + mathSum + "\t" + musicSum);
		System.out.printf("평균 :  %3.2f\t%3.2f\t%3.2f\t%3.2f\n",korAvg,engAvg,mathAvg,musicAvg);
		System.out.println(Values.dLine(55));
	}

	

}
