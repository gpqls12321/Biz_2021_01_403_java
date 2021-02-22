package com.callor.applications;

import java.util.Random;

public class Score_04 {
	
	public static void main(String[] args) {
		
		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];
		
		String[] strName = new String[] {"홍길동","이몽룡","성춘향"};
		
		Random rnd = new Random();
		
		for(int index = 0 ; index < intKor.length ; index++) {
			
			intKor[index] = rnd.nextInt(100);
			
			intEng[index] = rnd.nextInt(100);
						
			intMath[index] = rnd.nextInt(100);
		}
		
			System.out.println("===================================");
			System.out.println("이름\t국어\t영어\t수학");
			System.out.println("-----------------------------------");
		
		for(int index = 0 ; index < intKor.length ; index++) {
			System.out.println(strName[index] + "\t" + intKor[index] + "\t" + intEng[index] + "\t" + intMath[index]);
		}
			
			System.out.println("===================================");
	}

}
