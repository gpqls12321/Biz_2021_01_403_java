package com.callor.shop.files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FileWriter_04 {

	// class 영역에 선언한 변수는, 현재 클래스가 포함하고 있는 모든 method들이 변수를 공유하여 코드를 수행하게 하려는 의도이다.
	
	// 보통 생성자를 통해 객체를 생성하여 사용하는 클래스에 선언된 클래스 영역 변수를 인스턴스 변수 라고 한다.
	// 인스턴스 변수는 GC에 의해 메모리 관리가 자동으로 이루어 진다.
	
	// static method에서 필요한 변수들은 변수를 선언할 때 static 키워드를 추가하여 static 변수로 만든다.
	
	// static 변수는 GC 접근하지 못한다.
	// 프로젝트가 시작될 때 만들어지고, 계속 존재하는 상태다
	// 프로젝트가 시작될 때 클래스가 자동으로 만들어지고 이때 static 변수들도 자동으로 생성된다.
	// 클래스가 생성될 때 같이 만들어진다는 의미로 
	// static 키워드가 부착된 변수를 "클래스 변수"라고 한다.
	
	// static 변수는 선언과 생성을 동시에 하도록 코드를 작성한다.
	// 다만, static 생성자를 만들어 별도로 생성을 하는 경우도 있다. 
	// static 생성자 : 
	//static {numsFile = "src/com/callor/shop/files/nums1.txt"
	//	     intList = new ArrayList<Integer>();
	// 	  	 }
	
	// 클래스 변수와 인스턴스 변수의 차이점
	// 클래스변수는 static이라는 키워드가 붙어있다. 인스턴스는 X
	// 클래스변수는 프로젝트가 시작될 때 클래스가 자동으로 만들어지고 이때 static 변수들도 자동으로 생성된다.  ==> 자동으로 만들어짐
	// 인스턴스 변수는 클래스를 객체로 선언하고 생성자에 의해 객체가 생성될 때 만들어진다. ==>필요할 때만 만들어짐
	//				   GC에 의해 메모리 관리가 이루어진다.
	private static String numsFile = "src/com/callor/shop/files/nums1.txt";
	private static List<Integer> intList = new ArrayList<Integer>();
	

	/*
	 * main() method와 같은 클래스 내에 있는 다른 method를 
	 * 호출하여 코드를 수행할 경우 
	 * main() method의 호출을 받는 method들은 모두 static으로 선언되어야 한다.
	 * 
	 * main() method와 static으로 선언된 method들이 클래스 영역에 선언된 변수를 공유하려면
	 * 클래스 영역에 선언된 변수들도 모두 static으로 선언되어야 한다.
	 */
	public static void main(String arg[]) {
		
		/*
		 * 1. static 으로 선언된 method 내에서는 
		 *  	같은 클래스의 다른 method를 this.method() 형식으로 호출하지 못한다.
		 */
		makeNums();
		saveFileNums();
		
	} // end main()

	private static void makeNums() {
		Random rnd = new Random();

		for (int i = 0; i < 100; i++) {
			// 1번 코드
			Integer num = rnd.nextInt(1000) + 1;
			intList.add(num);

			// 2번 코드 == 1번 코드
			intList.add(rnd.nextInt(1000) + 1);
		}

	}

	private static void saveFileNums() {
		FileWriter fileWriter = null;
		PrintWriter printer = null;

		try {

			fileWriter = new FileWriter(numsFile);
			printer = new PrintWriter(fileWriter);

			// intList에 담긴 전체리스트를 향상된 for()문으로 반복하면서 파일에 출력
			for (Integer n : intList) {
				printer.println(n);
			}

			// 표준형 for로 반복하면서 파일에 출력
			int nSize = intList.size();
			for (int i = 0; i < nSize; i++) {
				Integer n = intList.get(i);
				printer.println(n);
			}

			printer.close();
			fileWriter.close();

			System.out.println("Mission Complete");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
