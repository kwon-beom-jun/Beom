package com.kitri.thread;

public class ThreadExt  extends Thread{

	

	String msg;
	
	public ThreadExt(String msg) {
		this.msg = msg;
		
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
			System.out.println(msg);
		}
	}
	


}
