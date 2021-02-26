package com.callor.oop.controller;

import com.callor.oop.model.CartVO;

public class CartControllerV2 {
	
	public static void main(String[] args) {
		
		CartVO[] cartVO = new CartVO[3];
		
		for(int i = 0; i < cartVO.length; i++) {
			cartVO[i] = new CartVO();
			}

		cartVO[0].setCartUserName("홍길동");
		cartVO[0].setCartDate("2021-02-26");
		cartVO[0].setCartTime("11:02:36");
		cartVO[0].setCartPName("연필");
		cartVO[0].setCartQty(3);
		cartVO[0].setCartStd("4B");
		cartVO[0].setCartPrice(500);
		cartVO[0].setCartTotal(3 * 500);
		
		cartVO[1].setCartUserName("한혜빈");
		cartVO[1].setCartDate("2021-02-26");
		cartVO[1].setCartTime("11:05:40");
		cartVO[1].setCartPName("지우개");
		cartVO[1].setCartQty(2);
		cartVO[1].setCartStd("blue");
		cartVO[1].setCartPrice(600);
		cartVO[1].setCartTotal(2 * 600);
		
		cartVO[2].setCartUserName("박부자");
		cartVO[2].setCartDate("2021-02-26");
		cartVO[2].setCartTime("11:07:90");
		cartVO[2].setCartPName("노트북");
		cartVO[2].setCartQty(100);
		cartVO[2].setCartStd("white");
		cartVO[2].setCartPrice(1900000);
		cartVO[2].setCartTotal(100 * 1900000);
		
		System.out.println(cartVO[0].toString());
		System.out.println(cartVO[1].toString());
		System.out.println(cartVO[2].toString());
		// === cartVO의 개수가 3인 상태
		// 상품 한가지를 더 카트에 넣고 싶다.
		cartVO = new CartVO[4];
		
		cartVO[3] = new CartVO();
		cartVO[3].setCartUserName("홍길동");
		cartVO[3].setCartDate("2021-02-26");
		cartVO[3].setCartTime("11:25:40");
		cartVO[3].setCartPName("바나나우유");
		cartVO[3].setCartQty(2);
		cartVO[3].setCartStd("");
		cartVO[3].setCartPrice(1300);
		cartVO[3].setCartTotal(2 * 1300);
		
		System.out.println("============================");
		System.out.println("카트내용");
		System.out.println("----------------------------");
		for(int i = 0; i < cartVO.length; i++) {
			System.out.println(cartVO[i].toString()); //문법적인 오류는 없지만 NullPointerException!!발생 
			// 코드 중간에 배열 크기를 변경하는 코드를 사용하면 위쪽에 입력했던 부분은 사라짐
			// 이름은 같지만 새로운 카트가 만들어지는 것 
			//자바 배열은 처음에 설정해 놓은 개수까지만 쓸 수 있음(단점) ==> 이 단점을 보완하는게 ArrayList
		}
		
		
		
	}

}
