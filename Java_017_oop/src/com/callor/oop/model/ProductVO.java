package com.callor.oop.model;

/*
 * 쇼핑몰에서 판매되는 상품을 관리하기 위한 데이터를 저장할 용도의 Value Object 클래스 디자인 (설계)
 * 
 * ProductVO 클래스는
 * ProductVO.java 파일로 생성된다.
 * 클래스를 만들고 파일로 저장하는 과정     => 클래스 디자인, 설계, "클래스 프로토타입(Prototype)작성"
 * 
 * 클래스 프로토 타입은 객체를 생성하기 위한 설계도 코드
 * 
 * VO(Value Object)클래스에서 가장 중요한 것은 인스턴스 변수를 선언하는 부분
 * 
 * 상품관리를 위해 필요한 데이터들
 * - 상품코드, 상품명, 품목명, 거래처, 매입단가, 매출단가
 */
public class ProductVO {

	public String strPCode; // 상품코드 ProductCode
	public String strPName; // 상품명 (이름) Product Name
	public String strItem; // 품목명
	public String strDName; //거래처 dept
	public int iPrice; 		// 매입단가
	public int oPrice;		// 매출단가
	
	/*
	 * java에서는 class를 선언하면 
	 * public String toString() 메서드가 자동으로 생성된다
	 * 하지만 기본적으로 코드는 보이지 않는다
	 * 
	 * toString() 메서드는 객체를 생성했을때 어떤 클래스를 사용했는지와 생성된 객체가 컴퓨터 기억장치의
	 * 						어떤 곳(주소)에 만들어져 저장되어 있는지 알려주는 코드가 담겨있다.
	 * 
	 * java 코딩에서 toString()메서드의 기본 역할은 크게 필요하지 않다. 
	 * 
	 * 그래서 일반적으로 VO 클래스를 만들 때는 임의로 toString() 메서드를 "다시 만들어 준다."
	 * 				그리고 인스턴스 변수에 입력된 값을 알려주는 디버깅 코드를 생성한다.
	 * 
	 * -메서드의 재정의- method Override (Overriding)
	 * (java에서) 자동으로 만들어져 있는 toString()을 개발자가 임의로 다시 만들었다.
	 * 
	 * 원래 java에서 자동으로 생성되어 있는 코드는 감춰진다.
	 */
	public String toString() {
		System.out.println("================================");
		System.out.println("입력된 데이터 확인");
		System.out.println("--------------------------------");
		System.out.printf("상품코드 : %s\n",this.strPCode);
		System.out.printf("상품명 : %s\n",this.strPName);
		System.out.printf("품목명 : %s\n",this.strItem);
		System.out.printf("거래처 : %s\n",this.strDName);
		System.out.printf("매입단가 : %d\n",this.iPrice);
		System.out.printf("매출단가 : %d\n",this.oPrice);
		System.out.println("================================");
		
		return ""; // 리턴할 값이 아무것도 없다는 뜻 == return null; <-이렇게 써도 됨
	}
}
