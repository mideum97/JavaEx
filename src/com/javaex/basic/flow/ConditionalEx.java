package com.javaex.basic.flow;

import java.util.Scanner;

public class ConditionalEx {

	public static void main(String[] args) {
//		ifEx();
//		ifEx2();
//		ifPractice01();
//		switchEx();
//		switchEx2();
//		switchPractice();
//		condEx();
		condEx1();

	}

	private static void ifEx() {

		Scanner scanner = new Scanner(System.in);

		// 점수를 입력 받아서 60점 이상이면 합격입니다.
		System.out.print("점수를 입력하세요:");
		int score = scanner.nextInt();

		// if~ else ~
		if (score >= 60) {// 조건 만족시
			System.out.println("합격입니다.");

		} else {
			// 조건 불만족시
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

		// 일반적인 순차 조건 분기
		/*
		 * if (num == 0) { System.out.println("0입니다.");
		 * 
		 * } else if (num > 0) { System.out.println("양수입니다."); } else {
		 * System.out.println("음수입니다."); }
		 */

		// 중첩 if
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

		int subj = scanner.nextInt();

		if (subj == 1) {
			System.out.println("R101호 입니다.");
		} else if (subj == 2) {
			System.out.println("R202호 입니다.");
		} else if (subj == 3) {
			System.out.println("R303호 입니다.");
		} else if (subj == 4) {
			System.out.println("R404호 입니다.");
		} else {
			System.out.println("상담원에게 문의하세요.");
		}

		scanner.close();
	}

	private static void switchEx() {
		// ifPractice01 -> switch ~ case 문으로
		System.out.println("과목을 선택해주세요:");
		System.out.println("(1. 자바, 2. C, 3. C++, 4. 파이썬)");

		Scanner scanner = new Scanner(System.in);
		System.out.println("과목번호:");
		int subj = scanner.nextInt();

		// 변수 값에 따른 조건 분기
		switch (subj) {
		case 1: // subj == 1이면
			System.out.println("R101호 입니다.");
			break;// 잊지말자 break
		case 2: // subj == 2이면
			System.out.println("R202호 입니다.");
			break;
		case 3: // subj == 3이면
			System.out.println("R303호 입니다.");
			break;
		case 4: // subj == 4이면
			System.out.println("R404호 입니다.");
			break;
		default: // else
			System.out.println("상담원에게 문의하세요.");
			break;
		}

		scanner.close();
	}

	private static void switchEx2() {
		// 1, 3, 5, 7, 8, 10, 12월 ->30일
		// 2월 -> 28일
		// 4, 6, 9 ,11월 ->30일

		Scanner scanner = new Scanner(System.in);

		System.out.println("월을 입력하세요:");
		int month = scanner.nextInt();

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: // month ==1 OR month == 3 ...
			System.out.println(month + "월은 30일 입니다.");
			break;
		case 2:
			System.out.println(month + "월은 28일입니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month + "월은 31일입니다.");
			break;
		default:
			System.out.println(month + "월이 어딨어?");
			break;

		}
		scanner.close();
	}

	private static void switchPractice() {
		// TODO: 이코드를 나중에 enum (열거형) 객체로 다시 만들 예정

		// 문자열 변수에 문자열로 요일정보를 입력
		// "SUNDAY"-> 휴식
		// "MONDAY"~"THURSDAY"-> 열공
		// "FRIDAY" -> 열공후 불금
		// "SATURDAY"->주말

		String day = "MONDAY";
		String action;

		switch (day) {
		case "SUNDAY":
			action = "휴식";
			break;
		case "MONDAY":
		case "TUESDAY":
		case "WEDNESDAY":
		case "THURSDAY":
			action = "열공";
			break;
		case "SATURDAY":
			action = "주말";
			break;
		default:
			action = "난 누구지?";
			break;

		}
		System.out.println(day + "에는 " + action);
	}

	private static void condEx() {
		System.out.println("점수를 입력하세요");

		Scanner scanner = new Scanner(System.in);
		int mark = scanner.nextInt();
		if (mark %
				3 == 0) {
			System.out.println("3의 배수입니다");
		} else {
			System.out.println("은 3의 배수가 아닙니다");
		}
		scanner.close();
	}

	private static void condEx1() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("점수를 입력하세요");
		int marks = scanner.nextInt();

		if (marks >= 90) {
			System.out.println("A등급");
		} else if (marks >= 80) {
			System.out.println("B등급");
		} else if (marks >= 70) {
			System.out.println("C등급");
		} else if (marks >= 60) {
			System.out.println("D등급");
		} else {
			System.out.println("F등급");
		}
		scanner.close();
	}

}
