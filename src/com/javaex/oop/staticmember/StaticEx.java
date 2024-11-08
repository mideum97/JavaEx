package com.javaex.oop.staticmember;

//	static, instance, local
public class StaticEx {
	public static int refCount;	//	클래스 변수
	public static String classVar;	//	클래스 변수
	public String instanceVar;	//	인스턴스 변수
	
	//	클래스 변수를 초기화 하는 static 블록
	static {
		refCount = 0;	//	현재 인스턴스의 수
		classVar = "Static Member";
		System.out.println("Static Block calls");
//		instanceVar = "InstanceVar";
		//	static 영역에서는 static만 접근할 수 있다
	}
	
	//	생성자 : 인스턴스 생성시 초기화의 역할
	public StaticEx() {
		++refCount;
		System.out.println("생성자 호출");
		System.out.println("참조카운트:" + refCount);
	}
	
	//	소멸자
	@Override
	protected void finalize() throws Throwable {
		--refCount;
		super.finalize();
		System.out.println("소멸자 호출");
	}
}