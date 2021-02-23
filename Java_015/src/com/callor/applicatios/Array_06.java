package com.callor.applicatios;

import java.util.Random;
import java.util.Scanner;

public class Array_06 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] intNums = new int[100];

		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(10) + 1;
		}

		Scanner scan = new Scanner(System.in);
		System.out.print("정수 1~10 중 하나 입력 >> ");
		
		int keyNum = scan.nextInt();
		
		int pos = 0;
		for(pos = 0 ; pos <intNums.length ; pos++) {
			if(intNums[pos] == keyNum) {
				break;
			}
		}
		
		if(pos < intNums.length ) {
			System.out.println(pos + " 위치에서 최초 발견");
		} else {
			System.out.println("배열에 찾는 값이 없음");
		}
	}
}
