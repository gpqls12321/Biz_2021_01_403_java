package com.callor.applications.service;

public class ClassServiceV7 {
	
	public void gugu(int dan) {
		for(int i = 1 ; i < 10 ; i++) {
			System.out.println(dan + " x " + i + " = " + dan * i);
		}
		
	}
	
	/*
	 * 정수 한개를 매개변수 dan에 전달받아
	 * 구구단 출력
	 */
	public void guguDan(int dan) {
		System.out.println("===============================");
		System.out.printf("%d단 구구단\n", dan);
		System.out.println("-------------------------------");
		
		for(int num = 2 ; num < 10 ; num++) {
			System.out.printf("%d x %d = %d\n", dan, num, dan+num);
		}
		System.out.println("===============================");
		
	}

}
