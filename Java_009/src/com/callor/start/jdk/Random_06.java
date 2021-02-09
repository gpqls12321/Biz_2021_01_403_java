package com.callor.start.jdk;

import java.util.Random;

public class Random_06 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		for(int i = 0 ; i < 100 ; i++) {
			
			int num = rnd.nextInt(100) + 1;
			if(num > 34) {
				System.out.println(( i + 1) + "번째에서 나타남");
				break;
				// 브레이크문 아래서는 코드 절대 실행되지 않음
			}
		}
		
		
		
		
		int intEnd = 107;
		int count = 0;
		for (count = 0 ; count < intEnd ; count++) {
			
			int num = rnd.nextInt(100) + 1;
			if (num > 50) {
				break;
			}
		}
		//count변수값을 읽을 수 있다.
		// 만약 for 반복문이 중단되지 않고 모두 정상적으로 수행되고 나면
		// count 와 intEnd는 count == intEnd가 된다.
		System.out.println(count);
		
		if (intEnd <= count) {
			//for가 정상 종료되었다
		}
		if (intEnd > count) {
			// for가 어떤 이유로 중간에 break 되었다
			System.out.println("for 중단");
			System.out.println(count + "번째에서 값 발견");
		} else {
			System.out.println("for 모두 반복 수행 완료");
			System.out.println("값을 찾을 수 없음");
		}
	}

}
