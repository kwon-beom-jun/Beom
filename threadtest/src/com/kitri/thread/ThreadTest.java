package com.kitri.thread;

public class ThreadTest {
	
	public static void main(String[] args) {
		
		Thread t1 = new ThreadExt("퐁");
		Thread t2 = new ThreadExt("당");
		Thread t3 = new ThreadExt("!!!");
		
		t1.start(); // 그냥 가져와 실행하면 일반 메소드가 되버림.
		t2.start();
		t3.start();
		
		System.out.println("프로그램 종료!!!");	 // 찍히는 이유.
		
	}
	
}