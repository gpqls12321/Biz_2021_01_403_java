package com.callor.applicatios;

import java.util.Random;
import java.util.Scanner;

public class Array_03 {
	
	public static void main(String[] args) {
		
		int[] intNums = new int[100];
		
		Random rnd = new Random();
		
		for(int i = 0 ; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(10)+1;
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 1~10 하나 입력 >> ");
		int keyNum = scan.nextInt();
		
		for (int position = 0 ; position < intNums.length; position++) {
			if(intNums[position] == keyNum) {
				System.out.println(keyNum + " 최초로 저장된 위치 : " + position);
				break;
			}
		}
	}

}
