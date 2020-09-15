package com.javaex.oop.Staticmember;

public class StaticApp {

	public static void main(String[] args) {
		StaticEx s1 = new StaticEX();
		// static 영역은 인스턴스화 하지 않아도 접근 가능
		System.out.println("참조 카운트:" + StaticEX.refcount);
		
		StaticEx s2 = new StaticEX();
		System.out.println("참조 카운트:" + StaticEx.refcount);

	
	}

}
