package com.callor.applicatios;

import java.util.Random;
import java.util.Scanner;

public class Array_01 {

	public static void main(String[] args) {

		Random rnd = new Random(); //랜덤 클래스를 사용하여 rnd 객체를 선언하고 =new Random() 명령을 사용하여 rnd 객체를 인스턴스화 시킨다.
		// rnd : Random 클래스의 인스턴스
		
		// rnd 인스턴스의 nextInt) method를 호출하라 
		// 매개변수 값으로 100을 전달하라
		// Random 클래스의 nextInt) method 에 정수 100을 전달하고 실행하여 return 하는 결과를 num 변수에 저장하라
		// num 변수에는 0~99까지 중 1개의 숫자가 저장될 것이다.
		int num = rnd.nextInt();
		
		//num 변수에는 1~100까지 중 1개의 숫자가 저장될 것이다.
		num = rnd.nextInt(100)+1;
		
		// 키보드 입력을 받기 위해 Scanner 클래스를 scan 객체로 선언, scan 객체를 인스턴스화. 사용할 준비를 한다. 
		Scanner scan = new Scanner(System.in);

		//정수 100개를 저장할 배열 변수 선언
		// 생성(초기화 : 사용할 준비를 하라)하라.
		int[] intNums = new int[100];

		
		int sc = 0;
		int count = 0; // 몇개인지 개수를 헤아릴 변수 

		System.out.print("1~10까지 숫자 입력 >> ");
		sc = scan.nextInt();

		// 0~(intNums.length -1) 횟수만큼 반복문을 실행하겠다
		for (int i = 0; i < intNums.length; i++) { //0~intNums.length-1까지의 정수를 만들어서 intNums의 위치값으로 정하고 1~10까지 임의 숫자를 생성하여 intNums의 배열에 채워넣어라.
			
			//intNums의 i번째 위에 정수 100을 저장하라
			// i 값은 0~(intNums.length -1)까지 값을 갖게 되므로 전체 배열 100개에 정수 100을 저장하라
			// intNums[i] = 100;
			
			
			// 			 Random 클래스의 nextInt() method를 호출하면서 정수 10을 전달하고 return된 결과에 1을 더하라 == 1~10까지 중 임의의 숫자 하나를 만들어라
			// 임의로 생성된 숫자를 intNums의 i번째 위치에 저장하라
			intNums[i] = rnd.nextInt(10) + 1;
			
			if(sc == intNums[i]) {
				count++;
			}
		}
		System.out.println(sc + "의 개수 : " + count);

	}

}
