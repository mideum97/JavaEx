package com.javaex.basic.types;

// char (2) : 문자의 유니코드 값(부호 없는 정수)
public class CharEx {

	public static void main(String[] args) {
		char ch1 = 'A';
		char ch2 = '한';
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		System.out.println((int)ch1);
		System.out.println((int)ch2);
		
		// ch1의 4글자 뒤 
		char test = (char)(((int)ch1) + 4);
		System.out.println(test);
		
		// String형은 char의 집합
		// 가장 기본적인 찹조자료형
		String str = "Java Programming";
		System.out.println(str);
		
		

	}

}
