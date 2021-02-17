package com.callor.applications;

import java.util.Scanner;

public class Score_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		System.out.print("국어 입력 >> ");
		num1 = scan.nextInt();
		
		System.out.print("영어 입력 >> ");
		num2 = scan.nextInt();
		
		System.out.print("수학 입력 >> ");
		num3 = scan.nextInt();
		
		System.out.println("=====================================");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------------");
		
		int total = num1 + num2 + num3;
		double sum = total / 3.0;
		
		System.out.println(num1 + "\t" + num2  + "\t" +  num3 + "\t" + total + "\t" + sum);
		
		System.out.println("=====================================");
		
	}
}
