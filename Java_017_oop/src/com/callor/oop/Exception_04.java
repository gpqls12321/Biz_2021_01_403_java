package com.callor.oop;

import com.callor.oop.model.ProductVO;

public class Exception_04 {
	
	public static void main(String[] args) {
		
		ProductVO[] pVOs = new ProductVO[3];
		
		// 근본적으로 exception 이 발생하지 않도록 하는 코드
		pVOs[0] = new ProductVO();
		
		
		pVOs[0].strDName = "초코파이";
	}

}
