package com.callor.oop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class List_03 {
	
	public static void main(String[] args) {
		
		// java 프로젝트에서 List 객체를 생성하기
		// List 클래스를 사용하여 객체를 선언하고 ArrayList() 생성자를 호출하여 객체를 초기화한다. 호출 
		List<String> strList1 = new ArrayList<String>(); // ==> 적극권장하는 방법
		
		List<Integer> intList; // => 선언만 한 것, 사용할 준비가 안됨
		intList = new ArrayList<Integer>();
		intList = new LinkedList<Integer>();
		intList = new Vector<Integer>(); // List 클래스 로 선언해 놓으면 세가지 중 하나 골라 쓸 수 있음
		
		ArrayList<Integer> intArrayList;
		intArrayList = new ArrayList<Integer>();
		// intArrayList = new LinkedList<Integer>(); //ArrayList 클래스로 선언하면 오류남
		// intArrayList = new Vector<Integer>(); //ArrayList 클래스로 선언하면 오류남
		
		int[] num = new int[3];
		// num = float[3]; int 형으로 만들어 놓은 걸 float형으로 바꿀 수 없음
	}

}
