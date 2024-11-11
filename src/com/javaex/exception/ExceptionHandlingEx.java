package com.javaex.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingEx {

	public static void main(String[] args) {
//		arithExceptionEx();
		arrayExceptionEx();
		nullPointerExceptionEx();

	}

	private static arrayExceptionEx();{
		int[] intArray= new int[] {3,6,9};
		
		try {
		System.out.println(intArray[3]);
		} catch(ArrayIndexOutOFBoundsException e) {
			System.err.println("Error:"+e.getMessage());
		}
	}
	private static void nullPointerExceptionEx() {
		String str = new String("Hello Java");
		try {
		str = null;
		
		System.out.println(str.toUpperCase());
	}	catch(NullPointerException e) {
		System.err.println("널입니다.");
	}
	
	
	
	private static void arithExceptionEx() {
		// 스캐너에서 정수 입력
		// 100을 정수 나눈 값을 출력
		double result = 0;
		int num;

		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요:");
		try {
		// 예외 발생 가능영역
		num = scanner.nextInt();
		result = 100 / num;

		System.out.println(result);
		}catch(InputMismatchException e) {
			System.out.println("정수를 입력해 주세요.");
		}catch(ArithmeticException e){
			System.err.println("0으로는 나눌 수 없습니다.");
		}catch (Exception e) {
			// 가장 마지막에 남아 있는 예외 처리를 위해
			e.printStackTrace();
		}finally {
			// 예외 유무 관계없이 가장 마지막에 실행
			//자원 정리 등을 수행
			System.out.println("예외 처리 종료!");
		}
		scanner.close();
		System.out.println("프로그램 종료!");

	}

}
