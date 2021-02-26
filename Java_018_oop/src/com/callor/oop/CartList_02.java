package com.callor.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;

public class CartList_02 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		List<CartVO> cartList = new ArrayList<CartVO>();
		
		CartVO cartVO = new CartVO();
		
		System.out.println("============================================");
		System.out.println("쇼핑카트 테스트");
		System.out.println("--------------------------------------------");
		
		for(int i = 0; i < 3; i++) {
			
		System.out.print("구매자 이름 입력 >> ");
		//cartVO.setCartUserName(scan.nextLine());
		String userName = scan.nextLine();
		cartVO.setCartUserName(userName);
		
		System.out.print("상품명 >> ");
		//cartVO.setCartPName(scan.nextLine());
		String pName = scan.nextLine();
		cartVO.setCartPName(pName);
		
		System.out.print("가격 >> ");
		//cartVO.setCartPrice(scan.nextLine());
		//Integer.valueOf(i);
		
		//3000 이라고 입력하면 "3000" 으로 입력되어 문자열임
		String price = scan.nextLine();
		// "3000" 문자열형 숫자를 정수 3000으로 변경하여 intPrice 변수에 저장
		int intPrice = Integer.valueOf(price);
		cartVO.setCartPrice(intPrice);
		
		System.out.print("수량 >> ");
		//cartVO.setCartQty(scan.nextLine());
		String qty = scan.nextLine();
		int intQty = Integer.valueOf(qty);
		cartVO.setCartQty(intQty);

		String strPName = "홍길동";
		
		
		}
			
		
	}
}
