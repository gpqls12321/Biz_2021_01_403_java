package com.callor.student;

import java.util.Random;

/*
 * 정수형 배열 100개를 선언하여 10~100까지 임의의 정수를 생성하여 저장
 * 
 * 100개의 배열에 담긴 정수 중에 소수들만 찾아서 
 * Console에 출력
 */
public class Ex_08 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int[] num = new int[100];
		for(int i = 0; i < num.length; i++) {
			num[i] = rnd.nextInt(90) + 11;
			
			int index = 0;
			for(index = 10; index < num.length; index++) {
				if (num[i] % index == 0) {
					break;
				}
			}
			if (index >= num[i]) {
				System.out.println(num[i] + " : 소수");
			} 
		}
	}
	
}
