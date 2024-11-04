package com.javaex.basic.flow;

import java.util.Scanner;

public class ConditionalEx {

	public static void main(String[] args) {
//		ifEx();
//		ifEx2();
		ifPractice01();

	}
	
	
	private static void ifEx() {
		
		Scanner scanner = new Scanner(System.in);
		
		//점수를 입력 받아서 60점 이상이면 합격입니다.
		System.out.print("점수를 입력하세요:");
		int score = scanner.nextInt();
		
		// if~ else ~
		if (score >= 60) {// 조건 만족시
			System.out.println("합격입니다.");
			
		} else {
			//조건 불만족시
			System.out.println("불합격입니다.");
		}
		scanner.close();
	}
	
	private static void ifEx2() {
		// if ~ else if ~ else ~
		// 정수 입력 받아서 양수, 0, 음수인지 판별
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하세요:");
		
		int num = scanner.nextInt();
		
		// 조건 1: 0 체크 -> 나머지: 양수 or 음수
		// 조건 2: 양수 체크 -> 나머지: 음수
		
		//일반적인 순차 조건 분기
		/*
		if (num == 0) {
			System.out.println("0입니다.");
			
		} else if (num > 0) {
			System.out.println("양수입니다.");
		} else {
			System.out.println("음수입니다.");
		}*/
		
		//중첩 if
		if (num == 0) {
			System.out.println("0입니다.");
		} else {
			// 양수 or 음수
			if (num > 0) {
				System.out.println("양수입니다.");
			} else {
				System.out.println("음수입니다.");
			}
		}
		
		
		scanner.close();
		
	}
	
	private static void ifPractice01() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("과목을 선택해주세요:");
		System.out.println("(1. 자바, 2. C, 3. C++, 4. 파이썬)");
		
		int num = scanner.nextInt();
		
		if(num == 1) {System.out.println("R101호 입니다.");}
		else if(num == 2){System.out.println("R202호 입니다.");}
		else if(num == 3){System.out.println("R303호 입니다.");}
		else if(num == 4){System.out.println("R404호 입니다.");}
		else {System.out.println("상담원에게 문의하세요.");}
		
		scanner.close();
	} 
	
}
