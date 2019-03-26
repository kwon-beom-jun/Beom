package com.kitri.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
  0. com, my 3�ڸ� �迭.
  1. com ���ڸ� ���� �߻�. >> comRandom() �޼ҵ� ����
	a. 1�� ���ڴ� �ߺ� ���� x
	b. 0�Ƿ� ���� x
  2. ���� �����
  3. ���� ��������
  4. �ٽ� ���� ����
  5. ���� �Է¼��� ���� �Է� ���� �ڸ� ��. �迭�� ��
  6. com�� my�� ���ڿ� �ڸ���
  7. ���ڰ� ���ٸ�
   5-1. �ڸ����� ���ٸ� strike ����
   5-2. �ڸ����� �ٸ��� ball ����
  6. 5�� ��� 
   6-1
  	strike�� 3 : 
  	x��°���� xxx�� �����Դϴ�.  
  	���(1), ����(0)
   6-2 strike�� 3�� �ƴ϶��
   	xxx�� x��Ʈ����ũ x���Դϴ�. >> 3������
*/


public class NumberBaseBall {
	
	private int my[] = new int[3];
	private int com[] = new int[3];
	private int my2[] = new int[1];
	BufferedReader in;
	int gCount = 0;
	
	public NumberBaseBall() {
		comRandom();
		in = new BufferedReader(new InputStreamReader(System.in));
	}
	
	private void comRandom() {
		
		for( ; ; ) {
			com[0] = (int)(Math.random() * 9) + 1;		
			com[1] = (int)(Math.random() * 9) + 1;		
			com[2] = (int)(Math.random() * 9) + 1;	
			
			if(com[0] == com[1] || com[0] == com[2] || com[1] == com[2]) {				
				
			}else {
				System.out.println(com[0] +""+ com[1] +""+ com[2]);
				break;
			}
	
		}
	}

	private void game() {
		while(true) {
			System.out.println("�����Է� : ");
			int myNum = getNumber();
			my[0] = myNum/100;	// 1	
			my[1] = myNum/10 - (myNum/100)*10;	// 4	
			my[2] = myNum - (myNum/10)*10;	// 9
			
			int count = 0;
			int ball = 0;
			int len = my.length;
			
			// ���ڿ� �ڸ��� ��
			
			if (my[0] == com[0]) {
				count++;
			}else if(my[0]==com[1]){
				ball++;
			}else if (my[0]==com[2]) {
				ball++;
			}
			if (my[1] == com[1]) {
				count++;
			}else if (my[1] == com[0]) {
				ball++;
			}else if (my[1]== com[2]) {
				ball++;
			}
			if (my[2] == com[2]) {
				count++;
			}else if (my[2]==com[1]) {
				ball++;
			}else if (my[2]==com[0]) {
				ball++;
			}
			
			System.out.println(count + "��Ʈ����ũ\t" + ball + "��");
			
			gCount++;
			
			while (true) { // 2���� ġ�� ����. // game�޼ҵ� ���� �ȵŴ� ����.
								
				if (count == 3) {
					System.out.println(gCount + "��°���� �����߽��ϴ�." + 
							com[0] + com[1] + com[2] +"�� �����Դϴ�.");
					System.out.println("���(1), ����(0)");

					my2[0] = getNumber();
					
					if (my2[0] == 1) {
						comRandom();
						gCount = 0;
						break;
						//game();
					}else if(my2[0] == 0){
						count = 0;
						exit();
					}else {
						System.out.println("�ٸ� ���ڸ� �����ֽñ� �ٶ��ϴ�.");
					}
					
				} else {
					System.out.println("���(1), ����(0)");

					my2[0] = getNumber();
					
					if (my2[0] == 0) {
						exit();
					}else if(my2[0] == 1){
						count = 0;
						break;
					}else {
						System.out.println("�ٸ� ���ڸ� �����ֽñ� �ٶ��ϴ�.");
					}
				}
			}
		}
	}
	
	
	private int getNumber() {
		int num = 0;
		try {
			num = Integer.parseInt(in.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;
	}
	
	public void exit(){
		System.exit(0);
	}

	
	public static void main(String[] args) {
		NumberBaseBall nbb = new NumberBaseBall();
		nbb.game();
	}

}

















