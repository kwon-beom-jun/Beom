package com.kitri.array;

// Dto : Data Transfer Object
// Vo : value Object
// Bean

public class PlayerDto {
	
	private int number; // 등번호
	private String name; // 이름
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
	

	
	@Override
	public String toString() {
		return "PlayerDto [등번호= " + number + "\t선수명= " + name + "\t포지션= " + positionStr[position] + "\t" + (position != 1 ? "타율" : "방어율") + " = " + grade + "]";
	}
	
	/*
	public String toposition(int position) {
		
		int i = position;
		
		String nposition[];
		nposition = new String[i];
		
		nposition[0] = "지명타자";
		nposition[1] = "투수";
		nposition[2] = "포수";
		nposition[3] = "1루수";
		nposition[4] = "2루수";
		nposition[5] = "3루수";
		nposition[6] = "유격수";
		nposition[7] = "좌익수";
		nposition[8] = "중견수";
		nposition[9] = "우익수";
		
		return nposition[i];
				
	}
	*/
	
}
