package com.javaex.reftypes;

public class ArrayEx {

	public static void main(String[] args) {
		defineArray();

	}
	
	public static void defineArray() {
		// 배열의 선언
		String[] name;  //  type[]
		int scores[];	//  식별자[]
		
		// 초기화
		name = new String[] {
				"김", "이", "박", "최"
		};
	
		scores = new int[4];	// 빈 배열
		
		// 인덱스 접근
		// 인덱스 범위 : 0 ~ length -1 (주의)
	
		scores[0] = 80;
		scores[1] = 90;
		scores[2] = 85;
		scores[3] = 88;
		
		
		// 값 목로이 이미 있다면
		int age[] = {
				28, 30, 25, 32
		};

		// 배열의 길이는 .length 속성으로 확인
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%s(%d세) - %d점%n",
					name[i], age[1], scores[i]);
		}
		
		// 참조형 자료형은 메모리 주소를 담고 있다
		int[] scores2 = scores;
		System.out.println(scores == scores2);
}
}
