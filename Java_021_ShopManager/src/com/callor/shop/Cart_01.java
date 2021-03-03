package com.callor.shop;

import com.callor.shop.impl.CartServiceV1;
import com.callor.shop.impl.MenuServiceV1;
import com.callor.shop.service.CartService;
import com.callor.shop.service.MenuService;

public class Cart_01 {

	public static void main(String[] args) {
		
		CartService cSer = new CartServiceV1();
		MenuService mSer = new MenuServiceV1();
		
		while(true) {
			Integer menu = mSer.selectMenu();
			if(menu == null) {
				break;
			} else if (menu == 1) {
				cSer.inputcart();
			} else if (menu == 2) {
				cSer.printAll();
			} else if (menu == 3) {
				cSer.printIndi();
			}
		}
	}
}
