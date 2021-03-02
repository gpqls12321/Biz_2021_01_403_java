package com.callor.oop.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;
import com.callor.oop.service.CartService;

public class CartServiceImplV3 implements CartService {

	private List<CartVO> cartList;
	private Scanner scan;

	public CartServiceImplV3() {

		cartList = new ArrayList<CartVO>();
		scan = new Scanner(System.in);
	}

	public void inputCart() {

		while (true) {
			System.out.println("======================================");
			System.out.println("저쩌구 카트 시스템 V3");
			System.out.println("--------------------------------------");

			System.out.print("구매자(QUIT : 끝내기) >> ");
			String strUserName = scan.nextLine();
			
			// while() 반복문을 사용하여 코드를 작성할 때는 사용자가 반복문을 중단(종료)할 수 있는
			// 탈출구를 만들어 주어야 한다.
			if(strUserName == "QUIT") {
				break;
			}
			
			System.out.print("상품명(QUIT : 끝내기) >> ");
			String strProName = scan.nextLine();
			if(strProName == "QUIT") {
				return; //break; 써도됨
			}

			int intQty = 0;
			while (true) {
				System.out.print("수량 >> ");
				String strQty = scan.nextLine();
				try {
					intQty = Integer.valueOf(strQty);
					if (intQty < 1) {
						System.out.println("수량은 1개 이상 입력하세요");
					} else {
						break;
					}
				} catch (Exception e) {
					System.out.println("수량은 숫자로만 입력하세요");
				}
			}

			int intPrice = 0;
			while (true) {
				System.out.print("단가 >> ");
				String strPrice = scan.nextLine();
				try {
					intPrice = Integer.valueOf(strPrice);
					if (intPrice < 1000) {
						System.out.println("단가는 1000 이상 입력하세요");
					} else {
						break;
					}
				} catch (Exception e) {
					System.out.println("단가는 숫자로만 입력하세요");
				}
			}

			// 카트에 저장
			CartVO cartVO = new CartVO();
			cartVO.setUserName(strUserName);
			cartVO.setProductName(strProName);
			cartVO.setQty(intQty);
			cartVO.setPrice(intPrice);
			cartVO.setTotal(intPrice * intQty);

			cartList.add(cartVO);
			
		} // while end
	}

	@Override
	public void printCart() {
		
		System.out.println("=================================================");
		System.out.println("구매자\t상품명\t수량\t단가\t토탈");
		System.out.println("-------------------------------------------------");
		int nSize = cartList.size();
		for (int i = 0; i < nSize; i++) {
			System.out.printf("%s\t%s\t%d\t%d\t%d\n",cartList.get(i).getUserName(),cartList.get(i).getProductName(),cartList.get(i).getQty(),cartList.get(i).getTotal());
			//System.out.println(cartList.get(i).toString());
		}
		System.out.println("=================================================");

	}

}
