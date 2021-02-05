package com.callor.start.loop;

public class Loop_02 {
	public static void main(String args[]) {
		
		// for()문 안의 ' i ' 는 for() 반복문이 끝나면 사라짐
		// i 라는 변수 선언 후 시작, for()문이 몇번 반복되는지 비교문,  i 라는 값을 몇 증가시킬것인가
		// 시작은 0으로, 비교는 등호는 사용x, 증가 값은 1씩
		// i = 임시변수 (index)
		for(int i = 0 ; i < 10 ; i += 1) {	
		}
		
		int num = 0;
		num = num + 1;
		num += 1;
		// num =+ 1; <-이코드는 사용하지 말 것
		num++; // num 변수를 1 증가 시켜라
		++num; //단항연산자
		
		
		// num 변수를 1 감소 시켜라 ( + , - 만 사용)
		num = num -1;
		num -= 1;
		num--;
		--num;
		
		
		// i 값이 100부터 시작하여 i < 0 까지 1씩 감소하면서 반복
		for(int i = 100 ; i > 0 ; i--) { 
			System.out.println(i);
		}
	}

}
