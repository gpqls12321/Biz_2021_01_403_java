package com.callor.applications;
/*
 * Scanner 클래스를 사용하여 키보드에서 2~9까지 중 1개의 숫자를 입력 받고, 
 * 다음과 같이 구구단을 출력하시오
 */
import java.util.Scanner;

public class App_01 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자입력(2~9) >> ");
		int dan = scan.nextInt();
		System.out.println("=======================");
		System.out.println("구구단 " + dan + "단");
		System.out.println("-----------------------");
		for (int i = 0 ; i < 8 ; i++) {
			int num1 = i + 2;
			System.out.println(dan + "x" + num1 + "=" + dan * num1);
		}
		System.out.println("=======================");
		
	}

}
