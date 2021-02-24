package com.callor.applicatios;

import java.util.Random;

import com.callor.applicatios.service.PrimeServiceV2;

public class HomeWork_01_2 {
	
	/*
	 * 2 이상의 임의의 정수 100개를 만들고
	 * PrimeServiceV2의 prime() method 호출하여 
	 * 임의 정수 100개 중 소수인 수들의 리스트를 출력   (리스트 => 배열 사용)
	 * 소수인 수들의 합 
	 */
	
	public static void main(String[] args) {
	
		/*
		 * java에서는 변수, 객체를 선언할 때 
		 * 사용하기 직전에 선언 및 초기화를 하면된다.
		 * 통상적으로 코딩을 할 때 변수, 객체등의 선언
		 * 가급적 코드의 시작 부분 (클래스 선언 명령문 아래, method 선언문 아래)
		 */
		Random rnd = new Random();
		PrimeServiceV2 psV2 = new PrimeServiceV2();
		
		int intPrimeSum = 0;
		int intPrimeCount = 0;
		
		// int rndNums[] = new int[100]; 과 같은 코드
		int[] rndNums = new int[100];
		
		//생성된 rndNums 배열에 임의의 정수 100개를 저장해 두었다
		// 이처럼 배열을 만들어 두면 이후의 코드에서 한번 생성된 임의의 정수 100개를
		// 자유롭게 활용할 수 있다
		for(int i = 0 ; i < rndNums.length; i++) {
			rndNums[i] = rnd.nextInt(10000) + 2;
		}
		
		// rndNums 배열에 담겨있는 정수들을 
		// PSV2.prime() method 에게 보내서 소수인가를 검사
		
		// 다음처럼 prime() method에 배열을 통째로 전달하여
		// 코드를 수행할 수 없는 이유 
		// psV2.prime(rndNums);
		// psV2.prime() method는 매개변수가 (int num)으로 선언되어 있음
		// 즉 이 method는 전달받을 수 있는 값이 정수 1개
		// 그런데 배열 (100개의 정수)를 한꺼번에 전달하려고 시도하기 때문에 안 되는 것.
		// 그렇다면 PSV2.prime90 method를 사용하기 위해서는 rndNums 의 요소들을 한개씩 전달해야됨
		// 결론은 for() 반복문을 사용해야됨
		for(int i = 0 ; i < rndNums.length; i++) {
			
			int num = rndNums[i];
			int result = psV2.prime(num);
			
			if(result > 0) {
				System.out.print(num+ ", ");
			}
		}
		
		for (int i = 0 ; i < rndNums.length ; i++) {
			int num = rndNums[i];
			int result = psV2.prime(num);
			if(result > 0) {
				intPrimeSum += num;
			}
		}
		
		for (int i = 0 ; i < rndNums.length ; i++) {
			int num = rndNums[i];
			int result = psV2.prime(num);
			if(result > 0) {
				intPrimeCount++;
			}
		}
		
		System.out.println();
		System.out.println("합계 : " + intPrimeSum);
		System.out.println("개수 : " + intPrimeCount);
	}

}
