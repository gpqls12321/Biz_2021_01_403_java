package com.callor.shop.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.shop.service.CartService;
import com.callor.shop.vo.CartVO;

public class CartServiceV1 implements CartService {

	private List<CartVO> cartList;
	private Scanner scan;
	
	public CartServiceV1() {
		cartList = new ArrayList<CartVO>();
		scan = new Scanner(System.in);
	}
	
	
	public void inputcart() {

		System.out.println("장바구니에 넣기");
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
				if (intQty < 1) {
					System.out.println("수량은 1개 이상 입력하세요");
					continue;
				}
				break;
			} catch (Exception e) {
				System.out.println("수량은 숫자로만 입력하세요");
			}
		} // while() end

		int intPrice = 0;
		while (true) {
			System.out.print("단가 >> ");
			String strPrice = scan.nextLine();
			try {
				intPrice = Integer.valueOf(strPrice);
				if (intPrice < 1) {
					System.out.println("단가는 1 이상 입력하세요");
					continue;
				}
				break;
			} catch (Exception e) {
				System.out.println("단가는 숫자로만 입력하세요");
			}
		} // while() end

		// cart 1개를 생성하고 데이터 저장
		CartVO cartVO = new CartVO();
		cartVO.setUserName(strUserName);
		cartVO.setProductName(strPName);
		cartVO.setQty(intQty);
		cartVO.setPrice(intPrice);
		cartVO.setTotal(intQty * intPrice);

		// cartList에 추가
		cartList.add(cartVO);

	}

	public void printAll() {

		System.out.println("===========================================");
		System.out.println("구매자\t상품명\t수량\t단가\t합계");
		System.out.println("-------------------------------------------");
		int nSize = cartList.size();
		int intTotal = 0;
		int count = 0;
		for(int i = 0; i < nSize; i++) {
			System.out.printf("%s\t%s\t%d\t%d\t%d\n",cartList.get(i).getUserName(),cartList.get(i).getProductName(),cartList.get(i).getQty(),cartList.get(i).getPrice(),cartList.get(i).getTotal());
			
			intTotal += cartList.get(i).getTotal();
			count++;
		}
		
		System.out.println("-------------------------------------------");
		System.out.println("합계\t" + count + "가지\t" + intTotal);
		System.out.println("===========================================");
		
	}

	public void printIndi() {
		System.out.print("구매자 이름 >> ");
		String strName = scan.nextLine();
		
		System.out.println("===========================================");
		System.out.println("구매자\t상품명\t수량\t단가\t합계");
		System.out.println("-------------------------------------------");
		
		int nSize = cartList.size();
		int intTotal = 0;
		int count = 0;
	
		for (int i = 0; i < nSize; i++) {
		if (strName.equals(cartList.get(i).getUserName())) {
			System.out.printf("%s\t%s\t%d\t%d\t%d\n",cartList.get(i).getUserName(),cartList.get(i).getProductName(),cartList.get(i).getQty(),cartList.get(i).getPrice(),cartList.get(i).getTotal());
			
			intTotal += cartList.get(i).getTotal();
			count++;
		}
		}
		System.out.println("-------------------------------------------");
		System.out.println("합계\t" + count + "가지\t" + intTotal);
		System.out.println("===========================================");
	}

}
