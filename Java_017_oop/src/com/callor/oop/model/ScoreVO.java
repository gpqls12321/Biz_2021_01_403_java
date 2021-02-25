package com.callor.oop.model;

/*
 * Value Object의 인스턴스변수 은닉
 * 인스턴스변수는 public으로 선언하지 않고 보통 private으로 선언함 
 * VO클래스를 사용하여 선언된 vo 객체는 인스턴스 변수에 직접 접근할 수 없음
 * ScoreVO sVO = new ScoreVO();
 * sVO.strName = "홍길동"; ->이런 코드 사용 불가. 인스턴스변수를 private으로 바꿨기 때문
 * String name = sVO.strName; -> 사용불가 
 * 
 * private으로 선언된 인스턴스에 접근하기 위한 것을 setter, getter method 라고 한다. 이 둘을 통해서 접근해야 한다. 
 * 저장할 때는 sVO.setStrName("홍길동");
 * 읽을 때는 name = sVO.getStrName();
 * 
 * 
 * 
 * - 캡슐화 -
 * 은닉된 인스턴스 변수는 getter, setter method를 통해서 변수에 접근한다
 * getter, setter 메서드의 코드를 '몰라도'
 * 
 * setIntKor() method는 intKor 인스턴스변수에 값을 저장
 * getIntKor() method는 intKor 인스턴스 변수에서 값을 읽기
 * 기능을 한다는 것을 알 수 있다.
 * 
 * 코드 내용이 어떠한지 몰라도  getter, setter를 통하여 변수에 접근(저장,읽기)할 수 있다.
 */
public class ScoreVO {

	public String strName;
	private int intKor = -1 ;
	private int intEng = -1;
	public int intMath;
	
	public int intSum;
	public float floatAvg;
	
	/*
	 * 국어점수(intKor)를 저장할 인스턴스 변수를
	 * private 로 선언하여 직접 접근할 수 없도록 만든다.
	 * 
	 * 국어점수(intKor)인스턴스 변수에 간접적으로 값을 저장하는 setIntKor() method 를 선언.
	 * 
	 * setIntKor() method 는 점수를 문자열로 받아서 정수로 변경한 다음 범위 검사를 수행하고 정상적인 점수일 경우(유효성통과)일 경우만
	 * 국어 인스턴스 변수 (this.intKor)에 저장한다.
	 * 
	 * 만약 점수가 잘못되어 유효성 검사를 통과하지 못하면 국어점수는 -1로 세팅되어 있을 것이다.
	 */
	public void setIntKor(String strKor) {
		try {
			int intKor = Integer.valueOf(strKor);	
			if(intKor >= 50 && intKor <= 100) {
				this.intKor = intKor;
			}
		} catch (Exception e) {
		}
	}
	
	public int getIntKor() {
		return this.intKor;
	}
	
	/*
	 * VO 클래스를 설계하면서 intEng 인스턴스변수를 private으로 설정하여 변수에 직접 접근하지 못하도록 하고
	 * 
	 * 변수에 값을 저장할 때는 setIntEng() method 를 통해서 값을 저장하도록 설정한다.
	 * 
	 * 이때 setIngEng() method는 점수를 매개변수로 전달받아서 유효성 검사를 수행하고 
	 * 검사가 통과 되었을 때만 intEng변수에 저장(setting)할 수 있도록 만듦
	 */
	public void setIntEng (String strEng) {
		try {
			int intEng = Integer.valueOf(strEng);
			if(intEng >= 50 && intEng <= 100) {
				this.intEng = intEng;
			}
		} catch (Exception e) {
		}
	}
	
	/*
	 * 변수에 값을 저장하기 전에 유효성검사를 하기 위해서 setIntEng() method를 통하도록 코드를 변경했다 
	 *   변수는 private 으로 , setIntEng() method 선언
	 * intEng 변수의 값을 읽지도 못하는 상황이 발생한다
	 * intEng 변수의 값을 저장한 후 읽을 수 있어야 되는데 intEng 변수의 값을 읽기 위해서 getIntEng라는 메서드를 또 하나 선언해 둔다
	 */
	public int getIntEng() {
		return this.intEng;
	}
}
