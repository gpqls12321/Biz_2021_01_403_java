package com.callor.oop.controller;

import com.callor.oop.model.CartServiceV1;

public class CartControllerV5 {

	public static void main(String[] args) {
		
		CartServiceV1 csV1 = new CartServiceV1();
		
		csV1.inputCart();
		csV1.printCartList();
	}
}
