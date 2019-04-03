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
		return "[색상] " + getColor() + "\t[생산수량] " + getAccount() + "\t[용도] " + use + "\t[시리즈] " + series;
	}
	
	
}
