package com.javaex.oop.Staticmember;

public class StaticEx {
	public static int refcount; // 클래스 변수 - 공용 영역
	public static String classVAr; // 클래스 변수
	public String instanceVAr; // 인스턴스 변수
	
	// static 멤버는 instance 영역에 접근 불가
	// instance 영역에서는 static 멤버에 접근 가능
	// static 멤버는 인스턴스화 하지 않아도 접근 가능

	// static 영역은 클래스가 로드될 때 초기화 수행
	static {
		// static 영역 초기화
		classVAr = "Static 멤버";
		refcount = 0;
		System.out.println("Static 초기화");
		System.out.println(instanceVar); // static -> instance 접근 불가
		// static 영역ㅇ서는 static 멤버만 활용
	
	}
	
	// 생성자
	public Static() {
		// instance -> static 영역 접근 가능
		refcount ++;	// static 멤버
		System.out.println("참조 갯수:" + refcount);
		System.out.println("인스턴스 생성");
		
	}
	
}
