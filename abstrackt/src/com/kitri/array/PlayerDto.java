package com.kitri.array;

// Dto : Data Transfer Object
// Vo : value Object
// Bean

public class PlayerDto {
	
	private int number; // ���ȣ
	private String name; // �̸�
	private int position;
	private double grade;
	private String positionStr[] = {"����Ÿ��", "����", "����", "1���", "2���", "3���", "���ݼ�", "���ͼ�", "�߰߼�", "���ͼ�"};
	
	
	
	
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
		return "PlayerDto [���ȣ= " + number + "\t������= " + name + "\t������= " + positionStr[position] + "\t" + (position != 1 ? "Ÿ��" : "�����") + " = " + grade + "]";
	}
	
	/*
	public String toposition(int position) {
		
		int i = position;
		
		String nposition[];
		nposition = new String[i];
		
		nposition[0] = "����Ÿ��";
		nposition[1] = "����";
		nposition[2] = "����";
		nposition[3] = "1���";
		nposition[4] = "2���";
		nposition[5] = "3���";
		nposition[6] = "���ݼ�";
		nposition[7] = "���ͼ�";
		nposition[8] = "�߰߼�";
		nposition[9] = "���ͼ�";
		
		return nposition[i];
				
	}
	*/
	
}
