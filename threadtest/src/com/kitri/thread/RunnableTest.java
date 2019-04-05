package com.kitri.thread;

public class RunnableTest {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new RunnableImpl("퐁")); // 생성자는 Thread(runnable 타겟 = 내가 호출해야 하는 메소드가 어딨냐)을 가져감.
		Thread t2 = new Thread(new RunnableImpl("당")); 
		Thread t3 = new Thread(new RunnableImpl("!!!")); 
		
		t1.start(); // 그냥 가져와 실행하면 일반 메소드가 되버림.
		t2.start();
		t3.start();
		
		System.out.println("프로그램 종료!!!");	 // 찍히는 이유.
		
	}

}
