package com.kitri.thread;

public class RunnableTest {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new RunnableImpl("��")); // �����ڴ� Thread(runnable Ÿ�� = ���� ȣ���ؾ� �ϴ� �޼ҵ尡 �����)�� ������.
		Thread t2 = new Thread(new RunnableImpl("��")); 
		Thread t3 = new Thread(new RunnableImpl("!!!")); 
		
		t1.start(); // �׳� ������ �����ϸ� �Ϲ� �޼ҵ尡 �ǹ���.
		t2.start();
		t3.start();
		
		System.out.println("���α׷� ����!!!");	 // ������ ����.
		
	}

}
