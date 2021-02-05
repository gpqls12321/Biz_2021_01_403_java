package com.callor.start.loop;

public class while_01 {
	
	public static void main(String args[]) {
		
		int count = 0;
		
		System.out.println(3 + 4 * 3 - 3);
		System.out.println(3 - 4 * 3 + 3);
		
		/*
		 * 단항연산자(++,--)가 변수의 뒤(끝)에 있을 경우 
		 * 현재 명령어를 모두 실행하고 그 이후에 1을 증감
		 */
		System.out.println(10 + 20 + 30 + count++); //count가 0인 상태
		
		// 풀어서 쓰면 
		System.out.println(10 + 20 + 30 + count);
		count += 1;
		
		
		
		System.out.println("=======================================");
		count = 0;
		// 정말 무한반복
		// for( ;; ) {}
		while(true) {
			System.out.println(count++ + " : 대한민국");
			
			//어떤 조건을 검사하여 true
			if(count > 10) {
				// 반복문 중단하기
				break; // count가 10보다 크면 중단하라
			}
		}
	}

}
