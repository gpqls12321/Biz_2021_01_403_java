package com.callor.applicatios;

import java.util.Random;
import java.util.Scanner;

public class Array_01_1 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] intNums = new int[100];

		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(10) + 1;
		}
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 1~10까지 중 숫자 입력 >> ");
		int keyNum = scan.nextInt();
		
		// intNums 는 어떤값이 저장되어 있는지 모른다 
		// 단 1~10까지의 숫자들이 들어 있을 것이다
		// intNums 배열에 저장된 숫자들 중에서 키보드로 입력받은 값(keyNum에 저장되어 있음)과
		// 같은 값이 몇개 저장되어 있는 지 알고 싶다.
		
		int count = 0;
		for(int i = 0 ; i <intNums.length; i++) {
			
			if (intNums[i] == keyNum) {
				count++;
				System.out.println(intNums[i]);
			}
		}
		System.out.println(keyNum + "의 갯수 : " + count);
	}

}
