package com.javaex.practice02;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		System.out.println("나이를 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		
		if(age<=19 && age <65)System.out.println("1번그룹입니다.");
		else System.out.println("2번그룹입니다.");
		
		
		scanner.close();
	}

}
