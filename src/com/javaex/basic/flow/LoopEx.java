package com.javaex.basic.flow;

import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
//		whileEx();
//		whilegugu();
//		dowhileEx();
//		forGugu();
		randomEx();
		
		

	}
	 private static void whileEx() {
		 //while (condition){}
		 // :condition이 참인 동안 블록을 반복
		 /*
		  * I like Java0
		  * I like Java1
		  * I like Java2
		  * I like Java3
		  * I like Java4
		  */
		 int i = 0;// 반복 제어 변수
		 while ( i < 5 ) {
			 System.out.println("I like Java"+ i);
			 //주의: 반복 제어변수를 잘 조정해야 한다
			 i += 1;
		 }
	 }
	 private static void whilegugu() {
		 // 단을 입력 받아서 해당 단의 구구표를 출력
	Scanner scanner= new Scanner(System.in);
	System.out.println("단을 입력하세요");
	System.out.println("단:");
		
		 int  dan = scanner.nextInt();
		 int i = 1;
		 while (i<=9) {
			 System.out.println(dan + "*" + i + "=" +(dan*i));
			 i+=1;
		 }
		 scanner.close();
	 }
	 private static void dowhileEx() {
		 // 입력받은 정수를 다 더한다
		 // 입력받은 정수가 0 이면 반복하지않는다
		 int total = 0; //합산변수
		 int value = 0; // 더해주는수, 반복제어 변수
		 
		 System.out.println("숫저를 입력하세요.[0이면 종료]");
		 
		 Scanner scanner = new Scanner(System.in);
		 
		 //최소 1번 실행
		 do {
			 value = scanner.nextInt();
			 total += value;
			 System.out.println("합계:"+total);
		 } while (value !=0);
		 
		scanner.close();
	 }
	 
	 private static void forGugu() {
	 // 단을 입력 받아서 해당 단의 구구표 를 출력
	 // (for loop)
	 // for (반복변수 초기화; 반복조건확인; 반복변수 증감)
	 
	 Scanner scanner =new Scanner(System.in);
	 System.out.println("단을 입력하세요");
		System.out.println("단:");
		int dan = scanner.nextInt();
		
		for (int i = 1; // 반복 변수 초기화
				i<=9;	// 반복 조건 체크
				++i) {  // 반복 변수 증감
			System.out.println(dan+"*"+i+"="+(dan*i));}
			
			scanner.close();
	
	 }
	 
	 private static void randomEx() {
		 // math 클래스 : 수학상수, 수학함수를 모아둔 클래스
		 // 1~45까지의 정수 난수 6개를 추출하는 예제
		 
		 // for문 버전
		 for (int i = 0; i < 6; i++) {
			 System.out.print((int)(Math.random() *45)+1);
			 System.out.print("\t");
		 }
		 System.out.println();
		
		 
		 // while문 버전
		 int i = 0;
		 
		 while (i<6) {
			 System.out.print((int)(Math.random() *45)+1);
			 System.out.print("\t");
			 ++i;
			 
		 }
	 }
	 
	 
	 
	 
	 
	 

}