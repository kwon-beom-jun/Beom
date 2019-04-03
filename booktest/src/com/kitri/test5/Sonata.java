package com.kitri.test5;

public class Sonata extends Car {
	
	
	private String use;
	private String series;

	public Sonata(String color, int account, String series, String use) {
		super(color, account);
		this.series = series;
		this.use = use;
	}
	
	@Override
	public String toString() {
		return "[����] " + getColor() + "\t[�������] " + getAccount() + "\t[�뵵] " + use + "\t[�ø���] " + series;
	}
	
	
}
