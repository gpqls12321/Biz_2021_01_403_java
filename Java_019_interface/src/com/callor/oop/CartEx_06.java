package com.callor.oop;

import com.callor.oop.service.CartService;
import com.callor.oop.service.MenuService;
import com.callor.oop.service.impl.CartServiceImplV4;
import com.callor.oop.service.impl.MenuServiceImplV3;

public class CartEx_06 {

	public static void main(String[] args) {
		
		MenuService mService = new MenuServiceImplV3();
		mService.selecetMenu();
		
		/*
		 * MenuService에는 선언되지 않고 MenuServiceImplV3에만 선언된 menuItem 변수값을 읽어오기 위해서
		 * 인터페이스 -> 클래스 형변환을 시킨다.
		 */
		MenuServiceImplV3 mV3 = (MenuServiceImplV3)mService;
		Integer menuItem = mV3.menuItem;
		
		// 인터페이스 -> 클래스로 형변환과 동시에 변수에 접근하기// 위의 두줄과 같은 의미
		Integer selectMenu = ((MenuServiceImplV3)mService).menuItem;
		
		
		CartService cService = new CartServiceImplV4();
		
		if(selectMenu == 1) {
			// 카트 추가
			cService.inputCart();
		} else if (selectMenu == 2) {
			// 카트 삭제
		} else if (selectMenu == 3) {
			// 카트 리스트
			cService.printCart();
		}
		
		
		
		
		
	}
}
