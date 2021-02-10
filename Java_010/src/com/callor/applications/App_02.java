package com.callor.applications;

import java.util.Scanner;

public class App_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("숫자입력(2~9) >> ");
		int dan = scan.nextInt();
		System.out.println("=======================");
		System.out.println("구구단 " + dan + "단");
		System.out.println("-----------------------");

		
		if (dan < 2 | dan > 9) {
			System.out.println("error");
		}
		
		for (int i = 0; i < 8; i++) {
			int num1 = i + 2;
			System.out.println(dan + "x" + num1 + "=" + dan * num1);
		}
		System.out.println("=======================");
	}

}
