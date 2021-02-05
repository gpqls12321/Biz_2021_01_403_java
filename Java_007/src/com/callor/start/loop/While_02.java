package com.callor.start.loop;

public class While_02 {

	public static void main(String[] args) {
		
		int count = 0;
		// 우선 ++는 없다고 생각. 그러면 0이 10보다 작냐고 물어보는 것 -> true
		// true 라고 생각 되면 count 값을 1 증가 시키는 것
		
		//sysout의 카운트가 9가 되면 while문의 count는 9!!
		while(count++ < 10) {
			
			System.out.println(count);
		}
		
		count = 0;
		while(count < 10) {
			System.out.println(++count);
		}
		
		// 1
		System.out.println(count++); 
		// 풀어쓰면
		System.out.println(count);
		count += 1;
		
		// 2
		System.out.println(++count);
		//풀어쓰면
		count++;
		System.out.println(count);
		
	}
}
