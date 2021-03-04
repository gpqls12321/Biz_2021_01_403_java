package com.callor.shop.impl;

import java.util.Scanner;

import com.callor.shop.service.MenuService;

public class MenuServiceV1 implements MenuService {

	private Scanner scan; // Scanner 클래스를 사용하여 scan 객체 선언

	public MenuServiceV1() {
		// TODO Auto-generated constructor stub
		scan = new Scanner(System.in); // 스캔 객체 사용하기 위한 준비. 스캔 객체 초기화(생성) 
	}

	public Integer selectMenu() {

		while (true) {
			System.out.println("===========================================");
			System.out.println("빛나라 쇼핑몰 2021");
			System.out.println("-------------------------------------------");
			System.out.println("1. 장바구니 상품 담기");
			System.out.println("2. 장바구니 전체 리스트 보기");
			System.out.println("3. 구매자별 장바구니 리스트 보기");
			System.out.println("QUIT. 끝내기");
			System.out.println("===========================================");
			System.out.print("선택 >> ");
			String strMenu = scan.nextLine(); 

			if (strMenu.equals("QUIT")) {
				break;
			}

			try {
				Integer intMenu = Integer.valueOf(strMenu);
				if (intMenu >= 1 && intMenu <= 3) {
					return intMenu;
				} else {
					System.out.println("메뉴는 1~3까지 선택");
				}
			} catch (Exception e) {
				System.out.println("메뉴는 QUIT, 1, 2, 3만 선택 가능");
			}
		}
		return null;
	}

}
