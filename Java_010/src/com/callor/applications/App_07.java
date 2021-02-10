package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

import com.callor.applications.myclass.MyGuGuDan;

public class App_07 {

	public static void main(String[] args) {

		MyGuGuDan myGu = new MyGuGuDan();

		/*
		 * MyGuGuDan 클래스에 정의된 print() method 호출
		 * 
		 * MyGuGuDan 클래스의 print() method 호출
		 * 
		 * print(int) ... arguments () => 괄호 안에 넣어주는 값을 arguments 라고 함 즉, 괄호 안에 정수형 값을 넣어라
		 */
		myGu.print(8);
		
		Random rnd = new Random();
		rnd.nextInt(10); //Random 클래스의 nextInt() 메서드 를 호출한다 // 호출하면서 정수 10 주입
		rnd.nextInt(); // 그냥 호출만 하라

		Scanner scan = new Scanner(System.in);
		scan.nextInt(); // Scanner 클래스의 nextInt() method 호출
		
		Random rd = new Random();
		rd.nextInt(100);
	}

}
