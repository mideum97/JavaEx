package com.javaex.basic.reftypes;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
//		usingArray();
//		multiDimArrayEx();
//		arrayCopyForEx();
		arrayCopySystem();

	}

	private static void usingArray() {
		// 배열의 선언과 초기화, 사용
		// 선언
		String[] names; // Type[] 식별자
		int scores[]; // Type 식별자[]

		// 초기화
		names = new String[] { "김", "이", "박", "최" }; // 초기값이 있을때

		scores = new int[4];
		// 인덱스 접근
		// 0 부터 시작
		// .length - 1까지
		scores[0] = 80;
		scores[1] = 90;
		scores[2] = 85;
		scores[3] = 88;

		float heights[] = { 175.3f, 170.2f, 173.4f, 168.5f }; // 선언과 동시에 할때만 가능

		// names,scores, heights -> 같은 인덱스에 접근해서 확인
		for (int i = 0; i < names.length; ++i) {
			System.out.printf("%s(%.2f) :score = %d%n", names[i], heights[i], scores[i]);
		}

		// scores 배열이 있음
		int scores2[] = scores; // 찹조 복제
		// 참조 복제 -> 객체의 주소를 복사하는 것

		System.out.println("scores: " + Arrays.toString(scores));
		System.out.println("scores2: " + Arrays.toString(scores2));
		scores2[2] = 100;
		System.out.println("scores2:" + Arrays.toString(scores2));
		System.out.println("scores:" + Arrays.toString(scores));

	}

	private static void multiDimArrayEx() {
		// 5행 10열의 2차원 배열
		int[][] twoDimens = new int[5][10]; // 빈 2 차원 배열

		// 기본 데이터가 있을 경우
		int table[][] = { { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 }, { 2, 3, 4, 5, 6, 7, 8, 9, 0, 1 },
				{ 3, 4, 5, 6, 7, 8, 9, 0, 1, 2 }, { 4, 5, 6, 7, 8, 9, 0, 1, 2, 3 }, { 5, 6, 7, 8, 9, 0, 1, 2, 3, 4 }

		};
		System.out.println("table.length: " + table.length);
		// 인덱스 범위: table[0] ~ table[table.length - 1]
		System.out.println("table[0].length:" + table[0].length);
		// 인덱스 범위: table[0][0] ~ table[0][table[0].length - 1]

		// table 배열 내부의 모든 요소의 합을 구하자
		int sum = 0;
		for (int row = 0; row < table.length; ++row) { // 행 루프
			for (int col = 0; col < table[row].length; ++col) {// 열 루프
				int val = table[row][col];

				System.out.print(val + "\t");
				sum += val; // 내부 cell 데이터 합산
			}
			System.out.println();
		}
		System.out.println("합산 결과:" + sum);
	}

	private static void arrayCopyForEx() {
		// 배열은 크기 변경이 안된다
		// 새 배열을 생성하고 복사
		
		int source[] = { 1, 2, 3 };
		System.out.println("원본:" + Arrays.toString(source));

		// 7개의 빈공간이 더 필요
		int target[] = new int[10];
		// 복사
		
		for (int i = 0; i < source.length; ++i)
		{target[i] = source[i];}
		System.out.println("복사본:"+Arrays.toString(target));

	}

private static void arrayCopySystem() {
	//손쉬운 배열의 복제
	
	int[] source = {1,2,3};
	System.out.println("원본:"+
	Arrays.toString(source));
	
	int[] target= new int[10];
	
	// 복제
	System.arraycopy(source, //원본배열
			0, // 시작 인덱스
			target,  //타겟 배열
			4, //타겟 배열의 시작 인덱스
			source.length);// 복사할 길이
System.out.println("복사본: "+ Arrays.toString(target));
	
}
}
