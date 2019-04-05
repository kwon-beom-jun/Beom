package com.kitri.thread;

public class RunnableImpl implements Runnable{

	String msg;
	
	public RunnableImpl(String msg) {
		this.msg = msg;
		
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
			System.out.println(msg);
		}
	}
	
	
}
