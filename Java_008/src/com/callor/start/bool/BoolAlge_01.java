package com.callor.start.bool;

/*
 * Boolean Algebra
 * 
 * (3x * 3) + (4x * 2) + (5x * 3)
 *    A          B           C
 * A + B + C 
 */
public class BoolAlge_01 {
	
	public static void main(String[] args) {
		
		boolean bYes = true;  // 1
		boolean bNo = false;  // 0
		// && : and
		System.out.println(bYes && bNo);
		
		// ||(filter 기호) : or
		System.out.println(bYes || bNo);
		
		// bYes1 or bYes2
		//    1  +  0     = 1
		//    0  +  1     = 1
		//    0  +  0     = 0
		//    1  +  0     = 2 (1이상은 무조건 true)
		
		// true  or  true  == true
		// true  or  false == true
		// false or  true  == true
		// false or false  == false 
		
		// 1   *   1    == 1
		//true and true == true
		
		// 1   *   0     
		// true and false  == false
		
		// 0   *   1    
		// false and true  == false
		
		// 0   *   0    
		// false and false  == false
		
		System.out.println("===========================================");
		System.out.println("t && t : " + (true && true));
		System.out.println("t && f : " + (true && false));
		System.out.println("f && t : " + (false && true));
		System.out.println("f && f : " + (false && false));
		System.out.println("===========================================");
		System.out.println("t || t : " + (true || true));
		System.out.println("t || f : " + (true || false));
		System.out.println("f || t : " + (false || true));
		System.out.println("f || f : " + (false || false));
		System.out.println("===========================================");
	}

}
