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

	private String cartUserName;
	private String cartPName;
	private String cartStd;
	private String cartDate;
	private String cartTime;
	private int cartQty;
	private int cartPrice;
	private int cartTotal;
	
	private List<CartVO> cartList = new ArrayList<CartVO>();
	
	private Scanner scan = new Scanner(System.in);
	
	
	
	public void inputCart() {
		
		System.out.print("구매자 이름 >> ");
		
	}
	
	public void printCartList() {
		
	}
	
	
}
