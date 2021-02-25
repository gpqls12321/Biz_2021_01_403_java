package com.callor.oop;

import com.callor.oop.model.ProductVO;

public class Exception_04_1 {
	
	public static void main(String[] args) {
		
		ProductVO[] pVOs = new ProductVO[3];
		
		
		// 객체가 초기화 되지 않은 상태에서 발생하는
		// exception 을 처리하는 코드
		try {
			pVOs[0].strDName = "초코파이";
		} catch (NullPointerException e) {
			System.out.println("객체가 초기화 되지 않았다");
		}
	
	// ProductVO[] pVOs = new ProductVO[3];
	// pVOs[0].strDName = "초코파이";
	// => 이렇게만 쓰면 오류나서 예외 처리 try catch 
	}

}
