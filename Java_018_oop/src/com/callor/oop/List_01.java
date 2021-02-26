package com.callor.oop;

// ArrayList 

import java.util.ArrayList;
import java.util.List;

public class List_01 {
	
	public static void main(String[] args) {
		
		/*
		 * List
		 * 배열과 성질이 유사한 java의 클래스 
		 * 개수가 정해지지 않은(최초는 0개) 배열을 생성하는 것과 같다
		 * 
		 */
		ArrayList<String> books = new ArrayList<String>(); // 아래의 코드와 똑같은데 개념이 다름
		List<String> strNames = new ArrayList<String>(); // List라는 클래스를 이용해서 strNames 라는 객체를 만듦, 또 ArrayList라는 클래스를 이용해서 초기화함 
														 // (원래는 ArrayList라는 클래스를 이용해서 ArrayList 클래스를 이용해서 초기화함 아래가 더 세련ㅋㅋ된 코드) 
														 // 개수가 '하나도 없는(정해지지않은)' 배열과 같다!! 이거는 배열이라고 부르지 않고 List라고 부름 
														 // books List, strNames List를 만든다고 말함 
														 // List를 처음 만들면 개수가 없다
		
		// books 리스트에 저장된 데이터들 중에서 0번 위치에 저장된 데이터를 Console에 출력하라 --> 
		// System.out.println(books.get(0)); // 문법적인 오류는 없지만 IndexOutOfBoundsException 발생!! 배열에서 Exception은 ArrayIndexOutOfBoundsException
		// 위에 코드 주석처리 한 이유 모냐면 아래 try catch 실행하려구~~~
		
		try {
			System.out.println("여기는 add 하기 전");
			System.out.println(books.get(0));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		// books List에 도서명 "추가"하기
		// List에 add() method를 사용하여 값을 추가하면 자동으로 개수가 추가되면서 데이터가 저장된다
		books.add("자바프로그래밍");
		books.add("자바의 정석");
		books.add("그리스로마신화"); // 내용물을 3개 갖는 배열이 된다.

		try {
			System.out.println("add 한 후");
			System.out.println(books.get(0)); // get 입력해서 위치 값 넣어주면 읽을 수 있음
			System.out.println(books.get(1));
			System.out.println(books.get(2));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	

}
