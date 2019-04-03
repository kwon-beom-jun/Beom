package com.kitri.util.jcf;

public class PlayerDto {
	
	private int number;
	private String name;
	private int position;
	private double grade;
	private String positionStr[] = {"지명타자", "투수", "포수", "1루수", "2루수", "3루수", "유격수", "좌익수", "중견수", "우익수"};
	
	public PlayerDto(int number, String name, int position, double grade) {
		super();
		this.number = number;
		this.name = name;
		this.position = position;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "PlayerDto [number=" + number + ", name=" + name + ", position=" + positionStr[position] + ", grade=" + grade + "]";
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public String[] getPositionStr() {
		return positionStr;
	}

	public void setPositionStr(String[] positionStr) {
		this.positionStr = positionStr;
	}
	
	
	
	
	
}
