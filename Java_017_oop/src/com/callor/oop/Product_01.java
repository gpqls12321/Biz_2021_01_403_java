package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ProductVO;

public class Product_01 {
	
	public static void main(String[] args) {
		
		ProductVO productVO = new ProductVO();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("toString() : " + productVO.toString());
		
		System.out.println("===============================");
		System.out.println("상품정보 등록(입력) 시스템 V1");
		System.out.println("-------------------------------");
		System.out.println("상품정보를 입력하세요");
		System.out.println("-------------------------------");
	
		System.out.print("상품코드 입력 >> ");
		productVO.strPCode = scan.nextLine();
		
		System.out.print("상품명 입력 >> ");
		productVO.strPName = scan.nextLine();
		
		System.out.print("품목명 입력 >> ");
		productVO.strItem = scan.nextLine();
		
		System.out.print("거래처 입력 >> ");
		productVO.strDName = scan.nextLine();
		
		System.out.print("매입단가 입력 >> ");
		productVO.iPrice = scan.nextInt();
		
		System.out.print("매출단가 입력 >> ");
		productVO.oPrice = scan.nextInt();
		
		productVO.toString();
		
	}

}
