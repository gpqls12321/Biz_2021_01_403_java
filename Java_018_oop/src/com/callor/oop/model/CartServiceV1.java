package com.callor.oop.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 *  CartServiceV1 클래스에 cartList 객체를 인스턴스 변수로 선언
 *  
 *  inputCart() method를 선언하고
 *  
 *  키보드에서 상품정보를 입력 받은 후 cartList에 추가
 *  
 *  수량은 2이상, 단가는 1000원 이상만 가능
 *  
 *  printCartList() method를 선언하여
 *  
 *  cartList를 console에 출력
 */

public class CartServiceV1 {

	private List<CartVO> cartList = new ArrayList<CartVO>();
	
	private Scanner scan = new Scanner(System.in);
	
	
	
	public void inputCart() {
		
		System.out.print("구매자 이름 >> ");
		String strUserName = scan.nextLine();
		
		System.out.print("상품명 >> ");
		String strPName = scan.nextLine();
		
		int intQty = 0;
		while (true) {
			System.out.print("수량 >> ");
			String strQty = scan.nextLine();
			try {
				intQty = Integer.valueOf(strQty);
				if (intQty < 2) {
					System.out.print("수량은 2개 이상 입력하세요");
					continue;
				}
			} catch (Exception e) {
				System.out.println("수량은 숫자로 입력하세요");
				continue;
			}
			break;
		}
		
		int intPrice = 0;
		while (true) {
			System.out.print("단가 >> ");
			String strPrice = scan.nextLine();
			try {
				intPrice = Integer.valueOf(strPrice);
				if (intPrice < 1000) {
					System.out.println("가격은 1000원 이상 입력하세요");
					continue;
				}
			} catch (Exception e) {
				System.out.println("가격은 숫자로 입력하세요");
				continue;
			}
			break;
		}
		
		CartVO cartVO = new CartVO();
		cartVO.setCartUserName(strUserName);
		cartVO.setCartPName(strPName);
		cartVO.setCartQty(intQty);
		cartVO.setCartPrice(intPrice);
		
		cartList.add(cartVO);
		
	}
	
	public void printCartList() {
		
		System.out.println("====================================");
		System.out.println("구매자\t상품명\t단가\t수량");
		System.out.println("------------------------------------");
		System.out.printf("%s\t%s\t%d\t%d\n",((CartVO) cartList).getCartUserName(),
				((CartVO) cartList).getCartPName(),
				((CartVO) cartList).getCartQty(),
				((CartVO) cartList).getCartPrice());
		
		
		
	}
	
	
}
