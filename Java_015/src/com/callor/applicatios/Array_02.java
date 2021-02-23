package com.callor.applicatios;

import java.util.Random;
import java.util.Scanner;

public class Array_02 {
	
	public static void main(String args[]) {
		
		Random rnd = new Random();
		
		int[] intNums = new int[100];
		
		for(int i = 0 ; i < intNums.length ; i++) {
			intNums[i] = rnd.nextInt(10) +1 ;
		}
		
		int keyNum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 1~10 중 하나 입력 >> ");
		keyNum = scan.nextInt();
		
		System.out.printf("값 %d 저장 위치\n",keyNum);
		for(int i=0; i < intNums.length ; i++) {
			if (intNums[i] == keyNum) {
				System.out.print(i + ",");
			}
		}
	}

}
